//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import org.openqa.selenium.By
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//
//import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://localhost:3000/')
//WebUI.delay(10)
//WebUI.setViewPortSize(1200, 1920)
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//try {
//	// Get all report rows
//	List<WebElement> reportRows = driver.findElements(By.xpath("//table/tbody/tr"))
//	
//	WebUI.delay(10)
//
//	assert reportRows.size() > 0 : "No reports found in the table."
//
//	println("Total reports found: ${reportRows.size()}")
//
//	// Verify repeated reports appear as separate rows
//	Map<String, Integer> reportCount = [:]
//	reportRows.each { row ->
//		String accessionNumber = row.findElement(By.xpath("./td[1]")).getText()
//		reportCount[accessionNumber] = reportCount.getOrDefault(accessionNumber, 0) + 1
//	}
//	
//	assert reportCount.values().any { it > 1 } : "Repeated reports do not appear as separate rows."
//	println(" Verified: Repeated reports appear as separate rows.")
//
//	// Verify sorting in reverse chronological order
//	List<Date> reportDates = []
//	reportRows.each { row ->
//		
//		String dateText = row.findElement(By.xpath("./td[5]")).getText().trim()
//		println(dateText)
//		if (dateText && !dateText.equalsIgnoreCase("N/A")) {
//			reportDates.add(Date.parse("MMM dd, yyyy hh:mm a", dateText))
//		}
//	}
//
//	List<Date> sortedDates = reportDates.clone()
//	sortedDates.sort { a, b -> b.compareTo(a) }
//
//	assert reportDates == sortedDates : "Reports are not sorted in reverse chronological order."
//	println("Verified: Reports are sorted in reverse chronological order.")
//
//} catch (AssertionError e) {
//	//println("Test Failed: " + e.message)
//	KeywordUtil.markFailed("Sorting validation failed: " + e.message)
//} finally {
////	WebUI.closeBrowser()
//}
//



import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import java.text.SimpleDateFormat

// Step 1 - Open browser and navigate
WebUI.openBrowser('')
WebUI.navigateToUrl('http://localhost:3000/')
WebUI.delay(10)
WebUI.setViewPortSize(1200, 1920)

// Step 2 - Click on HISTORY button
WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))
WebUI.delay(3)

// Step 3 - Scroll to the bottom
String scrollScript = '''
return new Promise(resolve => {
    const el = document.querySelector('.overflow-y-auto');
    if (!el) return resolve({ error: 'Element not found' });
    let lastScrollTop = -1;
    const scrollStep = 300;
    const interval = setInterval(() => {
        el.scrollBy(0, scrollStep);
        if (el.scrollTop === lastScrollTop) {
            clearInterval(interval);
            resolve({ message: 'Reached bottom' });
        } else {
            lastScrollTop = el.scrollTop;
        }
    }, 200);
});
'''

def scrollResult = WebUI.executeJavaScript(scrollScript, [])
println('Scroll result: ' + scrollResult)
WebUI.comment('Scroll result: ' + scrollResult)
WebUI.delay(3) // Optional wait to ensure table updates after scroll

// Step 4 - Get report rows after scroll
WebDriver driver = DriverFactory.getWebDriver()

try {
	List<WebElement> reportRows = driver.findElements(By.xpath("//table/tbody/tr"))
	WebUI.delay(3)

	assert reportRows.size() > 0 : "No reports found in the table."
	println("Total reports found after scrolling: ${reportRows.size()}")
	WebUI.comment("Total reports found after scrolling: ${reportRows.size()}")

	// Step 5 - Verify repeated reports appear as separate rows
	Map<String, Integer> reportCount = [:]
	reportRows.each { row ->
		String accessionNumber = row.findElement(By.xpath("./td[1]")).getText().trim()
		reportCount[accessionNumber] = reportCount.getOrDefault(accessionNumber, 0) + 1
	}

	assert reportCount.values().any { it > 1 } : "Repeated reports do not appear as separate rows."
	println("Verified: Repeated reports appear as separate rows.")
	WebUI.comment("Verified: Repeated reports appear as separate rows.")

	// Step 6 - Verify sorting in reverse chronological order
	List<Date> reportDates = []
	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm a")

	reportRows.each { row ->
		String dateText = row.findElement(By.xpath("./td[5]")).getText().trim()
		println("Date Text: ${dateText}")
		if (dateText && !dateText.equalsIgnoreCase("N/A")) {
			reportDates.add(sdf.parse(dateText))
		}
	}

	List<Date> sortedDates = reportDates.clone()
	sortedDates.sort { a, b -> b.compareTo(a) }

	assert reportDates == sortedDates : "Reports are not sorted in reverse chronological order."
	println("Verified: Reports are sorted in reverse chronological order.")
	WebUI.comment("Verified: Reports are sorted in reverse chronological order.")

} catch (AssertionError e) {
	KeywordUtil.markFailed("Validation failed: " + e.message)
} finally {
	WebUI.closeBrowser()
}
