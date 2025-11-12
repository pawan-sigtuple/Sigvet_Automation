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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_9'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'), 
//    'canine', true)
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_YES'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'))

//checking flow
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')


//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Generating report'), 'Generating report...')

//WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 'Test completed')

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 'Test completed')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamecharliAccession Number13579Spec_f8945e'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_8df969'), 
    30)

WebUI.verifyElementPresent(findTestObject('View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)

WebDriver driver = DriverFactory.getWebDriver()

Actions action = new Actions(driver)

driver.findElement(By.xpath('(//div[2]/div/div[1]/p[2])[1]')).click()

println('clicked on petname ')

driver.findElement(By.xpath('//div[2]/div/div[3]/p[2]')).click()

println('clicked on species')

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img'))

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/TestExecutionCompleted_heading'), 'Test execution completed')

//eject flow
WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')


