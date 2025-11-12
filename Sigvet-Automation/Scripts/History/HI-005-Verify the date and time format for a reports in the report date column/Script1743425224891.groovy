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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.util.List as List
import java.text.ParseException

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)
WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/th_REPORT DATE'), 'REPORT DATE')


List<WebElement> report_date_row =WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Report_Date_column'), 30)


// Method to verify Date and time format

for(WebElement report_date:report_date_row)
	{
		String extractedDate=report_date.getText();
//String extractedDate = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/Report_Date_column'))

println('Extracted Date/time: ' + extractedDate)
String expectedFormat = 'MMM dd, yyyy hh:mm a'

if (isValidDateFormat(extractedDate, expectedFormat)) {
	println('Date and Time format is valid: ' + extractedDate)
	break;
	
} else {
	println((('Invalid Date and Time format!-- Expected: ' + expectedFormat) + ', but found: ') + extractedDate)
	continue;
}
}
boolean isValidDateFormat(String dateStr, String format) {
	try {
		SimpleDateFormat sdf = new SimpleDateFormat(format)

		sdf.setLenient(false)

		sdf.parse(dateStr)

		return true
	}
	catch (Exception e) {
		return false
	}
}