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
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://localhost:3000/')
//
//WebUI.setViewPortSize(600, 1024)
WebUI.delay(10)
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine',
//    true)
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_SpeciesFelineCanine_1'),
//    'feline', true)
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h1_AlphaCYTE'), 'AlphaCYTE')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Hematology'), 'Hematology')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test in progress'), 'Test in progress')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Slot 1'), 'Slot 1')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name'), 'Pet name')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number'), 'Accession number')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species'), 'Species')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name_1'), 'Pet name')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number_1'), 'Accession number')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species_1'), 'Species')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Generating report'), 'Generating report...')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued...')
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed'), 700)
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 700)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed'), 'Test completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 'VIEW REPORT')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Generating report_1'), 'Generating report...')
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed_1'), 700)
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT_1'), 700)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed_1'), 'Test completed')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT_1'), 'VIEW REPORT')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
//
//WebUI.verifyElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note:')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), '1. Remove the tray')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_2. Select Done to return to home screen'),
//    '2. Select \'Done\' to return to home screen')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_1'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT_1'))
//
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_1_2'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_af09a5'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_d66057'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_af09a5_1'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_d66057_1'))
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine_1'))
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_af09a5'),
	'value', 'charlie', 0)
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21'),
	'value', '111', 0)
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/select_SpeciesFelineCanine'), 'value', 'canine',
	0)
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/input_Pet name_w-full h-2.375rem p-3 text-b_bd374a_1'),
	'value', 'jerry', 0)
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/input_Accession number_w-full h-2.375rem p-_ca0e21_1'),
	'value', '777', 0)
WebUI.verifyElementAttributeValue(findTestObject('Executed order/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'value',
	'feline', 0)
//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))


