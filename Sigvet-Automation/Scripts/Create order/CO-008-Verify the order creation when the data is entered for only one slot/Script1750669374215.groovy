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

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

//GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline'), 'canine', true)
GenericClass genericClass = new GenericClass()
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)

//gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/img_1'))
//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 'Confirm')
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Are you sure you want to proceed without slot2'), 
//    30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_NO'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_YES'), 30)
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NO'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HemaCYTE/img_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/button_YES'), 'YES')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_t'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline_1'), 'canine', true)
genericClass.selectSpeciesFromDropDown("Slot_2", "Canine")
WebUI.delay(1)

//gen_methods.selectSpeciesFromDropDown('Slot_2', 'Canine')


//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/img_1'), 30)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 'Confirm')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Are you sure you want to proceed without slot1'), 
//    'Are you sure you want to proceed without slot1 ?')
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_NO'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_YES'), 30)
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'), 30)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

//check
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline_1'), 'canine', true)

genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)
//gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'), 30)

