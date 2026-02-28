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


//Method for selecting the species for slot1
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


WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))


//Method for selecting the species for slot 2
genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)


WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/warning_icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Confirm'), 'Confirm to cancel')

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Are you sure you want to cancel the test'),
	'Are you sure you want to cancel the test ?')

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Confirm Are you sure you want to cancel_0fa396'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.verifyElementClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'))

