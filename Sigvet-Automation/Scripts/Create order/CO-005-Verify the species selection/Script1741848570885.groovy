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
import generic_Package.GenericClass


WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(5)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods= new GenericClass()

gen_methods.selectSpeciesFromDropDown("Slot_1", "Canine")
gen_methods.selectSpeciesFromDropDown("Slot_2", "Feline")
gen_methods.selectSpeciesFromDropDown("Slot_1", "Feline")
gen_methods.selectSpeciesFromDropDown("Slot_2", "Canine")


//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline'))
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_Feline_for_slot1'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline'))
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_Canine_for_slot1'))
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'))
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_Canine_for_slot2'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline (1)'))
//
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_Feline_for_slot2'))




//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline'), 'canine', 
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline'), 'feline', 
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1'), 'feline', 
//    true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline_1'), 'canine', 
//    true)

