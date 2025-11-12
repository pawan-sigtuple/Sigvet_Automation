import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

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
//    String orderStatus = (cells[3]).getText()
//
//    if (orderStatus.equals('Completed')) {
//        row.click()
//
//        WebUI.click(findTestObject('Hemacyte/History/img (1)'))
//
//        count++
//
//        if (count == 5) {
//            break
//        }
//        //row.click()
//        //Logic to verify the failed report pop-up goes here
//    } else if ((((orderStatus.equals('Failed') || orderStatus.equals('Cancelled')) || orderStatus.equals('Maintainance')) || 
//    orderStatus.equals('Qc_checks')) || orderStatus.equals('Cancelling')) {
//        continue
//    }
//}

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

// Get WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Define table XPath
String tableXPath = '//table/tbody/tr'

// Get all rows in the table
List<WebElement> rows = driver.findElements(By.xpath(tableXPath))

int count = 0

for (WebElement row : rows) {
    // Get all columns (cells) in the row
    List<WebElement> cells = row.findElements(By.tagName('td'))

    String orderStatus = (cells[3]).getText()

    if (orderStatus.equals('Completed')) {
        row.click()

        WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (1)'))

        count++ //		if(count==5)
        //		{
        //			break;
        //		}			
        //		continue;
        //Logic to verify the failed report pop-up goes here
    } else if (orderStatus.equals('Canceled')) {
        row.click()
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/img_NA_mdw-12'),
			30)
		
		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_Canceled'), 'Canceled')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/p_The cancellation was initiated by the user'),
			30)
		
		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/p_The cancellation was initiated by the user'),
			'The cancellation was initiated by the user')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/button_OK'), 30)
		
		WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/History/button_OK'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/button_OK'), 'OK')
		
		WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_OK'))
		
		
    } 
	else if (orderStatus.equals('Failed')) 
	{
		row.click()
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/img_NA_mdw-12'),
			30)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/h1_Failed'), 30)
		
		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_Failed'), 'Failed')
		
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/p_Error code 114-000--3-1U2-143-0-S-JO. con_dc95aa'),
//			30)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/button_OK'), 30)
		
		WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/History/button_OK'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/button_OK'), 'OK')
		
		WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_OK'))
		
    }
	else if(orderStatus.equals('Maintainance') || orderStatus.equals('Qc_checks') || orderStatus.equals('Cancelling')) 
	{
		continue
	}
}



