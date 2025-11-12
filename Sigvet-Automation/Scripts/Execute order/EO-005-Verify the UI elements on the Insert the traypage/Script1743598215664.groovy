import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import generic_Package.GenericClass as GenericClass

//WebUI.delay(10)
//WebUI.setViewPortSize(600, 1024)
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://localhost:3000/')
//
//WebUI.setViewPortSize(600, 1024)
//Open browser
WebUI.openBrowser('')

WebUI.openBrowser('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods1= new  GenericClass()

assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

//WebUI.setViewPortSize(529, 916)
// Get the current web driver
//def driver = DriverFactory.getWebDriver()
// Execute JavaScript to set zoom level to 50%
//((JavascriptExecutor) driver).executeScript("document.body.style.zoom='80%'")
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

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/h1_AlphaCYTE'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/h2_Hematology'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/h2_Insert the tray'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Pet name'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Accession number'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Species'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Slot 2'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Pet name_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Accession number_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/label_Species_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_EXECUTE'), 30)

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/div_'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/info_img'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/h3_Note'), 'Note:')

WebUI.verifyElementText(findTestObject('Page_HemaCYTE/p_1. Please place the tray into the tray ho_2a78bf'), '1. Please place the tray into the device and select "Execute".')

