import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass

//Launch_App launch = new Launch_App()
//
//launch.launchAppAndSetViewPort()
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods1 = new GenericClass()

assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

WebUI.waitForElementVisible(findTestObject('View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 10)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.verifyElementText(findTestObject('Hemacyte/History/button_HISTORY'), 'HISTORY')

WebUI.click(findTestObject('Hemacyte/History/button_HISTORY'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h1_AlphaCYTE'), 'AlphaCYTE')

//WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/h2_Hematology (1)'), 'Hematology')
WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/input_Hematology_p-18px pl-10 gap-20px w-fu_a34b33 (3)'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/div_Hematology_w-17px h-47.69px flex justif_2d12a0 (2)'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/img (3)'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Hemacyte/History/h1_Total Reports (74) (1)'), 0)
WebUI.verifyElementText(findTestObject('Hemacyte/History/th_ACCESSION NUMBER'), 'ACCESSION NUMBER')

WebUI.verifyElementText(findTestObject('Hemacyte/History/th_PET NAME'), 'PET NAME')

WebUI.verifyElementText(findTestObject('Hemacyte/History/th_SPECIES'), 'SPECIES')

WebUI.verifyElementText(findTestObject('Hemacyte/History/th_ORDER STATUS'), 'ORDER STATUS')

WebUI.verifyElementText(findTestObject('Hemacyte/History/th_REPORT DATE'), 'REPORT DATE')

WebUI.verifyElementText(findTestObject('Hemacyte/History/th_NUCLEUS STATUS'), 'NUCLEUS STATUS')

WebUI.verifyElementText(findTestObject('Hemacyte/History/button_CLOSE'), 'CLOSE')

WebDriver driver = DriverFactory.getWebDriver()

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

WebElement Total_reports = WebUI.findWebElement(findTestObject('Object Repository/Hemacyte/History/h1_Total Reports (74) (1)'))

String total = Total_reports.getText()

println(total)

String text = total

String total_orders = ((text =~ '\\((\\d+)\\)')[0])[1]

//println total_orders // Output: 138
WebUI.comment('Total orders: ' + total_orders)

List<WebElement> order_row = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_row'), 
    30)

if (order_row != null) {
    // Scroll the container to the bottom
    String scrollScript = '\nreturn new Promise(resolve => {\n const el = document.querySelector(\'.overflow-y-auto\');\n if (!el) return resolve({ error: \'Element not found\' });\n let lastScrollTop = -1;\n const scrollStep = 300;\n const interval = setInterval(() => {\n   el.scrollBy(0, scrollStep);\n   if (el.scrollTop === lastScrollTop) {\n     clearInterval(interval);\n     resolve({ message: \'Reached bottom\' });\n   } else {\n     lastScrollTop = el.scrollTop;\n   }\n }, 200);\n});\n'

    def scrollResult = WebUI.executeJavaScript(scrollScript, [])

    println('Scroll result: ' + scrollResult)

    // After scrolling, get all table row data
    String extractDataScript = '\nconst rows = document.querySelectorAll(\'.overflow-y-auto table tbody tr\');\nconst result = [];\nrows.forEach(row => {\n const cells = Array.from(row.querySelectorAll(\'td\')).map(td => td.textContent.trim());\n result.push(cells);\n});\nreturn result;\n'

    def tableData = WebUI.executeJavaScript(extractDataScript, [])

    //println(tableData)
    println('Extracted table data:')

    int rowNum = 1

    tableData.each({ def row ->
            //println("Row $(rowNum++): " + row)
			println("Row ${rowNum++}: ${row}")
        })

    int actual_order_in_list = rowNum - 1

    WebUI.comment('Number of orders in the list: ' + actual_order_in_list)

    assert actual_order_in_list.toInteger() == total_orders.toInteger() : 'Total orders and actual order in the list are not same'
} else {
    WebUI.comment('No orders found.')
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

