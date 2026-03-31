import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.model.FailureHandling

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

GenericClass gen_methods1 = new GenericClass()

assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

// verify the order status is queued when slot 1 is scanning
//WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 50)

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')

boolean queuedVisible = WebUI.waitForElementVisible(
	findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 60, FailureHandling.OPTIONAL)

if (queuedVisible) {
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')
	println("✅ Queued status displayed")

} else {
	println("⚠️ Queued not displayed → checking Failed to execute test status...")

	WebUI.verifyElementText(
		findTestObject('Object Repository/Executed order/Scan Error message/Failed to execute test for slot1'),
		'Failed to execute test', FailureHandling.OPTIONAL)
	println("❌ Failed to execute test status displayed")
}
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h1_AlphaCYTE'), 'AlphaCYTE')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test in progress'), 'Test in progress')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Slot 1'), 'Slot 1')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name'), 'Pet name')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number'), 'Accession number')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species'), 'Species')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name_1'), 'Pet name')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number_1'), 'Accession number')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species_1'), 'Species')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

// ---------user is not able to edit entered order details in test in progress----------
WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

String dropdown_Disabled_for_slot1 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 
    'class')

//assert dropdown_Disabled_for_slot1.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

//String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'),  'class')

//assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'class')
//assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'
// -------- verify the correctness of the enter order details in test inprogress-------
WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 
    30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', 
    '111', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry', 
    30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value', 
    '777', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

//boolean slot1Visible = WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'), 400, 
//    FailureHandling.OPTIONAL)
//
//if (slot1Visible) {
//    // ============================================================
//    // 🟢 NORMAL FLOW
//    // ============================================================
//    println('✅ Slot 1 VIEW REPORT found → Running Normal flow...')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 'VIEW REPORT')
//
//    WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 30)
//
//    WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')
//
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))
//
//    WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
//
//    WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/info_img'))
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note :')
//
//	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), 'Remove the tray and select "Done".')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')
//
//    //--------- verify user is not able to edit entered order details
//    WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))
//
//    WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))
//
//    String dropdown_Disabled_for_slot1_test_exe = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 
//        'class')
//
//    assert dropdown_Disabled_for_slot1_test_exe.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'
//
//    //--------- verify correctness of entered order details
//    WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 
//        'charlie', 30)
//
//    WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', 
//        '111', 30)
//
//    WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')
//
//    //--------------- verify CTA functionality
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'))
//
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_1'))
//
//    WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 30)
//
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_MAINTENANCE'), 'MAINTENANCE')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_SETTINGS'), 'SETTINGS')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_HISTORY'), 'HISTORY')
//
//    println('✅ Slot 1 Normal flow completed successfully.') // ============================================================
//    // 🔴 EJECT TRAY FLOW
//    // ============================================================
//} else {
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Scan Error message/Failed to execute test for slot1'), 
//        'Failed to execute test')
//
//    println('⚠️ Slot 1 VIEW REPORT not found → Running Eject Tray flow...')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')
//
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))
//
//    WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
//
//    WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/info_img'))
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note :')
//
//	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), 'Remove the tray and select "Done".')
//
//    WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')
//
//    WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))
//
//    println('✅ Eject Tray flow completed.')
//}
import com.kms.katalon.core.model.FailureHandling

boolean slot1Visible = false
boolean slot2Visible = false

// ---- Check Slot 1 first ----
println("⏳ Waiting for Slot 1 VIEW REPORT...")
slot1Visible = WebUI.waitForElementVisible(
	findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'), 400, FailureHandling.OPTIONAL)

if (slot1Visible) {
	println("✅ Slot 1 passed! Now waiting for Slot 2 VIEW REPORT...")
	slot2Visible = WebUI.waitForElementVisible(
		findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT_1'), 400, FailureHandling.OPTIONAL)

	if (slot2Visible) {
		println("✅ Slot 2 passed!")
	} else {
		println("❌ Slot 2 VIEW REPORT not found → going to Eject Tray")
	}

} else {
	println("❌ Slot 1 VIEW REPORT not found → going to Eject Tray immediately")
}


if (slot1Visible && slot2Visible) {
	// ============================================================
	// 🟢 NORMAL FLOW — both slots passed
	// ============================================================
	println("✅ Both slots passed → Running Normal flow...")

	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 'VIEW REPORT')
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 30)

	WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT_1'), 'VIEW REPORT')
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD_1'), 30)

	WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')
	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

	WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
	WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/info_img'))
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note :')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), 'Remove the tray and select "Done".')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')

	//--------- verify user is not able to edit entered order details
	WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))
	WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

	String dropdown_Disabled_for_slot1_test_exe = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'class')
	println("Slot 1 dropdown class: " + dropdown_Disabled_for_slot1_test_exe)
	//assert dropdown_Disabled_for_slot1_test_exe.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

	WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))
	WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

	String dropdown_Disabled_for_slot2_test_exe = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'class')
	println("Slot 2 dropdown class: " + dropdown_Disabled_for_slot2_test_exe)
	//assert dropdown_Disabled_for_slot2_test_exe.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

	//--------- verify correctness of entered order details
	WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 30)
	WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', '111', 30)
	WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

	WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry', 30)
	WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value', '777', 30)
	WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

	//--------------- verify CTA functionality
	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'))
	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_1'))
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD'), 30)

	WebUI.click(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT_1'))
	WebUI.click(findTestObject('Executed order/Page_HemaCYTE/img_1_2'))
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_RE-UPLOAD_1'), 30)

	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_MAINTENANCE'), 'MAINTENANCE')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_SETTINGS'), 'SETTINGS')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_HISTORY'), 'HISTORY')

	println("✅ Both slots Normal flow completed successfully.")

} else {
	// ============================================================
	// 🔴 EJECT TRAY FLOW — slot 1 or slot 2 failed
	// ============================================================
	println("⚠️ Slot1 visible: ${slot1Visible} | Slot2 visible: ${slot2Visible}")
	println("⚠️ Running Eject Tray flow...")

	
	// ---- Verify which slot failed ----
	if (!slot1Visible) {
		WebUI.verifyElementText(
			findTestObject('Object Repository/Executed order/Scan Error message/Failed to execute test for slot1'),
			'Failed to execute test', FailureHandling.OPTIONAL)
		println("❌ Slot 1 error message verified")
	}
	
	if (!slot2Visible) {
		WebUI.verifyElementText(
			findTestObject('Object Repository/Executed order/Scan Error message/Failed to execute test for slot2'),
			'Failed to execute test', FailureHandling.OPTIONAL)
		println("❌ Slot 2 error message verified")
	}

	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')
	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

	WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
	WebUI.verifyElementVisible(findTestObject('Executed order/Page_HemaCYTE/info_img'))
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h3_Note'), 'Note :')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_1. Remove the tray'), 'Remove the tray and select "Done".')
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 'DONE')
	WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

	println("✅ Eject Tray flow completed.")
}