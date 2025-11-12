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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

//----------------------canceliing test while scan is in progress--------------------
GenericClass gen_methods1 = new GenericClass()

assert gen_methods1.verifyPresencOfUIElementsInHeader() == true

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h1_AlphaCYTE'), 'AlphaCYTE')

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Hematology'), 'Hematology')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test in progress'), 'Test in progress')

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Slot 1'), 'Slot 1')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name'), 'Pet name')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number'), 'Accession number')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species'), 'Species')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Pet name_1'), 'Pet name')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Accession number_1'), 'Accession number')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/label_Species_1'), 'Species')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

WebUI.waitForElementNotPresent(findTestObject('Executed order/Page_HemaCYTE/Checking'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

// ---------user is not able to edit entered order details in test in progress----------
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine'))
String dropdown_Disabled_for_slot1 = WebUI.getAttribute(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_species_dropdown'), 
    'class')

assert dropdown_Disabled_for_slot1.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_accession_no_field'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine_1'))
String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_species_dropdown'), 
    'class')

assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

// -------- verify the correctness of the enter order details in test inprogress-------
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'), 
    'value', 'charlie', 30)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'), 
    'value', '111', 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_2_Petname_field'), 
    'value', 'jerry', 30)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_accession_no_field'), 
    'value', '777', 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_YES'), 'YES')

WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_Queued_mdh-3rem mdw-3rem'), 
    30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Slot 1_w-14px h-14px mr-2 accent-prim_8030e9'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Slot 1_w-14px h-14px mr-2 accent-prim_8030e9'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_CANCEL_mdh-3rem mdw-3rem'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    'Are you confirming that you want to cancel the following test(s)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Slot'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Slot'), 'Slot')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Accession no'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Accession no'), 'Accession no.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Pet name'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Pet name'), 'Pet name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_111'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_charlie'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_2'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_777'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_jerry'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you confirming that you want to can_bcb4a5'), 
//    30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.waitForElementPresent(findTestObject('Executed order/Page_HemaCYTE/div_Test cancelling'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test cancelling'), 'Test canceling...')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_AlphaCyte_fixed bottom-1 left-12 transf_401963'), 
//    30)
WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 
    30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 
//    30)
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

//------------------------Verify that Slot 2 is cancelled correctly when details for both Slot 1 and Slot 2 are entered.
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)
//GenericClass gen_methods = new GenericClass()
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.waitForElementNotPresent(findTestObject('Executed order/Page_HemaCYTE/Checking'), 60)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_YES'), 'YES')

WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_Queued_mdh-3rem mdw-3rem'), 
    30)

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Slot 1_w-14px h-14px mr-2 accent-prim_8030e9'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_CANCEL_mdh-3rem mdw-3rem'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    'Are you confirming that you want to cancel the following test(s)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Slot'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Slot'), 'Slot')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Accession no'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Accession no'), 'Accession no.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Pet name'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Pet name'), 'Pet name')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_1'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_111'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_charlie'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_2'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_777'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_jerry'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you confirming that you want to can_bcb4a5'),
//    30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed'), 'Test completed')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 'VIEW REPORT')

//WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed')	30)
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

//------------------Verify that Slot 1 is cancelled correctly when details for both Slot 1 and Slot 2 are entered.
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_c'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_h'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_a'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_l'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_i'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)
//GenericClass gen_methods = new GenericClass()
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine_1'), 'feline', true)
gen_methods.selectSpeciesFromDropDown('Slot_2', 'Feline')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.waitForElementNotPresent(findTestObject('Executed order/Page_HemaCYTE/Checking'), 60)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 'Slot 2')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_YES'), 'YES')

WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_Queued_mdh-3rem mdw-3rem'), 
    30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))

//WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Slot 1_w-14px h-14px mr-2 accent-prim_8030e9'))
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img_CANCEL_mdh-3rem mdw-3rem'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/p_Are you confirming that you want to cance_93939d'), 
    'Are you confirming that you want to cancel the following test(s)?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Slot'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Slot'), 'Slot')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Accession no'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Accession no'), 'Accession no.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/th_Pet name'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/th_Pet name'), 'Pet name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_111'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_charlie'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_2'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_777'), 30)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_jerry'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you confirming that you want to can_bcb4a5'),
//    30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test cancelling'), 'Test canceling...')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/div_Test completed'), 700)

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_VIEW REPORT'), 700)

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test completed'), 'Test completed')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_VIEW REPORT'), 'VIEW REPORT')

//WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed')	30)
//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')
WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

//WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

