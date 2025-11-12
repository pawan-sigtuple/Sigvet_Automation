import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

//--------------the cancellation for slot 1 when slot 2 is empty
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

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

//canceliing test for the order that is in progress
WebUI.delay(200)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test in progress'), 'Test in progress')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_NO'), 'NO')

WebUI.verifyElementClickable(findTestObject('Executed order/Page_HemaCYTE/button_NO'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_YES'), 'YES')

WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

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

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test cancelling'), 'Test canceling...')

WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

//--------------the cancellation for slot 2 when slot 1 is empty
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

//canceliing test for the order that is in just started
WebUI.waitForElementNotPresent(findTestObject('Executed order/Page_HemaCYTE/Checking'), 60)
//WebUI.delay(50)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 30)

WebUI.verifyElementText(findTestObject('Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'))

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

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_2'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_777'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/td_jerry'), 30)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you confirming that you want to can_bcb4a5'),
//    30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test cancelling'), 'Test canceling...')

WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled_1'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

//--------canceliing test for the order that is about to complete
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
//GenericClass gen_methods2 = new GenericClass()
gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

//canceliing test for the order that is about to complete
WebUI.delay(300)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test in progress'), 'Test in progress')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Are you sure you want to cancel the test'), 
    'Are you sure you want to cancel the test?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 'Slot 1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'), 30)

WebUI.verifyElementNotClickable(findTestObject('Executed order/Page_HemaCYTE/button_YES'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/input_Are you sure you want to cancel the t_ab777c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 1'), 30)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Slot 2'), 30)
WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES'))

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

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_NO_1'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'), 30)

WebUI.verifyElementClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_YES_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test cancelling'), 'Test canceling...')

WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.waitForElementPresent(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 
    30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Test execution completed'), 'Test execution completed')

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Test canceled'), 'Test canceled')

WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')

