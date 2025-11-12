import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))
//
//WebUI.click(findTestObject('Page_HemaCYTE/slot_1_accession_number'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline'), 'canine', true)
//
////WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
//WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))
//
//WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_t'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline_1'), 'canine', true)
//
////WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))
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

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

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

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 
    30)

//WebUI.getAttribute(findTestObject('Page_HemaCYTE/slot_1_accession_number'), 'value')

//WebUI.verifyElementAttributeValue(findTestObject('Page_HemaCYTE/slot_1_accession_number'), 'value', '111', 30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', '111', 30)


WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry', 
    10)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value', 
    '777', 20)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

