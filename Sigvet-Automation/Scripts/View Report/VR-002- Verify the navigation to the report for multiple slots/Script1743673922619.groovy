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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement.*
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.*
import org.openqa.selenium.WebDriver as WebDriver
import generic_Package.GenericClass as GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 
    10)

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
// 'canine', true)
GenericClass gen_methods = new GenericClass()

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine'),
//    'canine', true)
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

//Entering Slot order details
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_b'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_u'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_n'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_o'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_2'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_4'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_6'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_8'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_0'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 
//'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'), 10)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_EXECUTE'))

//checking flow
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')



//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Generating report'), 'Generating report...')

//if(WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700) && WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700))
//
//{
//	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))
//}
//----------Waiting for a Slot-1 scan to complete------------ 
//WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed'), 'Test completed')

//----------Waiting for a Slot-2 scan to complete-------------
//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Generating report_1'), 'Generating report...')

//WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed_1'),  700)

WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT_1'), 
    700)

//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Test completed_1'), 'Test completed')

//----------Clicking on a Slot-1's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
// getting slot1 order details
ArrayList orderDetails_Test_inprogressPage = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown')

// getting slot2 order details
ArrayList orderDetails_slot2_Test_inprogressPage = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown')

//-----------clicking on a Slot-1 view report CTA----------
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))

WebUI.delay(3)

//-----------getting a order details from the report page---------
ArrayList orderDetails_in_Report = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamecharliAccession Number13579Spec_f8945e'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_8df969'), 
    30)

WebUI.verifyElementPresent(findTestObject('View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)

boolean resultss = CompareOrderDetailsBetweenAny2Pages(orderDetails_Test_inprogressPage, orderDetails_in_Report)

println(resultss)
assert resultss == true

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img'))

//----------Clicking on a Slot-2's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT_1'))

WebUI.delay(3)

ArrayList orderDetails_slot2_in_Report = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report', 
    'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')

boolean resultsss = CompareOrderDetailsBetweenAny2Pages(orderDetails_slot2_Test_inprogressPage, orderDetails_slot2_in_Report)

println(resultsss)
assert resultsss == true

WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 2'), 'Slot 2')

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamebrunoAccession Number24680Speci_a42df9'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_f8a690'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img_1_2'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'), 0)
//
//WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_DONE'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')
WebDriver driver = DriverFactory.getWebDriver( //WebUI.closeBrowser() //Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field
    //	if (tagName.equalsIgnoreCase("input") || tagName.equalsIgnoreCase("textarea") || tagName.equalsIgnoreCase("select")) 
    //		{}
    ) //*[@id="root"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/p[2]

	
	
//----------------------------report data integrity when rapidly switching between slot1 and slot2 reports
	//First time
	//----------Clicking on a Slot-1's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
	// getting slot1 order details
	ArrayList orderDetails_Test_inprogressPage_1 = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown')
	
	// getting slot2 order details
	ArrayList orderDetails_slot2_Test_inprogressPage_2 = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown')
	
	//-----------clicking on a Slot-1 view report CTA----------
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))
	
	WebUI.delay(3)
	
	//-----------getting a order details from the report page---------
	ArrayList orderDetails_in_Report_1 = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')
	
	WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamecharliAccession Number13579Spec_f8945e'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_8df969'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)
	
	boolean resultss_1 = CompareOrderDetailsBetweenAny2Pages(orderDetails_Test_inprogressPage_1, orderDetails_in_Report_1)
	
	println(resultss_1)
	assert resultss_1 == true
	
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img'))
	
	//----------Clicking on a Slot-2's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT_1'))
	
	WebUI.delay(3)
	
	ArrayList orderDetails_slot2_in_Report_2 = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')
	
	boolean resultsss_1 = CompareOrderDetailsBetweenAny2Pages(orderDetails_slot2_Test_inprogressPage_2, orderDetails_slot2_in_Report_2)
	
	println(resultsss_1)
	assert resultsss_1 == true
	
	WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 2'), 'Slot 2')
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamebrunoAccession Number24680Speci_a42df9'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_f8a690'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)
	
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img_1_2'))
	
	
		//Second time
	//----------Clicking on a Slot-1's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
	// getting slot1 order details
	ArrayList orderDetails_Test_inprogressPage_11 = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown')
	
	// getting slot2 order details
	ArrayList orderDetails_slot2_Test_inprogressPage_22 = getOrderDetailsFromAnyPage('TestInProgress', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown')
	
	//-----------clicking on a Slot-1 view report CTA----------
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT'))
	
	WebUI.delay(3)
	
	//-----------getting a order details from the report page---------
	ArrayList orderDetails_in_Report_11 = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')
	
	WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 1'), 'Slot 1')
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamecharliAccession Number13579Spec_f8945e'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_8df969'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)
	
	boolean resultss_11 = CompareOrderDetailsBetweenAny2Pages(orderDetails_Test_inprogressPage_11, orderDetails_in_Report_11)
	
	println(resultss_11)
	assert resultss_11 == true
	
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img'))
	
	//----------Clicking on a Slot-2's "VIEW Report" CTA and verifying the Presence of Order details, CBC and Flags card------------
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/button_VIEW REPORT_1'))
	
	WebUI.delay(3)
	
	ArrayList orderDetails_slot2_in_Report_22 = getOrderDetailsFromAnyPage('Report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/AccessionNo_in_report',
		'Object Repository/View_Report_Objects/Page_HemaCYTE/Petname_in_report', 'Object Repository/View_Report_Objects/Page_HemaCYTE/Species_in_report')
	
	boolean resultsss_11 = CompareOrderDetailsBetweenAny2Pages(orderDetails_slot2_Test_inprogressPage_22, orderDetails_slot2_in_Report_22)
	
	println(resultsss_11)
	assert resultsss_11 == true 
	
	WebUI.verifyElementText(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/h1_Slot 2'), 'Slot 2')
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Pet NamebrunoAccession Number24680Speci_a42df9'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Complete Blood Count (CBC)ItemResultUni_f8a690'),
		30)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/div_Flags'), 30)
	
	WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/img_1_2'))
	
	
	
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

        String selectedValue = species_drp.getText()

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
    
    println('comapriosin method ended')

    return flag
}




