//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import org.openqa.selenium.By
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://localhost:3000/')
//
//WebUI.delay(10)
//
//WebUI.setViewPortSize(1200, 1920)
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))
//
//// Get WebDriver instance
//WebDriver driver = DriverFactory.getWebDriver()
//
//// Define table XPath
//String tableXPath = '//table/tbody/tr'
//
//// Get all rows in the table
//List<WebElement> rows = driver.findElements(By.xpath(tableXPath))
//
//int count = 0
//
//for (WebElement row : rows) {
//    // Get all columns (cells) in the row
//    List<WebElement> cells = row.findElements(By.tagName('td'))
//
//    String nucleusStatus = (cells[5]).getText()
//
//    if (nucleusStatus.equals('Uploaded')) {
//       
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/Uploaded_nucleus_status'),30)
//		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Uploaded_nucleus_status'), 'Uploaded')
//		
//        count++
//				
//    } else if (nucleusStatus.equals('N/A')) {
//        //continue
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/N-A_Nucleus_status'),30)
//		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/N-A_Nucleus_status'), 'N/A')
//    }
//	else if (nucleusStatus.equals('RE-UPLOAD')) 
//		{
//			WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/Reuploaded_nucleus_status'),30)
//			WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Reuploaded_nucleus_status'), 'RE-UPLOAD')
//		}
//}




//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.webui.driver.DriverFactory
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.By
//import com.kms.katalon.core.util.KeywordUtil
//
//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://localhost:3000/')
//WebUI.delay(10)
//WebUI.setViewPortSize(1200, 1920)
//
//// Open History tab
//WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))
//
//// Get driver instance
//WebDriver driver = DriverFactory.getWebDriver()
//String tableXPath = '//table/tbody/tr'
//
//// Loop until table fully scrolled
//boolean reachedBottom = false
//while (!reachedBottom) {
//	List<WebElement> rows = driver.findElements(By.xpath(tableXPath))
//
//	for (WebElement row : rows) {
//		List<WebElement> cells = row.findElements(By.tagName('td'))
//
//		if (cells.size() > 5) {
//			String orderStatus = cells[3].getText().trim()
//			String nucleusStatus = cells[5].getText().trim()
//
//			KeywordUtil.logInfo("Order Status: " + orderStatus + " | Nucleus Status: " + nucleusStatus)
//
//			// ✅ Validation rules
//			if (orderStatus.equalsIgnoreCase("Completed")) {
//				if (nucleusStatus.equals("Uploaded") || nucleusStatus.equals("RE-UPLOAD")) {
//					KeywordUtil.logInfo("✅ Valid mapping: Completed → " + nucleusStatus)
//				} else {
//					KeywordUtil.markFailed("❌ Invalid mapping: Completed order has Nucleus Status = " + nucleusStatus)
//				}
//			}
//			else if (orderStatus.equalsIgnoreCase("Failed") || orderStatus.equalsIgnoreCase("Canceled")) {
//				if (nucleusStatus.equals("N/A")) {
//					KeywordUtil.logInfo("✅ Valid mapping: " + orderStatus + " → N/A")
//				} else {
//					KeywordUtil.markFailed("❌ Invalid mapping: " + orderStatus + " order has Nucleus Status = " + nucleusStatus)
//				}
//			}
//			else {
//				KeywordUtil.logInfo("⚠ Skipping row: Order Status = " + orderStatus + " (not part of rule check)")
//			}
//		}
//	}
//
//	// Scroll step
//	String scrollScript = '''
//        const el = document.querySelector('.overflow-y-auto');
//        if (!el) return 'Element not found';
//        let lastScrollTop = el.scrollTop;
//        el.scrollBy(0, 300);
//        return (el.scrollTop === lastScrollTop) ? 'Reached bottom' : 'Scrolling';
//    '''
//	def scrollResult = WebUI.executeJavaScript(scrollScript, [])
//	KeywordUtil.logInfo("Scroll Result: " + scrollResult)
//
//	if (scrollResult.toString().contains("Reached bottom")) {
//		reachedBottom = true
//	}
//}


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')
WebUI.navigateToUrl('http://localhost:3000/')
WebUI.delay(10)
WebUI.setViewPortSize(1200, 1920)

// Open History tab
WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

// Get driver instance
WebDriver driver = DriverFactory.getWebDriver()
String tableXPath = '//table/tbody/tr'

// Row counter
int rowCount = 0
int maxRows = 50

boolean reachedBottom = false
while (!reachedBottom && rowCount < maxRows) {
	List<WebElement> rows = driver.findElements(By.xpath(tableXPath))

	for (WebElement row : rows) {
		if (rowCount >= maxRows) {
			KeywordUtil.logInfo("✅ Stopping after processing " + maxRows + " rows")
			reachedBottom = true
			break
		}

		List<WebElement> cells = row.findElements(By.tagName('td'))

		if (cells.size() > 5) {
			String orderStatus = cells[3].getText().trim()
			String nucleusStatus = cells[5].getText().trim()

			KeywordUtil.logInfo("Row " + (rowCount+1) + " → Order: " + orderStatus + " | Nucleus: " + nucleusStatus)

			// ✅ Validation rules
			if (orderStatus.equalsIgnoreCase("Completed")) {
				if (nucleusStatus.equals("Uploaded") || nucleusStatus.equals("RE-UPLOAD")) {
					KeywordUtil.logInfo("   ✅ Valid mapping: Completed → " + nucleusStatus)
				} else {
					KeywordUtil.markFailed("   ❌ Invalid mapping: Completed order has Nucleus Status = " + nucleusStatus)
				}
			}
			else if (orderStatus.equalsIgnoreCase("Failed") || orderStatus.equalsIgnoreCase("Canceled")) {
				if (nucleusStatus.equals("N/A")) {
					KeywordUtil.logInfo("   ✅ Valid mapping: " + orderStatus + " → N/A")
				} else {
					KeywordUtil.markFailed("   ❌ Invalid mapping: " + orderStatus + " order has Nucleus Status = " + nucleusStatus)
				}
			}
			else {
				KeywordUtil.logInfo("   ⚠ Skipping row: Order Status = " + orderStatus + " (not part of rule check)")
			}

			rowCount++
		}
	}

	// Only scroll further if < 50 rows processed
	if (rowCount < maxRows) {
		String scrollScript = '''
            const el = document.querySelector('.overflow-y-auto');
            if (!el) return 'Element not found';
            let lastScrollTop = el.scrollTop;
            el.scrollBy(0, 300);
            return (el.scrollTop === lastScrollTop) ? 'Reached bottom' : 'Scrolling';
        '''
		def scrollResult = WebUI.executeJavaScript(scrollScript, [])
		KeywordUtil.logInfo("Scroll Result: " + scrollResult)

		if (scrollResult.toString().contains("Reached bottom")) {
			reachedBottom = true
		}
	}
}





