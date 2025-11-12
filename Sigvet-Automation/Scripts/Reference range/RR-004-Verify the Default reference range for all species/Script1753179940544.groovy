import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

import generic_Package.Reference_rangeClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_SETTINGS'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'))

Reference_rangeClass ref_range = new Reference_rangeClass()

WebUI.delay(2)

//------------The Default reference range for Canine
ref_range.selectSpeciesFromDropDown('Canine')

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'))

WebUI.sendKeys(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'), Keys.chord(
	Keys.COMMAND, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'), Keys.chord(
	Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/img_Space_w-full h-full'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'), 'RESET TO DEFAULT')

WebUI.verifyElementClickable(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/img_CLOSE_mdh-3rem mdw-3rem'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/div_Reset to Default'), 'Reset to Default')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/div_Are you sure you want to reset the refe_70b968'), 
    'Are you sure you want to reset the reference ranges?')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_YES'), 'YES')

WebUI.verifyElementClickable(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_YES'))

Map<String, Map<String, String>> default_ref_range_after_reset =ref_range.getReferenceRangeValues()
WebUI.comment("${default_ref_range_after_reset}")


Map<String, Map<String, String>> Expected_Default_refRange=ref_range.getExpectedDefultReferenceRange('Canine')
ref_range.checkResetToDefaultFunctionality(default_ref_range_after_reset,Expected_Default_refRange)


//----------------------The Default reference range for Feline
ref_range.selectSpeciesFromDropDown('Feline')

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'))

WebUI.sendKeys(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'), Keys.chord(
	Keys.COMMAND, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Reference range/Page_HemaCYTE/input_Canine_w-74px h-30px text-start mdpl-_b88416'), Keys.chord(
	Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/img_Space_w-full h-full'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'), 30)

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_YES'))

Map<String, Map<String, String>> default_ref_range_after_reset_feline =ref_range.getReferenceRangeValues()
WebUI.comment("${default_ref_range_after_reset_feline}")

Map<String, Map<String, String>> Expected_Default_refRange_feline=ref_range.getExpectedDefultReferenceRange('Feline')
ref_range.checkResetToDefaultFunctionality(default_ref_range_after_reset_feline,Expected_Default_refRange_feline)