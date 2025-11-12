import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.sound.sampled.*
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_9'))

GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'),
//    'canine', true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'), 10)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_YES'))
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

File soundFile = new File('Include/Resource/command for please insert the old samples.wav')

AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile)

Clip clip = AudioSystem.getClip()

clip.open(audioIn)

clip.start()

int response = JOptionPane.showConfirmDialog(null, 'Please insert the old samples.', 'User Confirmation', JOptionPane.YES_NO_OPTION)

// Step 2: Handle response
if (response == JOptionPane.YES_OPTION) {
    KeywordUtil.markPassed('✅ : Test case passed based on user confirmation.')
} else {
    KeywordUtil.markFailed(' ❌ : Test case failed because user selected No.')
}

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

//checking flow
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 60)

//The Status of the order while the scan is failed
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_info_icon'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h1_Failed'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h1_Failed'), 'Failed')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_error code162-000--0-000-000-0-S-JO-OS,co_9ef8ea'), 
//    30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_OK'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_OK'), 'OK')

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_OK'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to execute test'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to execute test'), 'Failed to execute test')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_contact customer support'), 'contact customer support')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to execute test_1'), 
//    30)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to execute test_1'), 'Failed to execute test')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_contact customer support_1'), 'contact customer support')
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

// The Status of the order while the nucleus upload is failed
File soundFile1 = new File('Include/Resource/Please Manually stop the Nucleus service.wav' // Place alert.wav in Include/resources
)

AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(soundFile1)

Clip clip1 = AudioSystem.getClip()

clip1.open(audioIn1)

clip1.start()

int response1 = JOptionPane.showConfirmDialog(null, 'Please Manually stop the Nucleus service.', 'User Confirmation', JOptionPane.YES_NO_OPTION)

// Step 2: Handle response
if (response1 == JOptionPane.YES_OPTION) {
    KeywordUtil.markPassed('✅ : Test case passed based on user confirmation.')
} else {
    KeywordUtil.markFailed(' ❌ : Test case failed because user selected No.')
}

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_9'))

//GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'),
//    'canine', true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'), 10)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_YES'))
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

File soundFile2 = new File('Include/Resource/Please insert the new samples.wav' // Place alert.wav in Include/resources
)

AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(soundFile2)

Clip clip2 = AudioSystem.getClip()

clip2.open(audioIn2)

clip2.start()

int response2 = JOptionPane.showConfirmDialog(null, 'Please insert the New samples.', 'User Confirmation', JOptionPane.YES_NO_OPTION)

// Step 2: Handle response
if (response2 == JOptionPane.YES_OPTION) {
    KeywordUtil.markPassed('✅ : Test case passed based on user confirmation.')
} else {
    KeywordUtil.markFailed(' ❌ : Test case failed because user selected No.')
}

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

//checking flow
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 60)

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 700)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')

//Verify that the nucleus state is correct in the report
WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Nucleus_status_failed'), 'Failed')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 'RE-UPLOAD')

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to upload to Nucleus'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to upload to Nucleus'), 
    'Failed to upload to Nucleus')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Error codehl7-os'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD_1'), 30)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD_1'), 'RE-UPLOAD')
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD_1'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to upload to Nucleus_1'), 
//    0)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Failed to upload to Nucleus_1'), 
//    'Failed to upload to Nucleus')
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Error codehl7-os_1'), 30)

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'),30)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Retracting tray'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Retracting tray'), 'Retracting tray')

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')
