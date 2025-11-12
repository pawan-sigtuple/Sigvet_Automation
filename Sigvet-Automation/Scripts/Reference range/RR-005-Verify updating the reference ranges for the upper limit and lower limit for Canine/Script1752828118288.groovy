import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import generic_Package.Reference_rangeClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_SETTINGS'))

WebUI.click(findTestObject('Object Repository/Reference range/Page_HemaCYTE/button_REFERENCE RANGE'))

Reference_rangeClass ref_range= new Reference_rangeClass()
WebUI.delay(2)
ref_range.selectSpeciesFromDropDown("Canine")
//ref_range.enterValueIntoTheFields("5", "55")

TestData valid_data = findTestData('Data Files/valid_dataset_for_reference_range')

//row1 to row8 is data in valid_dataset_for_reference_range
for(int i=1; i<=8;i++)
{
List<String> allowedUnits = ["%"]
String Lower_Limit_Value = valid_data.getValue('Lower_limit', i)
String Upper_Limit_Value = valid_data.getValue('Upper_limit', i)
ref_range.enterValueIntoTheFields(allowedUnits,Lower_Limit_Value,Upper_Limit_Value)

}

//row1 to row10 is data in valid_dataset_for_reference_range
for(int i=1; i<=10;i++)
	{
		
List<String> allowedUnits = ["10^9/L","10^12/L","g/dL", "pg", "fL"]
String Lower_Limit_Value = valid_data.getValue('Lower_limit', i)
String Upper_Limit_Value = valid_data.getValue('Upper_limit', i)
ref_range.enterValueIntoTheFields(allowedUnits,Lower_Limit_Value,Upper_Limit_Value)
	}

	//-------- verify the ref range items with respect to the units
Map<String, String> extarcted_actual_items_and_units =ref_range.verifyReferenceItemsAndUnitsPresent()

Map<String, String> Expected_items_and_units=[:]
TestData valid_data1 = findTestData('Data Files/default_dataset_for_reference_range')
for(int i=1; i<=20;i++)
{
String item_name = valid_data1.getValue('Measurand_name', i)
String Unit = valid_data1.getValue('Units', i)
Expected_items_and_units[item_name]=[Unit]
}
WebUI.comment("${Expected_items_and_units}")

assert extarcted_actual_items_and_units.equals(Expected_items_and_units)