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

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_HISTORY'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/Total_reports_heading'), 'Total Reports (107)', 
    //FailureHandling.CONTINUE_ON_FAILURE)

//
//List<WebElement> order_row = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_HemaCYTE/Order_row_details'), 
//    30)
//
//List<WebElement> Accession_no_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_HemaCYTE/Accession_no_column'), 
//    30)
//
//List<WebElement> Petname_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_HemaCYTE/Petname_column'), 
//    30)
//
//List<WebElement> Order_status_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_HemaCYTE/Order_status_column'), 
//    30)
// Define expected values
String expectedAccessionNumber = '24680' // Change this to the required accession number

String expectedPetName = 'bruno' // Change this to the required pet name

String expectedSpecies = 'Feline' // Change this to the required species

// Get WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Define table XPath
String tableXPath = '//table/tbody/tr'

// Get all rows in the table
List<WebElement> rows = driver.findElements(By.xpath(tableXPath))

int total_reports=rows.size();

String extracted_total_reports= "Total Reports "+"("+total_reports+")";

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/Total_reports_heading'), extracted_total_reports);

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

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_bruno'), expectedPetName)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_24680'), expectedAccessionNumber)

WebUI.verifyElementText(findTestObject('Object Repository/Page_HemaCYTE/p_feline'), 'feline')

println('verified the petname, accession number and species in a report')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/Close_button_view_report_history'))

println('closed a report')

// Close browser
WebUI.closeBrowser()

