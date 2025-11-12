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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.*

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.delay(10)

WebUI.setViewPortSize(1200, 1920)

WebUI.click(findTestObject('Hemacyte/History/button_HISTORY'))

//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement element = driver.findElement(By.xpath("//table/tbody")) // Change XPath
//
//JavascriptExecutor js = (JavascriptExecutor) driver
//
//js.executeScript('arguments[0].scrollIntoView(false);', element) // `false` scrolls to the bottom
//
//WebUI.delay(10)
//
//js.executeScript('arguments[0].scrollIntoView();', element) //  scrolls to the Up
WebUI.delay(2)

// Scroll the container to the bottom
String scrollScript = '\nreturn new Promise(resolve => {\n const el = document.querySelector(\'.overflow-y-auto\');\n if (!el) return resolve({ error: \'Element not found\' });\n let lastScrollTop = -1;\n const scrollStep = 300;\n const interval = setInterval(() => {\n   el.scrollBy(0, scrollStep);\n   if (el.scrollTop === lastScrollTop) {\n     clearInterval(interval);\n     resolve({ message: \'Reached bottom\' });\n   } else {\n     lastScrollTop = el.scrollTop;\n   }\n }, 200);\n});\n'

def scrollResult = WebUI.executeJavaScript(scrollScript, [])

println('Scroll result: ' + scrollResult)

WebUI.comment('Scroll result: ' + scrollResult)

// Scroll the container from bottom to top
String scrollScript1 = '\nreturn new Promise(resolve => {\n  const el = document.querySelector(\'.overflow-y-auto\');\n  if (!el) return resolve({ error: \'Element not found\' });\n  let lastScrollTop = -1;\n  const scrollStep = -300;\n  const interval = setInterval(() => {\n    el.scrollBy(0, scrollStep);\n    if (el.scrollTop === 0 || el.scrollTop === lastScrollTop) {\n      clearInterval(interval);\n      resolve({ message: \'Reached top\' });\n    } else {\n      lastScrollTop = el.scrollTop;\n    }\n  }, 200);\n});\n'

def scrollResult1 = WebUI.executeJavaScript(scrollScript1, [])

println('Scroll result: ' + scrollResult1)

WebUI.comment('Scroll result: ' + scrollResult1)

