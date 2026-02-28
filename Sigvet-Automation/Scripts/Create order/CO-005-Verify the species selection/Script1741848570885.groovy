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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('http://localhost:3000/')

//WebUI.delay(5)

//WebUI.setViewPortSize(1200, 1920)


//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Equine'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Feline'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Others'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Canine'))

////Slot2	
//


//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot2'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Canine-1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot2'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Feline_1'))


//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot2'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Equine_1'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/img slot2'))

//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/Page_HemaCYTE/button_Others_1'))



//method return for the all the slots.
import generic_Package.GenericClass

GenericClass genericClass = new GenericClass()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')
WebUI.delay(5)
WebUI.setViewPortSize(1200, 1920)
//
//// ========= SLOT 1 =========
WebUI.comment("---- Slot 1 Species Selection ----")

genericClass.selectSpeciesFromDropDown("Slot_1", "Equine")
WebUI.delay(1)

genericClass.selectSpeciesFromDropDown("Slot_1", "Feline")
WebUI.delay(1)

genericClass.selectSpeciesFromDropDown("Slot_1", "Others")
WebUI.delay(1)

genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)

//// ========= SLOT 2 =========
WebUI.comment("---- Slot 2 Species Selection ----")

genericClass.selectSpeciesFromDropDown("Slot_2", "Canine")
WebUI.delay(1)

genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)

genericClass.selectSpeciesFromDropDown("Slot_2", "Equine")
WebUI.delay(1)
//
genericClass.selectSpeciesFromDropDown("Slot_2", "Others")
WebUI.delay(1)