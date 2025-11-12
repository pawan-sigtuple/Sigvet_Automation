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

//  Verify the order creation when same pet name, different accession number and different species selected in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'feline', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// 2.Verify the order creation when different pet name, different accession number and different species is selected in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'feline', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when same pet name, different accession number and same species are entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when different pet name, different accession number and same species are entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when same pet name, same accession number and same species is entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when different pet name, same accession number and same species is entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when same pet name, same accession number and different species is entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'feline', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

// Verify the order creation when different pet name, same accession number and different species is entered in both the slots
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'), 'canine', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_e'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_i'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_l'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_r'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_a'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_h'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_1'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_2'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_3'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_4'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_5'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1 (1)'), 'feline', 
//    true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/img'))
WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_CANCEL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/img_1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Confirm'), 'Confirm to cancel')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test ?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/button_NO'), 30)

WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/button_YES'))

