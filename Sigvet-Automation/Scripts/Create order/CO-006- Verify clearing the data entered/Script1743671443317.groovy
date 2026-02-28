import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

import generic_Package.GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_v'))


WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/div_CLEAR ALL'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1_2'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Accession Number_w-228px h-38px p-3 t_09e57c'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white min-w-13 h-58_c738ed'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/svg_m_svg-inline--fa fa-delete-left'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/svg_m_svg-inline--fa fa-delete-left'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21_1'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white min-w-13 h-58_c738ed'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white min-w-13 h-58_c738ed'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21_1'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white min-w-13 h-58_c738ed'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white min-w-13 h-58_c738ed'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL_1'))



GenericClass genericClass = new GenericClass()
WebUI.comment("---- Slot 1 Species Selection ----")

genericClass.selectSpeciesFromDropDown("Slot_1", "Feline")
WebUI.delay(1)




WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))


WebUI.comment("---- Slot 2 Species Selection ----")

genericClass.selectSpeciesFromDropDown("Slot_2", "Canine")
WebUI.delay(1)


WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))



genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)


WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'), 30)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_HemaCYTE/button_CLEAR ALL'), 30)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Page_HemaCYTE/input_Accession Number_w-228px h-38px p-3 t_09e57c'), 'value', 
    '', 30)

WebUI.verifyElementAttributeValue(findTestObject('Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'), 'value', 
    '', 30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'Species')

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21'), 
    'value', '', 30)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1'), 
    'value', '', 30)
WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'Species')

