import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import generic_Package.GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

GenericClass genericClass = new GenericClass()
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))


//Method for selecting the species for slot 2
genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))




WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Slot 1'), 'Slot 1')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name'), 'Pet name')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number'), 'Accession number')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species'), 'Species')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name_1'), 'Pet name')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number_1'), 'Accession number')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species_1'), 'Species')

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Generating report'), 'Generating report...')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

import com.kms.katalon.core.model.FailureHandling
boolean queuedVisible = WebUI.waitForElementVisible(
	findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 80, FailureHandling.OPTIONAL)

if (queuedVisible) {
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')
	println("✅ Queued status displayed")

}


WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

String dropdown_Disabled_for_slot1 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 
    'class')

assert dropdown_Disabled_for_slot1.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))


String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 
    'class')

assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

