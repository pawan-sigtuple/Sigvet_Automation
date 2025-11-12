import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import generic_Package.GenericClass

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')
WebUI.delay(10)
WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Object Repository/Hemacyte/History/button_HISTORY'))

WebUI.click(findTestObject('Object Repository/Hemacyte/History/input_Hematology_p-18px pl-10 gap-20px w-fu_a34b33 (1)'))

GenericClass gen_methods= new GenericClass()
gen_methods.enterSearchKeywordIntoTheField('charlie')
gen_methods.verifyListGettingFilteredBasedOnSearchKeyword('charlie')

gen_methods.enterSearchKeywordIntoTheField('charliebrunojerrycharliebr')
gen_methods.verifyListGettingFilteredBasedOnSearchKeyword('charliebrunojerrycharliebr')

