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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(5)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 
    30)

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
//	'canine', true)
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_SpeciesCanineFeline'))
//WebUI.click(findTestObject('Object Repository/Hemacyte/Create_order/select_Canine_for_slot1'))
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

ArrayList orderDetails_From_Enter_OrderDetails = getOrderDetailsFromAnyPage('Enter_Order_Details', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown')

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'), 30)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_YES'))
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Generating report'), 'Checking...')

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 'Test completed')

WebUI.waitForElementVisible(findTestObject('Hemacyte/History/button_EjectTray'), 30)

WebUI.verifyElementText(findTestObject('Hemacyte/History/button_EjectTray'), 'EJECT TRAY')

WebUI.click(findTestObject('Hemacyte/History/button_EjectTray'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

WebUI.verifyElementText(findTestObject('Hemacyte/History/button_HISTORY'), 'HISTORY')

WebUI.click(findTestObject('Hemacyte/History/button_HISTORY'))

WebUI.delay(3)

String expectedAccessionNumber = '13579' // Change this to the required accession number

String expectedPetName = 'charli' // Change this to the required pet name

String expectedSpecies = 'Canine' // Change this to the required species

// Get WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Define table XPath
String tableXPath = '//table/tbody/tr'

// Get all rows in the table
List<WebElement> rows = driver.findElements(By.xpath(tableXPath))

if (rows != null) {
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
            //println("Row $(rowNum++): $row")
			println("Row ${rowNum++}: $row")
			
        })

    int actual_order_in_list = rowNum - 1

    WebUI.comment('Number of orders in the list: ' + actual_order_in_list)

    //int total_reports = rows.size()
    //WebUI.comment("Total orders in a list: "+total_reports)
    String extracted_total_reports = (('Total orders ' + '(') + actual_order_in_list) + ')'

    WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/Total_reports_heading'), extracted_total_reports)
} else {
    WebUI.comment('No orders found.')
}

// Iterate through each row
for (WebElement row : rows) {
    // Get all columns (cells) in the row
    List<WebElement> cells = row.findElements(By.tagName('td'))

    // Extract values from the necessary columns
    String accessionNumber = (cells[0]).getText( // Column 1: Accession Number
        )

    String petName = (cells[1]).getText( // Column 2: Pet Name
        )

    String species = (cells[2]).getText( // column 3: Species
        )

    String orderStatus = (cells[3]).getText( // Column 4: Order Status
        )

    // Check if this is the expected row
    if ((accessionNumber.equals(expectedAccessionNumber) && petName.equals(expectedPetName)) && species.equals(expectedSpecies)) {
        println((((('Found matching row for Accession Number: ' + accessionNumber) + ', Pet Name: ') + petName) + ' and Species:') + 
            species)

        // Check if the order status is "Completed"
        if (orderStatus.equals('Completed')) {
            println('Order status is \'Completed\'. Clicking the row to open the report.')

            // Click the row to open the report
            row.click()

            WebUI.delay(2 // Wait for report page to load
                )

            break
        } else {
            println('Order status is not \'Completed\'. Skipping this row.')
        }
    }
}

ArrayList orderDetails_in_Report = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')

boolean resultss = CompareOrderDetailsBetweenAny2Pages(orderDetails_From_Enter_OrderDetails, orderDetails_in_Report)

println(resultss)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img' //Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field
        ) //	if (tagName.equalsIgnoreCase("input") || tagName.equalsIgnoreCase("textarea") || tagName.equalsIgnoreCase("select"))
    ) //		{}
//*[@id="root"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/p[2]

ArrayList getOrderDetailsFromAnyPage(String PageName, String acc_no, String pet_name, String species) {
    ArrayList<String> orderdetails = new ArrayList()

    TestObject acc_no_field = findTestObject(acc_no)

    WebElement acc_no_ele = WebUI.findWebElement(acc_no_field)

    TestObject petname = findTestObject(pet_name)

    WebElement petname_field = WebUI.findWebElement(petname)

    TestObject speciess = findTestObject(species)

    WebElement species_drp = WebUI.findWebElement(speciess)

    if (PageName.equals('Report')) {
        String acc_no_value = acc_no_ele.getText()

        orderdetails.add(acc_no_value)

        String petname_value = petname_field.getText()

        orderdetails.add(petname_value)

        String species_value = species_drp.getText()

        orderdetails.add(species_value)
    } else {
        String accession_Value = acc_no_ele.getAttribute('value')

        orderdetails.add(accession_Value)

        String petname_Value = petname_field.getAttribute('value')

        orderdetails.add(petname_Value)

        String selectedValue = species_drp.getAttribute('value')

        orderdetails.add(selectedValue)
    }
    
    for (String details : orderdetails) {
        println(details)
    }
    
    return orderdetails
}

boolean CompareOrderDetailsBetweenAny2Pages(ArrayList TestInProgressOrderdetails, ArrayList ReportOrderdetails) {
    println('comapriosin method started')

    println(TestInProgressOrderdetails)

    println(ReportOrderdetails)

    boolean flag = false

    for (int i = 0; i < 3; i++) {
        if ((TestInProgressOrderdetails[i]).equals(ReportOrderdetails[i])) {
            println('comparison started')

            println(TestInProgressOrderdetails[i])

            println(ReportOrderdetails[i])

            flag = true
        } else {
            flag = false
        }
    }
    
    println('comparison method ended')

    return flag
}

