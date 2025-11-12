import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_3'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_5'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_9'))

GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'),
//	'canine', true)
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
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_AlphaCYTE'), 'AlphaCYTE')

//// Method to verify Date format
//String extractedDate = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_Mar 27, 2025'))
////println('Extracted Date/Time: ' + extractedDate)
//String expectedFormat = 'MMM dd,YYYY'
//if (isValidDateFormat(extractedDate, expectedFormat)) {
//	println('Date format is valid: ' + extractedDate)
//} else {
//	println((('Invalid Date format! Expected: ' + expectedFormat) + ', but found: ') + extractedDate)
//}
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

//// Method to verify time format
//String extractedTime = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_0212 PM'))
////println('Extracted Time: ' + extractedTime)
//String expectedTimeFormat = 'hh:mm a'
//if (isValidTimeFormat(extractedTime, expectedTimeFormat)) {
//	println('Time format is valid: ' + extractedTime)
//} else {
//	println((('Invalid time format! Expected: ' + expectedTimeFormat) + ', but found: ') + extractedTime)
//}
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

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamecharliAccession Number13579Spec_f8945e'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_8df969'), 
    30)

checkCBCCardHeader()

WebUI.verifyElementPresent(findTestObject('View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)

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

void checkCBCCardHeader() {
    boolean flag

    List<WebElement> cbc_card_headers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/CBC_card_headers'), 
        30)

    String item_txt = (cbc_card_headers[0]).getText()

    String Result_txt = (cbc_card_headers[1]).getText()

    String Unit_txt = (cbc_card_headers[2]).getText()

    String Range_txt = (cbc_card_headers[3]).getText()

    if (((item_txt.equals('Item') && Result_txt.equals('Result')) && Unit_txt.equals('Unit')) && Range_txt.equals('Range')) {
        println('All the CBC card headers are verified')
    } else {
        println((((((('Expected headers are not found, but found a' + item_txt) + ' ') + Result_txt) + ' ') + Unit_txt) + 
            ' ') + Range_txt)
    }
}

