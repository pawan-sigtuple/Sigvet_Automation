import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import generic_Package.GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)



WebUI.setViewPortSize(1200, 1920)
//Veriy the title
title = WebUI.getWindowTitle()

//WebUI.verifyMatch(title, 'HemaCYTE', true)

//Verify header
//WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/h1_AlphaCyte'), 'AlphaCyte')
GenericClass gen_methods= new  GenericClass()

assert gen_methods.verifyPresencOfUIElementsInHeader() == true

//WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/h2_Hematology'), 'Hematology')

//Verify Body
WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/div_Slot1Pet NameAccession NumberSpeciesSpe_e8389a'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/Create_order/div_Slot2Pet NameAccession NumberSpeciesSpe_18227e'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/p_Slot1'), 'Slot 1')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/p_Slot2'), 'Slot 2')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/Create_order/input_Pet Name_w-228px h-38px p-3 text-blac_3020fc'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Pet Name'), 'Pet name')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Accession Number'), 'Accession number')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/Create_order/input_Accession Number_w-228px h-38px p-3 t_18345e'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Species'), 'Species')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Pet Name_1'), 'Pet name')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/Create_order/input_Pet Name_w-228px h-38px p-3 text-blac_3020fc_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Accession Number_1'), 'Accession number')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hemacyte/Create_order/input_Accession Number_w-228px h-38px p-3 t_18345e_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/label_Species_1'), 'Species')

//Verify footer CTAs
WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/button_MAINTENANCE'), 'MAINTENANCE')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/button_SETTINGS'), 'SETTINGS')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/Create_order/button_HISTORY'), 'HISTORY')


//Panel type selection for slot 1
//By default check 
WebUI.verifyElementText(findTestObject('Object Repository/Panel type/Page_HemaCYTE/Default cbc for slot1'), 'CBC')

WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt1'))

WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/CBC For slot1'))
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt1'))
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/RETIC For slot1'))


//Panel type selection for slot 2
//By default check 
//WebUI.verifyElementText(findTestObject('Object Repository/Panel type/Page_HemaCYTE/Default cbc for slot2'), 'CBC')
WebUI.verifyElementText(findTestObject('Object Repository/Panel type/Page_HemaCYTE/Default cbc for slot2'), 'CBC')
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt2'))
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/CBC For slot2'))
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/img-panel type drop down slt2'))
WebUI.click(findTestObject('Object Repository/Panel type/Page_HemaCYTE/RETIC For slot2'))

// Method to verify Date format
String extractedDate = WebUI.getText(findTestObject('Object Repository/Hemacyte/History/p_Mar 27, 2025'))

println(extractedDate)

// Extract the date part
String extracted_datePart = extractedDate.split(' ', 3)[2] // "Jun 18, 2025"


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

