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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'),
	30)

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_9'))

GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')


//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'),
//	'canine', true)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'))

//checking flow
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Generating report'), 'Generating report...')

//WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 'Test completed')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))


WebUI.delay(2);

	String Exp_blue_colorCode= "rgba(0, 123, 255, 1)" // these Color codes are as per the requirement 
	String Exp_red_colorCode= "rgba(224, 43, 29, 1)"
	String Exp_black_colorCode= "rgba(0, 0, 0, 1)"
	
	
	WebDriver driver = DriverFactory.getWebDriver();
	
	// Define table XPath
	
	// Get all rows in the table
	List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'overflow-y-auto')]/div"))
//	String Exp_blue_colorCode='rgba(0, 123, 255, 1)'
//	String Exp_red_colorCode='rgba(224, 43, 29, 1)'
//	String Exp_black_colorCode='rgba(0, 0, 0, 1)'
	
	for(WebElement row:rows)
	{
		List<WebElement> cells = row.findElements(By.tagName('p'))
		
		String Item = (cells[0]).getText() // Column 1: fetching Item name in a row
		
	String Result = (cells[1]).getText()// fetching Result in a row

	String Unit = (cells[2]).getText()// column 3: unit

	String Range = (cells[3]).getText()// Column 4: range
	
	item_actual_Font_Color = cells.get(0).getCssValue("color")
	println(item_actual_Font_Color)
	
	// Regex: Matches integers or decimals (e.g., 100 or 999.99)
	/* Regex Breakdown
^\d+ — Starts with one or more digits.

(\.\d+)? — Optional decimal part (a period followed by one or more digits).

$ — End of the string.
	 */
	
	if (Result ==~ /^\d{1,3}(\.\d{1,2})?$/) {
		println("result is in VALID format (integer or decimal)")
	} else {
		println("result is NOT in valid number format")
	}
	

	try {
		float resultValue = Float.parseFloat(Result)
		println("Parsed result: " + resultValue)
		
		println(Item+" "+resultValue)
		//TestObject ref_range_ele=findTestObject('Object Repository/Page_HemaCYTE/p_5.1-8.5')
		//String ref_range_value=WebUI.getText(findTestObject('Object Repository/Page_HemaCYTE/p_5.1-8.5'))
		//WebUI.comment(ref_range_value)
		def ref_range = Range.split("-")
		//WebUI.comment("Lower limit:"+ref_range[0])
		//WebUI.comment("Upper limit:"+ref_range[1])
		
		float lowerLimit=Float.parseFloat(ref_range[0])
		float upperLimit=Float.parseFloat(ref_range[1])
		
		WebUI.comment(item_actual_Font_Color)
		
		// Verifying the colour of the mesurand/item when the result is lower than the ref range
		
		if (resultValue < lowerLimit)
			{
		
		if(item_actual_Font_Color==Exp_blue_colorCode)
		{
			KeywordUtil.markPassed("Assertion Passed: Color code Values Matched for " +Item)
		
		}
		else {
			KeywordUtil.markFailed("Assertion Failed for blue: Values not matched for "+Item)
			WebUI.comment("Actual_color_code for "+Item+"is "+item_actual_Font_Color+" but Expected is "+Exp_blue_colorCode)
			
		}
		}
		
		//Verifying the colour of the mesurand/item when the result is greater than the ref range
		else if (resultValue > upperLimit)
			{
		
		if(item_actual_Font_Color==Exp_red_colorCode)
		{
			KeywordUtil.markPassed("Assertion Passed: Values Matched for "+Item)
			//WebUI.comment("Actual_color_code for "+Item+"is "+item_actual_Font_Color+" but Expected is "+Exp_red_colorCode)
		
		}
		else {
			KeywordUtil.markFailed("Assertion Failed for red: Values not matched for "+Item)
			WebUI.comment("Actual_color_code for "+Item+"is "+item_actual_Font_Color+" but Expected is "+ Exp_red_colorCode)
			
		}
		}
		
		//Verifying the colour of the mesurand/item when the result is within a ref range
		else if(item_actual_Font_Color==Exp_black_colorCode)
			{
				KeywordUtil.markPassed("Assertion Passed: Values Matched for "+Item)
			
			}
			else {
				KeywordUtil.markFailed("Assertion Failed for black: Values not matched for "+Item)
				WebUI.comment("Actual_color_code for "+Item+"is "+item_actual_Font_Color+" but Expected is "+Exp_black_colorCode)
				
			}
	} 
		catch (NumberFormatException e) {
		println("Invalid or empty result value: " + Result)
	}
	
//	float resultValue = Float.parseFloat(Result)
	
	
	
	
}
	
	
	
	
	
	
	