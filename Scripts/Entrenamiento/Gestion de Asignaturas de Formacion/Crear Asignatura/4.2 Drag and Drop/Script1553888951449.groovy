import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.Driver

import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.WebDriverWait
import java.util.concurrent.TimeUnit

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor
import com.google.gson.annotations.Until
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.navigateToUrl('http://167.99.147.38/training/#/add-subject')

WebUI.delay(20)

WebElement dropArea = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/target'), 2)
DropFile(new File('C:\\Users\\Jessica\\Downloads\\Alicante_caso2.ppt'), dropArea, 0, 0)


public static void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
	if(!filePath.exists())
		throw new WebDriverException("File not found: " + filePath.toString());

	WebDriver driver = DriverFactory.getWebDriver()
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebDriverWait wait = new WebDriverWait(driver, 30);

	String JS_DROP_FILE =
		"var target = arguments[0]," +
		"    offsetX = arguments[1]," +
		"    offsetY = arguments[2]," +
		"    document = target.ownerDocument || document," +
		"    window = document.defaultView || window;" +
		"" +
		"var input = document.createElement('INPUT');" +
		"input.type = 'file';" +
		"input.style.display = 'none';" +
		"input.onchange = function () {" +
		"  var rect = target.getBoundingClientRect()," +
		"      x = rect.left + (offsetX || (rect.width >> 1))," +
		"      y = rect.top + (offsetY || (rect.height >> 1))," +
		"      dataTransfer = { files: this.files };" +
		"" +
		"  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
		"    var evt = document.createEvent('MouseEvent');" +
		"    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
		"    evt.dataTransfer = dataTransfer;" +
		"    target.dispatchEvent(evt);" +
		"  });" +
		"" +
		"  setTimeout(function () { document.body.removeChild(input); }, 25);" +
		"};" +
		"document.body.appendChild(input);" +
		"return input;";

	WebElement input =  (WebElement)jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
	input.sendKeys(filePath.getAbsoluteFile().toString());
	wait.until(ExpectedConditions.stalenessOf(input));
	
	
}





