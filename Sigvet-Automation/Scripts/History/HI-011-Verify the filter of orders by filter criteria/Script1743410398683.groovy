import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*
import org.openqa.selenium.*
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.waitForElementVisible(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'), 10)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/span_Filter by (1)'), 'Filter by')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/p_Species (1)'), 'Species')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/button_Feline (1)'), 'Feline')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Canine'), 'Canine')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/p_Order status'), 'Order status')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Completed'), 'Completed')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Failed'), 'Failed')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Cancelled'), 'Canceled')

//WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Interrupted'), 'Interrupted')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Maintenance'), 'Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/p_Nucleus status'), 'Nucleus status')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Uploaded'), 'Uploaded')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Failed_1'), 'Failed')

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'), 'APPLY')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'), 'RESET')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

TestObject canine = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Canine')

WebElement canine_opt = WebUI.findWebElement(canine)

TestObject Feline = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Feline')

WebElement Feline_opt = WebUI.findWebElement(Feline)

TestObject completed = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Completed')

WebElement completed_opt = WebUI.findWebElement(completed)

TestObject canceled = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Cancelled')

WebElement cancelled_opt = WebUI.findWebElement(canceled)

TestObject Failed = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_Failed')

WebElement Failed_opt = WebUI.findWebElement(Failed)

TestObject apply = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY')

WebElement Apply_btn = WebUI.findWebElement(apply)

TestObject Reset = findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET')

WebElement Reset_btn = WebUI.findWebElement(Reset)

//---------------- Selecting any one crteria among all---------------
String criteria_selected = selectAnyOneFilterCriteria(canine)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

String criteria_selected1 = selectAnyOneFilterCriteria(Feline)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected1)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

String criteria_selected2 = selectAnyOneFilterCriteria(completed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected2)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

String criteria_selected3 = selectAnyOneFilterCriteria(canceled)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected3)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

//----------- Failed criteria-------------
String criteria_selected_Failed=selectAnyOneFilterCriteria(Failed)
WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))
verifyThatListgetsFilteredForAppliedFilters(criteria_selected_Failed)
WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))
WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))


////---------------- Selecting any two crteria among all---------------
String criteria_selected4 = selectAnyOneFilterCriteria(canine)

String criteria_selected5 = selectAnyOneFilterCriteria(completed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected4)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected5)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

String criteria_selected6 = selectAnyOneFilterCriteria(completed) // de-selecting the criteria
    

String criteria_selected7 = selectAnyOneFilterCriteria(canceled)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected4)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected7)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

String criteria_selected_canceled = selectAnyOneFilterCriteria(canceled) // de-selecting the criteria


String criteria_selected_failed = selectAnyOneFilterCriteria(Failed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected4)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected_failed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))


WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))


String criteria_selected8 = selectAnyOneFilterCriteria(Feline)

String criteria_selected9 = selectAnyOneFilterCriteria(completed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected8)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected9)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))

String criteria_selected10 = selectAnyOneFilterCriteria(completed // de-selecting the criteria
    )

String criteria_selected11 = selectAnyOneFilterCriteria(canceled)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected8)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected11)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))


String criteria_selected_canc = selectAnyOneFilterCriteria(canceled // de-selecting the criteria
)

String criteria_selected12 = selectAnyOneFilterCriteria(Failed)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_APPLY'))

verifyThatListgetsFilteredForAppliedFilters(criteria_selected8)

verifyThatListgetsFilteredForAppliedFilters(criteria_selected12)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/img (2) (1)'))


WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/button_RESET'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/Page_HemaCYTE/svg_Filter by_svg-inline--fa fa-xmark w-20p_a4cbe3') // click on the close button of a filter by pop-up
    )

verifyThatListgetsResetToDefault()

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_CLOSE')) //	if(CriteriaSelected.equals("Canine") ||CriteriaSelected.equals("Feline") || CriteriaSelected.equals("Equine"))
//	{

//String selectAnyOneFilterCriteria(TestObject Criteria) {
//    WebUI.waitForElementVisible(Criteria, 10)
//
//    WebUI.waitForElementClickable(Criteria, 10)
//
//    WebElement criteria_ = WebUI.findWebElement(Criteria)
//
//    WebUI.click(Criteria)
//
//    String criteria_name_selected = criteria_.getText()
//
//    print(('clicked on' + criteria_name_selected) + ' species')
//
//    return criteria_name_selected
//}

String selectAnyOneFilterCriteria(TestObject Criteria) {
	// Wait until visible & clickable
	WebUI.waitForElementVisible(Criteria, 10)
	WebUI.waitForElementClickable(Criteria, 10)

	// Get text BEFORE click (to avoid stale reference)
	WebElement criteriaElement = WebUiCommonHelper.findWebElement(Criteria, 10)
	String criteria_name_selected = criteriaElement.getText()

	// Click on the criteria
	WebUI.click(Criteria)

	// Print for debugging
	println("Clicked on '${criteria_name_selected}' species")

	return criteria_name_selected
}


void verifyThatListgetsFilteredForAppliedFilters(String CriteriaSelected) {
    KeywordLogger logger = new KeywordLogger()

    List<WebElement> species_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Species_status_column'), 
        30)

    List<WebElement> order_status_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_status_column'), 
        30)

    if ((CriteriaSelected.equals('Canine') || CriteriaSelected.equals('Feline')) || CriteriaSelected.equals('Equine')) {
        for (WebElement species : species_col) {
            String specie = species.getText()

            if (specie.equals(CriteriaSelected)) {
                println(specie)

                logger.logInfo('This is an info message from my method.' + specie)

                assertEquals(CriteriaSelected, specie)
            } else {
                println('specidied species are not found, but found' + specie)

                continue
            }
        }
    } else {
        for (WebElement order_status : order_status_col) {
            String order_stat = order_status.getText()

            if (order_stat.equals(CriteriaSelected)) {
                println(order_stat)

                logger.logInfo('This is an info message from my method.' + order_stat)

                assertEquals(CriteriaSelected, order_stat)
            } else {
                println('specidied order statuses are not found, but found' + order_stat)

                continue
            }
        }
    }
}

boolean verifyThatListgetsResetToDefault() {
    boolean flag = false

    KeywordLogger logger = new KeywordLogger()

    List<WebElement> species_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Species_status_column'), 
        30)

    List<WebElement> order_status_col = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_status_column'), 
        30)

    for (WebElement species : species_col) {
        String specie = species.getText()

        if ((specie.equals('Canine') || specie.equals('Feline')) || specie.equals('Equine')) {
            println(specie)

            logger.logInfo('This is an info message from my method.' + specie)

            flag = true
        } else {
            println('specidied species are not found, but found' + specie)

            flag = false

            continue
        }
    }
    
    for (WebElement order_status : order_status_col) {
        String order_stat = order_status.getText()

        if ((order_stat.equals('Completed') || order_stat.equals('Canceled')) || order_stat.equals('Failed')) {
            println(order_stat)

            logger.logInfo('This is an info message from my method.' + order_stat)

            flag = true
        } else {
            println('specidied order statuses are not found, but found' + order_stat)

            continue
            
            flag = false
        }
    }
}

