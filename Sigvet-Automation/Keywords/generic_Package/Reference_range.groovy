package generic_Package

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import java.time.Duration

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Reference_rangeClass {
	WebDriver driver
	WebDriverWait wait
	//	public ArrayList<String> enterValueIntoTheFields(String Lower_Limit_Value,String Upper_Limit_value) {
	//		ArrayList<String> error_msgs = new ArrayList<>()
	//		driver= DriverFactory.getWebDriver()
	//		List<WebElement> Measurands_row = driver.findElements(By.xpath("//div[contains(@class,'grid') and not(contains(@class,'sticky top'))]"))
	//		//WebUI.comment("No of rows:"+Measurands_row.size())
	//		//Actions act = new Actions(driver)
	//		for(int i=0; i<Measurands_row.size();i++) {
	//			List<WebElement> input_boxes=Measurands_row.get(i).findElements(By.xpath("./div/input"))
	//			//WebUI.comment("No of input_boxes:"+input_boxes.size())
	//			input_boxes[0].sendKeys(Keys.chord(Keys.COMMAND, "a"));
	//			input_boxes[0].sendKeys(Keys.DELETE);
	//			input_boxes[0].sendKeys(Lower_Limit_Value)
	//			WebUI.comment("entered value into a lower limit")
	//try {
	//			WebElement L_error_message=input_boxes[0].findElement(By.xpath("//span[contains(@class,'absolute')  and contains(@class,'text-white bg-red')]"))
	//			if(L_error_message.isDisplayed()) {
	//				String error_msg=L_error_message.getText()
	//				WebUI.comment(error_msg)
	//				error_msgs.add(error_msg)
	//			}
	//}
	//			catch(Exception e1)
	//			{
	//				input_boxes[1].sendKeys(Keys.chord(Keys.COMMAND, "a"));
	//				input_boxes[1].sendKeys(Keys.DELETE);
	//				input_boxes[1].sendKeys(Upper_Limit_value)
	//				WebUI.comment("entered value into a upper limit")
	//	try {
	//				WebElement U_error_message=input_boxes[1].findElement(By.xpath("//span[contains(@class,'absolute')  and contains(@class,'text-white bg-red')]"))
	//				if(U_error_message.isDisplayed()) {
	//					String error_msg=U_error_message.getText()
	//					WebUI.comment(error_msg)
	//					error_msgs.add(error_msg)
	//				}
	//	}
	//	catch(Exception e2)
	//				{
	//					continue
	//					WebUI.comment("In second catch block")
	//				}
	//				WebUI.comment("In first catch block")
	//				return 	error_msgs
	//			}
	//
	//			}
	//
	//	}

	public Map<String, Map<String, String>> getReferenceRangeValues(){
		driver = DriverFactory.getWebDriver()
		List<WebElement> Measurands_row = driver.findElements(By.xpath("//div[contains(@class,'grid') and not(contains(@class,'sticky top'))]"))
		//ArrayList<String> ref_range_values = new ArrayList<>()
		Map<String, Map<String, String>> referenceRange = [:]
		for (int i = 0; i < Measurands_row.size(); i++) {
			try {
				List<WebElement> input_boxes = Measurands_row.get(i).findElements(By.xpath("./div/input"))
				List<WebElement> Item_name=Measurands_row.get(i).findElements(By.xpath(".//p[@class='text-start']"))

				//get item name
				String item_name = Item_name[0].getText()
				WebUI.comment("Item name is ${item_name}")

				// get lower limit values
				String lower_limit = input_boxes[0].getAttribute('value')
				WebUI.comment("Lower limit value is ${lower_limit}")

				//get upper limit values
				String upper_limit = input_boxes[1].getAttribute('value')
				WebUI.comment("Upper limit value is ${upper_limit}")



				referenceRange[item_name] = [lower: lower_limit, upper: upper_limit]

				//referenceRangeWithUnit["HGB"] = [lower: "11.0", upper: "19.0"]
			}catch (Exception ex) {
				WebUI.comment("⚠️ Error processing row " + (i+1) + ": " + ex.message)
				continue // Continue with the next row
			}
		}
		println(referenceRange)
		return referenceRange
	}




	//	public ArrayList<String> enterValueIntoTheFields(String unit_type,String Lower_Limit_Value, String Upper_Limit_value) {
	//		ArrayList<String> error_msgs = new ArrayList<>()
	//		driver = DriverFactory.getWebDriver()
	//		List<WebElement> Measurands_row = driver.findElements(By.xpath("//div[contains(@class,'grid') and not(contains(@class,'sticky top'))]"))
	//
	//		for (int i = 0; i < Measurands_row.size(); i++) {
	//			try {
	//				List<WebElement> input_boxes = Measurands_row.get(i).findElements(By.xpath("./div/input"))
	//				List<WebElement> unit_sign=Measurands_row.get(i).findElements(By.xpath(".//p[@class='text-start']"))
	//
	//				//Get the units
	//				String unit_name = unit_sign[1].getText()
	//				WebUI.comment("Item name is ${unit_name}")
	//
	//				if(unit_name.equals(unit_type)) {
	//					// Enter lower limit
	//					input_boxes[0].sendKeys(Keys.chord(Keys.COMMAND, "a"))
	//					input_boxes[0].sendKeys(Keys.DELETE)
	//					input_boxes[0].sendKeys(Lower_Limit_Value)
	//					WebUI.comment("Entered value into lower limit")
	//
	//					// Check lower limit error
	//					try {
	//						WebElement L_error_message = input_boxes[0].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
	//						if (L_error_message.isDisplayed()) {
	//							String error_msg = L_error_message.getText()
	//							WebUI.comment("Lower limit error: " + error_msg)
	//							error_msgs.add(error_msg)
	//						}
	//					} catch (Exception e1) {
	//						WebUI.comment("No error found in lower limit")
	//					}
	//
	//					// Enter upper limit
	//					input_boxes[1].sendKeys(Keys.chord(Keys.COMMAND, "a"))
	//					input_boxes[1].sendKeys(Keys.DELETE)
	//					input_boxes[1].sendKeys(Upper_Limit_value)
	//					WebUI.comment("Entered value into upper limit")
	//
	//					// Check upper limit error
	//					try {
	//						WebElement U_error_message = input_boxes[1].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
	//						if (U_error_message.isDisplayed()) {
	//							String error_msg = U_error_message.getText()
	//							WebUI.comment("Upper limit error: " + error_msg)
	//							error_msgs.add(error_msg)
	//						}
	//					} catch (Exception e2) {
	//						WebUI.comment("No error found in upper limit")
	//					}
	//
	//				}else if (unit_name.equals(unit_type) ||unit_name.equals("g/dL") || unit_name.equals("pg") || unit_name.equals("fL")){
	//					WebUI.comment("entred into else part")
	//				// Enter lower limit
	//				input_boxes[0].sendKeys(Keys.chord(Keys.COMMAND, "a"))
	//				input_boxes[0].sendKeys(Keys.DELETE)
	//				input_boxes[0].sendKeys(Lower_Limit_Value)
	//				WebUI.comment("Entered value into lower limit")
	//
	//				// Check lower limit error
	//				try {
	//					WebElement L_error_message = input_boxes[0].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
	//					if (L_error_message.isDisplayed()) {
	//						String error_msg = L_error_message.getText()
	//						WebUI.comment("Lower limit error: " + error_msg)
	//						error_msgs.add(error_msg)
	//					}
	//				} catch (Exception e1) {
	//					WebUI.comment("No error found in lower limit")
	//				}
	//
	//				// Enter upper limit
	//				input_boxes[1].sendKeys(Keys.chord(Keys.COMMAND, "a"))
	//				input_boxes[1].sendKeys(Keys.DELETE)
	//				input_boxes[1].sendKeys(Upper_Limit_value)
	//				WebUI.comment("Entered value into upper limit")
	//
	//				// Check upper limit error
	//				try {
	//					WebElement U_error_message = input_boxes[1].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
	//					if (U_error_message.isDisplayed()) {
	//						String error_msg = U_error_message.getText()
	//						WebUI.comment("Upper limit error: " + error_msg)
	//						error_msgs.add(error_msg)
	//					}
	//				} catch (Exception e2) {
	//					WebUI.comment("No error found in upper limit")
	//				}
	//			}
	//			} catch (Exception ex) {
	//				WebUI.comment("⚠️ Error processing row " + (i+1) + ": " + ex.message)
	//				continue // Continue with the next row
	//			}
	//		}
	//
	//		return error_msgs
	//	}


	public ArrayList<String> enterValueIntoTheFields(List<String> allowedUnits, String Lower_Limit_Value, String Upper_Limit_value) {
		ArrayList<String> error_msgs = new ArrayList<>()
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> Measurands_row = driver.findElements(By.xpath("//div[contains(@class,'grid') and not(contains(@class,'sticky top'))]"))

		for (int i = 0; i < Measurands_row.size(); i++) {
			try {
				List<WebElement> input_boxes = Measurands_row.get(i).findElements(By.xpath("./div/input"))
				List<WebElement> unit_sign = Measurands_row.get(i).findElements(By.xpath(".//p[@class='text-start']"))

				String unit_name = unit_sign[1].getText().trim()
				WebUI.comment("➡️ Unit found: ${unit_name}")

				// ✅ Check if unit_name is in the allowedUnits list
				if (allowedUnits.contains(unit_name)) {
					WebUI.comment("✅ Allowed unit matched: ${unit_name}")

					// Enter lower limit
					input_boxes[0].sendKeys(Keys.chord(Keys.COMMAND, "a"))
					input_boxes[0].sendKeys(Keys.DELETE)
					input_boxes[0].sendKeys(Lower_Limit_Value)
					WebUI.comment("Entered lower limit: ${Lower_Limit_Value}")

					// Check lower limit error
					try {
						WebElement L_error_message = input_boxes[0].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
						if (L_error_message.isDisplayed()) {
							String error_msg = L_error_message.getText()
							WebUI.comment("❌ Lower limit error: " + error_msg)
							error_msgs.add(error_msg)
						}
					} catch (Exception e1) {
						WebUI.comment("✅ No error in lower limit")
					}

					// Enter upper limit
					input_boxes[1].sendKeys(Keys.chord(Keys.COMMAND, "a"))
					input_boxes[1].sendKeys(Keys.DELETE)
					input_boxes[1].sendKeys(Upper_Limit_value)
					WebUI.comment("Entered upper limit: ${Upper_Limit_value}")

					// Check upper limit error
					try {
						WebElement U_error_message = input_boxes[1].findElement(By.xpath(".//following::span[contains(@class,'absolute') and contains(@class,'text-white bg-red')]"))
						if (U_error_message.isDisplayed()) {
							String error_msg = U_error_message.getText()
							WebUI.comment("❌ Upper limit error: " + error_msg)
							error_msgs.add(error_msg)
						}
					} catch (Exception e2) {
						WebUI.comment("✅ No error in upper limit")
					}
				} else {
					WebUI.comment("⏭️ Skipping unit: ${unit_name}")
				}
			} catch (Exception ex) {
				WebUI.comment("⚠️ Error processing row ${i + 1}: ${ex.message}")
				continue
			}
		}
		return error_msgs
	}



	public void selectSpeciesFromDropDown(String Species) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10))

		// Get the currently selected species text (dynamically)
		WebElement current_Species = driver.findElement(
				By.xpath("//div[contains(text(),'Canine') or contains(text(),'Feline') or contains(text(),'Equine')]"))
		if (current_Species.getText().equalsIgnoreCase(Species)) {
			WebUI.comment("Species already selected: " + Species)
			return
		} else {
			current_Species.click()
			// Wait for dropdown options
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
					By.xpath("//div[contains(@class,'px-4 py-4') and contains(@class,'border-b')]")))
			List<WebElement> speciesOptions = driver.findElements(
					By.xpath("//div[contains(@class,'px-4 py-4') and contains(@class,'border-b')]"))
			boolean speciesFound = false
			for (WebElement option : speciesOptions) {
				if (option.getText().equalsIgnoreCase(Species)) {
					option.click()
					speciesFound = true
					WebUI.comment("Species selected: " + Species)
					break
				}
			}
			if (!speciesFound) {
				throw new RuntimeException("Species '" + Species + "' not found in dropdown options.")
			}
			// Re-locate to confirm current species is selected after click
			WebElement updatedSpecies = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[contains(text(),'Canine') or contains(text(),'Feline') or contains(text(),'Equine')]")
					))
			assert updatedSpecies.getText().equalsIgnoreCase(Species) : ":x: Required species not selected: " + Species
		}
	}


	public Map<String, Map<String, String>> getExpectedDefultReferenceRange(String Species){

		Map<String, Map<String, String>> Expected_Default_refRange = [:]
		TestData default_data = findTestData('Data Files/default_dataset_for_reference_range')
		//TestData default_data = findTestData('Data Files/Dammy_data')

		for(int i=1; i<=20;i++) {
			String Measurand_name=default_data.getValue('Measurand_name', i)

			String Limits=default_data.getValue(Species, i)

			ArrayList<String> limits=Limits.split("-")
			WebUI.comment(Measurand_name)
			WebUI.comment(limits[0])
			WebUI.comment(limits[1])
			Expected_Default_refRange[Measurand_name]=[lower:limits[0],upper:limits[1]]
			WebUI.comment("${Expected_Default_refRange}")
		}
		return Expected_Default_refRange
	}
	public void checkResetToDefaultFunctionality(Map<String, Map<String, String>> default_ref_range_after_reset,Map<String, Map<String, String>> Expected_Default_refRange) {
		if (default_ref_range_after_reset.equals(Expected_Default_refRange)) {
			KeywordUtil.markPassed("✅ Maps are equal")
		} else {
			WebUI.comment("Referance ranges after reset are: ${default_ref_range_after_reset}")
			WebUI.comment("Expected Referance ranges are : ${Expected_Default_refRange}")
			KeywordUtil.markFailed("❌ Maps are NOT equal")
		}
	}


	def Map<String, String> verifyReferenceItemsAndUnitsPresent() {
		WebDriver driver = DriverFactory.getWebDriver()
		Map<String, String> extarcted_actual_items_and_units= [:]
		// Get all measurand rows except the sticky header
		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'grid') and not(contains(@class,'sticky top'))]"))

		if (rows.isEmpty()) {
			WebUI.comment("❌ No reference rows found.")
			return
		}

		WebUI.comment("✅ Found ${rows.size()} reference rows.")

		for (int i = 0; i < rows.size(); i++) {
			try {
				WebElement row = rows[i]

				// Extract Item Name (1st element - p tag)
				String item = row.findElement(By.xpath("./p[1]")).getText().trim()

				// Extract Unit (last element - also p tag)
				String unit = row.findElement(By.xpath("./p[last()]")).getText().trim()

				WebUI.comment("Row ${i+1} → Item: '${item}', Unit: '${unit}'")

				if (unit == null || unit.isEmpty()) {
					WebUI.comment("❌ Missing unit for item: ${item}")
				} else {
					WebUI.comment("✅ ${item} has unit: ${unit}")
					extarcted_actual_items_and_units[item]=[unit]
				}
			} catch (Exception e) {
				WebUI.comment("⚠️ Error while processing row ${i + 1}: ${e.message}")
			}
		}
		WebUI.comment("${extarcted_actual_items_and_units}")
		return extarcted_actual_items_and_units
	}
}
