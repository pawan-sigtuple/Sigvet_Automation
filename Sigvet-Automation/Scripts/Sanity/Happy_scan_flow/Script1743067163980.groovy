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
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods1 = new GenericClass()

assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

//petname for slot1
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//accession number for slot1
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_9'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//selection of the species for slot1
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//petname for the slot2
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//Accession number enetry for the slot2
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//Species seletion for the slot2
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_EXECUTE'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

boolean queuedVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 
    60, FailureHandling.OPTIONAL)

if (queuedVisible) {
    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')

    println('✅ Queued status displayed')
}

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'), 400)

WebUI.click(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_charli'), 'charli')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_13579'), '13579')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_canine'), 'Canine')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_1'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Generating report_1'), 'Generating report...')
//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Test completed_1'), 0)
WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT_1'), 400)

WebUI.click(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_bruno'), 'bruno')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_24680'), '24680')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_feline'), 'Feline')

WebUI.click(findTestObject('Executed order/Page_HemaCYTE/img_1_2'))

//Nuclues uploaded status for both the reports.
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploading_status'), 30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_slot2'), 30)

//Ejection flow 
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')

WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/info_img'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note :')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), 'Remove the tray and select "Done".')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

