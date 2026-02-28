import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods1 = new GenericClass()


assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

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

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_Canine_for_Slot1'))
//WebUI.selectOptionByValue(findTestObject('Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'), 'Canine', true)


GenericClass genericClass = new GenericClass()
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)


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

//WebUI.click(findTestObject('Executed order/Page_HemaCYTE/select_SpeciesFelineCanine_1'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_Feline_for_Slot2'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 
//    'Feline', true)

genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/h2_Prepare the cartridge(s)'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/h2_Prepare the cartridge(s)'),'Prepare the cartridge(s)')

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/h1_HemaCYTE'))
WebUI.verifyElementText(findTestObject('Hemacyte/History/h1_AlphaCYTE'), 'AlphaCYTE')

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/h2_Hematology'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/h2_Hematology'), 'Hematology')
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/div_Prepare the cartridgesSlot1Pet NameAcce_2ad88c'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/h3_Note'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/h3_Note'), 'Note :')



WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_1. Place the cartridge(s) in their designated slots'), 'Place the cartridge(s) in their designated slots.')

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/p_2. Select Next to insert the tray into the device'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_2. Select Next to insert the tray into the device'), 'Select "Next" to insert the tray into the device.')

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

String dropdown_Disabled = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 
    'class')

assert dropdown_Disabled.contains('cursor-not-allowed') == true : 'Element is clickable'

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'), 'NEXT')

