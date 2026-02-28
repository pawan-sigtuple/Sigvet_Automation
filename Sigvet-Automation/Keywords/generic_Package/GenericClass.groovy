//package generic_Package
//
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.testobject.ConditionType
//import org.openqa.selenium.*
//import org.openqa.selenium.support.ui.WebDriverWait
//import org.openqa.selenium.support.ui.ExpectedConditions
////import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.common.WebUiCommonHelper
////import com.kms.katalon.core.testobject.TestObject
//import java.time.Duration
//import org.openqa.selenium.JavascriptExecutor
//
//import org.openqa.selenium.WebDriver

package generic_Package

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import java.time.Duration

//
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.testobject.ConditionType
//import com.kms.katalon.core.webui.common.WebUiCommonHelper
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.By
//import org.openqa.selenium.JavascriptExecutor
//import org.openqa.selenium.support.ui.WebDriverWait
//import org.openqa.selenium.support.ui.ExpectedConditions
//import java.time.Duration

public void selectSpeciesFromDropDown(String Slot_Num, String Species) {
	WebDriver driver = DriverFactory.getWebDriver()
	String slotNum = Slot_Num.equals("Slot_1") ? "1" : "3"

	// Step 1: Wait and click the Species dropdown trigger button
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15))
	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		"(//img[@alt='ArrowDown'])[" + slotNum + "]"
	)))
	dropdown.click()

	// Step 2: Wait for options to appear
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		"//div[normalize-space(text())='" + Species + "']"
	)))

	// Step 3: Click the matching option
	WebElement option = driver.findElement(By.xpath(
		"//div[normalize-space(text())='" + Species + "']"
	))
	option.click()
}
 




		







	
	
