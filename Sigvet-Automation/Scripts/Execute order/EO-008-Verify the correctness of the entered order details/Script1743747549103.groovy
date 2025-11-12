import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import generic_Package.GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

//Set viewport size to 600x1024
//WebUI.setViewPortSize(600, 1024)
//WebUI.setViewPortSize(529, 916)
// Get the current web driver
//def driver = DriverFactory.getWebDriver()
// Execute JavaScript to set zoom level to 50%
//((JavascriptExecutor) driver).executeScript("document.body.style.zoom='80%'")
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))


WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', 
//    true)
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.doubleClick(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.doubleClick(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 
//    'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/warning_icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Confirm'), 'Confirm to cancel')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/warning_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_af09a5'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_d66057'))
WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))
WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))



//WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'))
String dropdown_Disabled_for_slot1 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'class')
assert dropdown_Disabled_for_slot1.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_af09a5_1'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_d66057_1'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))
WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))


//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine_1'))
String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'class')
assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 
    30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', 
    '111', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry', 
    30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value', 
    '777', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

