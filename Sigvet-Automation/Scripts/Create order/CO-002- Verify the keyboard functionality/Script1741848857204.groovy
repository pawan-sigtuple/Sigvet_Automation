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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(5)

WebUI.setViewPortSize(1200, 1920)

//WebUI.setViewPortSize(1200, 2200)
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', '1234rr', 
    30)

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))



WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))



//WebUI.click(findTestObject('Page_HemaCYTE/button_t'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_9'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_o'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_p'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_0'))
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))



WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_s'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_d'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_f'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_g'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_k'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_v'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_x'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white w-88px h-58px_b95248'))
WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_z'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img_1'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_m_bg-484747 text-white w-88px h-58px_b95248'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/path'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/path'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/path'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/path'))
//
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/path'))
//WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img_1'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))



WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_4'))



//WebUI.click(findTestObject('Page_HemaCYTE/button_t'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_6'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_8'))


WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