//public class GenericClass {
//	
//		// Get the driver inside a method to ensure the browser is already open
//		WebDriver getDriver() {
//			return DriverFactory.getWebDriver()
//		}
//	
//		public void selectSpeciesFromDropDown(String Slot_Num, String Species) {
//			WebDriver driver = getDriver()
//			List<WebElement> dropdowns = driver.findElements(By.xpath("//label[text()='Species']/following::div[contains(@class,'cursor-pointer') and contains(@class,'bg-white')]"))
//			
//			if (dropdowns.size() > 0) {
//				if (Slot_Num.equals("Slot_1")) {
//					dropdowns[0].click()
//				} else if (Slot_Num.equals("Slot_2") && dropdowns.size() > 1) {
//					dropdowns[1].click()
//				}
//	
//				List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'overflow-y-auto')]//div[contains(@class,'cursor-pointer')]"))
//				for (WebElement option : options) {
//					String optionText = option.getText().trim()
//					if (optionText.equalsIgnoreCase(Species)) {
//						option.click()
//						break
//					}
//				}
//			}
//		}



	public boolean verifyPresencOfUIElementsInHeader() {
		WebDriver driver = DriverFactory.getWebDriver()
		boolean flag
		boolean wifi_icon_presence_status=driver.findElement(By.xpath('//img[@alt="Wifi Icon"]')).isDisplayed()
		boolean power_icon_presence_status=driver.findElement(By.xpath('//img[@alt="Power Icon"]')).isDisplayed()
		String Product_name=driver.findElement(By.xpath('//h1[text()="AlphaCYTE"]')).getText()
		String Expected_product_name = "AlphaCYTE"

		if(wifi_icon_presence_status && power_icon_presence_status && Product_name.equals(Expected_product_name)) {
			flag=true;
		}

		else{
			flag=false;
			WebUI.comment("Wifi icon dispaly status is ${wifi_icon_presence_status}")
			WebUI.comment("power icon dispaly statsu is ${power_icon_presence_status}")
			WebUI.comment("Actual Product name is:${Product_name} but Expected is ${Expected_product_name}")
		}
		return flag
	}


	//	public void verifyListGettingFilteredBasedOnSearchKeyword(String SearchKeyword) {
	//		boolean flag
	//		List<WebElement> Acc_num_col=driver.findElements(By.xpath("//tbody/tr/td[1]"))
	//		List<WebElement> Petname_col=driver.findElements(By.xpath("//tbody/tr/td[2]"))
	//
	//		List<WebElement> order_row = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_row'),
	//				30)
	//
	//		if (order_row != null) {
	//			// Scroll the container to the bottom
	//			String scrollScript = """
	//return new Promise(resolve => {
	// const el = document.querySelector('.overflow-y-auto');
	// if (!el) return resolve({ error: 'Element not found' });
	// let lastScrollTop = -1;
	// const scrollStep = 300;
	// const interval = setInterval(() => {
	//   el.scrollBy(0, scrollStep);
	//   if (el.scrollTop === lastScrollTop) {
	//     clearInterval(interval);
	//     resolve({ message: 'Reached bottom' });
	//   } else {
	//     lastScrollTop = el.scrollTop;
	//   }
	// }, 300);
	//});
	//"""
	//			def scrollResult = WebUI.executeJavaScript(scrollScript, [])
	//			println("Scroll result: " + scrollResult)
	//			// After scrolling, get all table row data
	//			String extractDataScript = """
	//const rows = document.querySelectorAll('.overflow-y-auto table tbody tr');
	//const result = [];
	//rows.forEach(row => {
	// const cells = Array.from(row.querySelectorAll('td')).map(td => td.textContent.trim());
	// result.push(cells);
	//});
	//return result;
	//"""
	//			def tableData = WebUI.executeJavaScript(extractDataScript, [])
	//			//println(tableData)
	//			println("Extracted table data:")
	//			int rowNum = 1
	//			tableData.each { row ->
	//				println("Row ${rowNum++}: " + row)
	//			}
	//
	//			for(List data:tableData) {
	//				String Acc_num=data[0]
	//				String Petname=data[1]
	//				if(Acc_num.contains(SearchKeyword) || Petname.contains(SearchKeyword)) {
	//					flag=true
	//					WebUI.comment("Found a match for a serached keyword")
	//				}
	//				else {
	//					WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_No matches found'), 'No matches found')
	//					WebUI.comment("No matches found for a serached keyword")
	//				}
	//			}
	//
	//
	//		} else {
	//
	//			WebUI.comment('No orders found.')
	//		}
	//	}

	public void enterSearchKeywordIntoTheField(String Keyword) {

		WebElement serach_field=driver.findElement(By.xpath("//input[@placeholder='Search by accession number, pet name']"))
		serach_field.clear()
		serach_field.sendKeys(Keyword)
	}

	public void verifyListGettingFilteredBasedOnSearchKeyword(String SearchKeyword) {
		boolean matchFound = false

		List<WebElement> order_row = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_row'), 30)

		if (order_row != null && !order_row.isEmpty()) {
			// Scroll to bottom
			String scrollScript = """
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
 }, 300);
});
"""
			def scrollResult = WebUI.executeJavaScript(scrollScript, [])
			println("Scroll result: " + scrollResult)

			// Extract table data
			String extractDataScript = """
const rows = document.querySelectorAll('.overflow-y-auto table tbody tr');
const result = [];
rows.forEach(row => {
 const cells = Array.from(row.querySelectorAll('td')).map(td => td.textContent.trim());
 result.push(cells);
});
return result;
"""
			def tableData = WebUI.executeJavaScript(extractDataScript, [])
			println("Extracted table data:")
			int rowNum = 1
			tableData.each { row ->
				println("Row ${rowNum++}: " + row)
				String Acc_num = row[0]
				String Petname = row[1]
				if (Acc_num.contains(SearchKeyword) || Petname.contains(SearchKeyword)) {
					matchFound = true
				}
			}

			if (matchFound) {
				WebUI.comment("✅ Match found for searched keyword: " + SearchKeyword)
			} else {
				WebUI.comment("❌ No matches found for searched keyword")
			}
		} 
		else {
			WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_No matches found'), 'No matches found')
			WebUI.comment('❌ No order rows found in the table.')
		}
	}

	
	
	
	
