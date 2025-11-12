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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_9'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'feline', true)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_HemaCYTE/button_EXECUTE'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Generating report'), 'Generating report...')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Queued'), 'Queued...')

WebUI.waitForElementPresent(findTestObject('Page_HemaCYTE/button_CANCEL'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/SLOT1_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/SLOT2_checkbox'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_YES'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_HemaCYTE/div_Confirm'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    'Are you confirming that you want to cancel the following test(s)?')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/td_13579'), '13579')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/td_24680'), '24680')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/td_charli'), 'charli')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/td_bruno'), 'bruno')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_YES_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Test cancelled'), 'Test cancelled')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/div_Test cancelled_1'), 'Test cancelled')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_HemaCYTE/button_DONE'), 0)

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

