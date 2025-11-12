import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.Map

public class Launch_App {

	def launchAppAndSetViewPort(){
		// Step 1: Open the browser and navigate to the app
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://localhost:3000')
		// Step 2: Get RemoteWebDriver
		RemoteWebDriver driver = (RemoteWebDriver) DriverFactory.getWebDriver()
		// Step 3: Send full emulation config
		Map<String, Object> metrics = [
			width: 1200,
			height: 1920,
			deviceScaleFactor: 1,
			mobile: false,
			screenOrientation: [angle: 0, type: "portraitPrimary"],
			scale: 0.35
		]
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", metrics)
		driver.executeCdpCommand("Emulation.setVisibleSize", [width: 1200, height: 1920])
		// Optional: Add delay to observe the result
		WebUI.delay(5)
	}
}
