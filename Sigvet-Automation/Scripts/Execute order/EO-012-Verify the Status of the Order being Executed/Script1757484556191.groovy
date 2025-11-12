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
GenericClass gen_methods = new GenericClass()

gen_methods.selectSpeciesFromDropDown('Slot_1', 'Canine')

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_HemaCYTE/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_EXECUTE'))

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Checking'), 'Checking...')

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

// Define the TestObject for the progress bar
TestObject progressBar = new TestObject('dynamicProgressBar')

progressBar.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'bg-green-500\') and contains(@class, \'transition-all\') and contains(@class, \'ease-linear\')]')

// Wait for the progress bar to be present
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

// scan is completed - progress bar about to completed
// Check if progress bar reaches or exceeds 90%
String currentWidth = getWidthPercentage(progressBar)
if (currentWidth == null) return // Exit if extraction failed

// Start time tracking
long startTime = System.currentTimeMillis()
long maxDurationMillis = 8 * 60 * 1000 // 8 minutes timeout

println "✅ Starting to monitor progress bar until it reaches ≥ 90%..."

while (true) {
	float widthValue = currentWidth.toFloat()

	if (widthValue >= 90) {
		KeywordUtil.markPassed("✅ Progress bar has reached ${widthValue}%. Report generation is considered complete.")
		break
	}

	// Check if timeout has been reached
	long elapsedTime = System.currentTimeMillis() - startTime
	if (elapsedTime > maxDurationMillis) {
		KeywordUtil.markFailed("❌ Progress bar did not reach ≥ 90% within 8 minutes.")
		WebUI.takeScreenshot()
		break
	}

	println "⏳ Progress at ${widthValue}%. Checking again in 5 seconds..."
	WebUI.delay(5) // Wait before checking again

	// Get updated width
	currentWidth = getWidthPercentage(progressBar)
	if (currentWidth == null) return // Exit if extraction failed
}



// Wait for element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploading_status'), 700)

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Get the page source
String pageSource = driver.getPageSource()

// Verify that "Uploading to Nucleus" is somewhere in the page source

if(pageSource.contains("Uploading to Nucleus")) {
	KeywordUtil.markPassed("Uploading to Nucleus message is present in the page source.")
} else {
	KeywordUtil.markFailed("Uploading to Nucleus message is not present in the page source.")
}

// verify the "Uploaded to Nucleus" status
// Wait for the 'Uploaded' status to appear after upload is expected
boolean uploaded = WebUI.waitForElementPresent(findTestObject("Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_status"), 30)
WebUI.verifyEqual(uploaded, true)

// Optionally, confirm the text inside the element
String uploadedText = WebUI.getText(findTestObject("Object Repository/Executed order/Page_HemaCYTE/Nucleus_uploaded_status"))
WebUI.verifyMatch(uploadedText, ".*Uploaded to Nucleus.*", true)


WebUI.waitForElementVisible(findTestObject('Executed order/Page_HemaCYTE/button_Eject tray'), 60)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'), 'EJECT TRAY')

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_Eject tray'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'), 30)

WebUI.click(findTestObject('Object Repository/Executed order/Page_HemaCYTE/button_DONE'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'),30)

WebUI.verifyElementText(findTestObject('Object Repository/Executed order/Page_HemaCYTE/h2_Enter order details'), 'Enter order details')


