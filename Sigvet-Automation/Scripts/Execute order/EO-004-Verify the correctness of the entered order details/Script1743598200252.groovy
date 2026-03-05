import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

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


GenericClass genericClass = new GenericClass()
//Method for selecting the species drop down for slot 1
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt1'))


WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/CBC For slot1'))


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

//Method for selecting the species drop down for slot 2
genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt2'))

WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/RETIC For slot2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))


//Verfiy the entered values of pet names in the field

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 
    30)


WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry', 
    10)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value',   '777', 20)

//Verify the selection of species 
WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

//Verfiy the selection of the panel type 

WebUI.verifyElementText(findTestObject('Object Repository/Panel type/Page_HemaCYTE/Verify CBC Selected in the slot1'), 'CBC')


WebUI.verifyElementText(findTestObject('Object Repository/Panel type/Page_HemaCYTE/Verify RETIC selected in the slot2'), 'RETIC')
