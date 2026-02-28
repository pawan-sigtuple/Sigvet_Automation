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
//WebUI.setViewPortSize(1080, 1920)

//----- navigation to the home page when the data is entered for both slots----
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

//GenericClass gen_methods = new GenericClass()

GenericClass genericClass = new GenericClass()
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)


//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HemaCYTE/button_m'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_9'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline_1'), 'feline', true)

genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)


//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_MAINTENANCE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_SETTINGS'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 30)

//--- navigating to home screen, when only slot-1 details are entered---
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline'), 'canine', true)

genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)


//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_MAINTENANCE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_SETTINGS'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 30)

//----------navigating to home screen, when only slot-2 details are entered---
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.doubleClick(findTestObject('Object Repository/Page_HemaCYTE/button_m'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesCanineFeline_1'), 'feline', true)
genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)


//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_MAINTENANCE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_SETTINGS'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 30)

WebUI.getCSSValue(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 'color')

//-----navigation to the home page while only the accession number is entered-----
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_MAINTENANCE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_SETTINGS'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 30)

//---------- navigation to the home page when no data is entered in the order creation page.--------
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 30)

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_MAINTENANCE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_SETTINGS'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'), 30)

//-----------Cancel Button Always Available
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))

WebUI.verifyElementPresent(findTestObject('Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementVisible(findTestObject('Page_HemaCYTE/button_CANCEL'))



