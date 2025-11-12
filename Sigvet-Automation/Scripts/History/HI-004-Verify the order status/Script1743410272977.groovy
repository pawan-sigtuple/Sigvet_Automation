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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

WebUI.verifyElementText(findTestObject('Object Repository/Hemacyte/History/th_ORDER STATUS'), 'ORDER STATUS')

//List<WebElement> order_row =WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_status_column'), 30);
//println(order_row)
//for(WebElement ord_stat:order_row)
//{
//	String or_st=ord_stat.getText();
//	if(or_st.equals("Completed") || or_st.equals("Canceled") || or_st.equals("Maintainance") || or_st.equals("Failed"))
//	{
//		println(or_st)
//	}
//	
//	else 
//		{
//			println("Specidied order statuses are not found, but found"+or_st)
//			continue;
//		}
//}


//List<WebElement> orderRowElements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_status_column'),30)

List<WebElement> order_row = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Hemacyte/History/Order_row'),
	30)

if (order_row && order_row.size() > 0) {
// Scroll the container to the bottom
String scrollScript = """
return new Promise(resolve => {
 const el = document.querySelector('.overflow-y-auto');
 if (!el) return resolve({ error: 'Element not found' });
 let lastScrollTop = -1;
 const scrollStep = 300;
 const interval = setInterval(() => {
   el.scrollBy(0, scrollStep);
   if (el.scrollTop === lastScrollTop) {
     clearInterval(interval);
     resolve({ message: 'Reached bottom' });
   } else {
     lastScrollTop = el.scrollTop;
   }
 }, 100);
});
"""
def scrollResult = WebUI.executeJavaScript(scrollScript, [])
println("Scroll result: " + scrollResult)
// After scrolling, get all table row data
String extractDataScript = """
const rows = document.querySelectorAll('.overflow-y-auto table tbody tr');
const result = [];
rows.forEach(row => {
 const cells = Array.from(row.querySelectorAll('td')).map(td => td.textContent.trim());
 result.push(cells);
});
return result;
"""
def tableData = WebUI.executeJavaScript(extractDataScript, [])
//println(tableData)
println("Extracted table data:")
int rowNum = 1
tableData.each { row ->
	println("Row ${rowNum++}: " + row)
	
}
//println("Total order status cells found: " + orderRowElements.size())

//for (List ordStat : tableData) {
//	String statusText = ordStat[3]
//
//	if (statusText in ["Completed", "Canceled", "Maintenance", "Failed"]) {
//		WebUI.comment("Valid status found: " + statusText)
//	} else {
//		WebUI.comment("Unexpected order status found: " + statusText)
//	}
//}

int rowIndex = 1

for (List row : tableData) {
	String statusText = row[3]  // 4th column = index 3

	if (statusText in ["Completed", "Canceled", "Maintenance", "Failed"]) {
		WebUI.comment("Row ${rowIndex}: Valid status found - ${statusText}")
	} else {
		WebUI.comment("Row ${rowIndex}: Unexpected order status - ${statusText}")
	}

	rowIndex++
}


}else {
	
    WebUI.comment('No orders found.')
}
