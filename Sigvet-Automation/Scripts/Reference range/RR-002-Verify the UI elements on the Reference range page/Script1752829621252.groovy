import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
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

WebUI.maximizeWindow()

//WebUI.setViewPortSize(1200, 1920)
WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_SETTINGS'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'))

//----------------information present on the header-------------------
GenericClass gen_methods = new GenericClass()

assert gen_methods.verifyPresencOfUIElementsInHeader() == true

// Method to verify Date format
String extractedDate = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_Mar 27, 2025'))

// Extract the date part
String extracted_datePart = extractedDate.split(' ', 3)[2 // "Jun 18, 2025"
]

//println('Extracted Date/Time: ' + extractedDate)
String expectedFormat = 'MMM dd,YYYY'

if (isValidDateFormat(extracted_datePart, expectedFormat)) {
    WebUI.comment('Date format is valid: ' + extracted_datePart)

    KeywordUtil.markPassed('Date format is valid: ' + extracted_datePart)
} else {
    WebUI.comment((('Invalid Date format! Expected: ' + expectedFormat) + ', but found: ') + extracted_datePart)

    KeywordUtil.markFailed((('Invalid Date format! Expected: ' + expectedFormat) + ', but found: ') + extracted_datePart)
}

// Method to verify time format
String extractedTime = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_0212 PM'))

// Extract the time part (first two tokens)
String[] parts = extractedTime.split(' ')

String extracted_timePart = ((parts[0]) + ' ') + (parts[1 // "03:23 PM"
])

//println('Extracted Time: ' + extractedTime)
String expectedTimeFormat = 'hh:mm a'

if (isValidTimeFormat(extracted_timePart, expectedTimeFormat)) {
    WebUI.comment('Time format is valid: ' + extracted_timePart)

    KeywordUtil.markPassed('Time format is valid: ' + extracted_timePart)
} else {
    WebUI.comment((('Invalid time format! Expected: ' + expectedTimeFormat) + ', but found: ') + extracted_timePart)

    KeywordUtil.markFailed((('Invalid time format! Expected: ' + expectedTimeFormat) + ', but found: ') + extracted_timePart)
}

//-------------------presence of the CTA at the bottom of the page.--------------
WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'), 'CLOSE')

WebUI.verifyElementClickable(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'), 30)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.maximizeWindow()

//WebUI.setViewPortSize(1200, 1920)
WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_SETTINGS'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'))

//----------------information present on the header-------------------
GenericClass gen_methods = new GenericClass()

assert gen_methods.verifyPresencOfUIElementsInHeader() == true

// Method to verify Date format
String extractedDate = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_Mar 27, 2025'))

// Extract the date part
String extracted_datePart = extractedDate.split(' ', 3)[2 // "Jun 18, 2025"
]

//println('Extracted Date/Time: ' + extractedDate)
String expectedFormat = 'MMM dd,YYYY'

if (isValidDateFormat(extracted_datePart, expectedFormat)) {
    WebUI.comment('Date format is valid: ' + extracted_datePart)

    KeywordUtil.markPassed('Date format is valid: ' + extracted_datePart)
} else {
    WebUI.comment((('Invalid Date format! Expected: ' + expectedFormat) + ', but found: ') + extracted_datePart)

    KeywordUtil.markFailed((('Invalid Date format! Expected: ' + expectedFormat) + ', but found: ') + extracted_datePart)
}

// Method to verify time format
String extractedTime = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_0212 PM'))

// Extract the time part (first two tokens)
String[] parts = extractedTime.split(' ')

String extracted_timePart = ((parts[0]) + ' ') + (parts[1 // "03:23 PM"
])

//println('Extracted Time: ' + extractedTime)
String expectedTimeFormat = 'hh:mm a'

if (isValidTimeFormat(extracted_timePart, expectedTimeFormat)) {
    WebUI.comment('Time format is valid: ' + extracted_timePart)

    KeywordUtil.markPassed('Time format is valid: ' + extracted_timePart)
} else {
    WebUI.comment((('Invalid time format! Expected: ' + expectedTimeFormat) + ', but found: ') + extracted_timePart)

    KeywordUtil.markFailed((('Invalid time format! Expected: ' + expectedTimeFormat) + ', but found: ') + extracted_timePart)
}

//-------------------information present on the body--------------

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/h1_Reference range'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/div_Feline'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/p_Item'), 'Item')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/p_Lower limit'), 'Lower limit')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/p_Upper limit'), 'Upper limit')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/p_Units'), 'Units')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_RESET TO DEFAULT'), 'RESET TO DEFAULT')

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_SAVE'), 'SAVE')



//-------------------presence of the CTA at the bottom of the page.--------------
WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'), 'CLOSE')

WebUI.verifyElementClickable(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_CLOSE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'), 30)






boolean isValidDateFormat(String dateStr, String format) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat(format)

        sdf.setLenient(false)

        sdf.parse(dateStr)

        return true
    }
    catch (Exception e) {
        return false
    } 
}

boolean isValidTimeFormat(String time, String format) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat(format)

        sdf.setLenient(false)

        sdf.parse(time)

        return true
    }
    catch (Exception e) {
        return false
    } 
}

