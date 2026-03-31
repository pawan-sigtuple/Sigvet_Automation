import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import generic_Package.GenericClass as GenericClass
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil

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

WebUI.click(findTestObject('Object Repository/View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_1'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/img'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HemaCYTE/select_SpeciesFelineCanine'), 'canine', true)
//GenericClass gen_methods = new GenericClass()

//gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

GenericClass genericClass = new GenericClass()
genericClass.selectSpeciesFromDropDown("Slot_1", "Canine")
WebUI.delay(1)

//slot2 
WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_j'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_e'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_r'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_y'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))

WebUI.click(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_7'))


WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/img'))


//Method for selecting the species for slot 2
genericClass.selectSpeciesFromDropDown("Slot_2", "Feline")
WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

import com.kms.katalon.core.model.FailureHandling
boolean queuedVisible = WebUI.waitForElementVisible(
	findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 60, FailureHandling.OPTIONAL)

if (queuedVisible) {
	WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/div_Queued'), 'Queued')
	println("✅ Queued status displayed")

}else {
	println("⚠️ Queued not displayed → checking Failed to execute test status...")

	WebUI.verifyElementText(
		findTestObject('Object Repository/Executed order/Scan Error message/Failed to execute test for slot1'),
		'Failed to execute test', FailureHandling.OPTIONAL)
	println("❌ Failed to execute test status displayed")
}

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_CANCEL'), 'CANCEL')

// ---------user is not able to edit entered order details in test in progress----------
WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'))

WebUI.verifyElementNotClickable(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'))

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Executed order/Page_HemaCYTE/select_FelineCanine'))
String dropdown_Disabled_for_slot1 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 
    'class')

assert dropdown_Disabled_for_slot1.contains('cursor-not-allowed') == true : 'Element is clickable for slot1'

// -------- verify the correctness of the enter order details in test inprogress-------
WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_1_Petname_field'), 'value', 'charlie', 
    30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_accession_no_field'), 'value', 
    '111', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot1_species_dropdown'), 'Canine')

//WebUI.waitForElementNotVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 60)
WebUI.delay(60)


String dropdown_Disabled_for_slot2 = WebUI.getAttribute(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'),
	'class')

assert dropdown_Disabled_for_slot2.contains('cursor-not-allowed') == true : 'Element is clickable for slot2'

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot_2_Petname_field'), 'value', 'jerry',
	30)

WebUI.verifyElementAttributeValue(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_accession_no_field'), 'value',
	'777', 30)

WebUI.verifyElementText(findTestObject('View_Report_Objects/Page_HemaCYTE/Slot2_species_dropdown'), 'Feline')



TestObject progressBar = new TestObject('dynamicProgressBar')

progressBar.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'bg-green-500\') and contains(@class, \'transition-all\') and contains(@class, \'ease-linear\')]')

WebUI.waitForElementPresent(progressBar, 10) 


//scan is in progres - checking progress bar fill movement
// Get initial width
String previousWidth = getWidthPercentage(progressBar)
if (previousWidth == null) return // Exit if extraction failed

// Loop over 5 intervals
for (int i = 1; i <= 5; i++) {
	WebUI.delay(2)  // Wait for 2 seconds before checking again

	String currentWidth = getWidthPercentage(progressBar)
	if (currentWidth == null) return // Exit if extraction failed

	println "Interval ${i}: Width at t${i} = ${currentWidth}%"

	if (currentWidth != previousWidth) {
		KeywordUtil.markPassed("✅ Progress bar width changed from ${previousWidth}% to ${currentWidth}% at interval ${i}.")
	} else {
		KeywordUtil.markFailed("❌ Progress bar width did NOT change at interval ${i}. Previous width: ${previousWidth}%, Current width: ${currentWidth}%.")
		WebUI.takeScreenshot()
	}
	// Update previous width for next iteration
	previousWidth = currentWidth
}

println "✅ Completed checking progress bar over 5 intervals."





// Wait for element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploading_status'), 400)


// Function to extract width from style attribute
def getWidthPercentage(TestObject obj) {
	String style = WebUI.getAttribute(obj, "style")
	println "Current style: " + style
	def widthPattern = /width:\s*(\d+\.?\d*)%/
	def matcher = (style =~ widthPattern)
	if (matcher.find()) {
		return matcher.group(1)
	} else {
		KeywordUtil.markFailed("❌ Unable to extract width from style attribute.")
		WebUI.takeScreenshot()
		return null
	}
}



// Wait for element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploading_status'), 400)
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_slot2'), 400)


// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Get the page source
String pageSource = driver.getPageSource()

// Verify that "Uploading to Nucleus" is somewhere in the page source

if(pageSource.contains("Uploading to Nucleus")) {
	println("✅ Uploading to Nucleus message is present in the page source.")
} else {
	println(" ⚠️ Uploading to Nucleus message is not present in the page source.")
}



// Optionally, confirm the text inside the element
String uploadedText = WebUI.getText(findTestObject("Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_status"))
WebUI.verifyMatch(uploadedText, ".*Uploaded to Nucleus.*", true)

String uploadedText1 = WebUI.getText(findTestObject("Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_slot2"))
WebUI.verifyMatch(uploadedText1, ".*Uploaded to Nucleus.*", true)



WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'),30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')


