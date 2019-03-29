import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Basicos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Esto que hace ? ...')

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-1 > span.mat-content\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#cdk-accordion-child-1 > div > div > a:nth-child(1) > span\').trigger(\'click\');', [])

WebUI.delay(3)

String texto = WebUI.getText(findTestObject('lista'))
String texto2 = WebUI.getText(findTestObject('main'))
System.out.println("El texto que habia era: "+texto)












/*WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-content-types-list > div > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-trigger > button > span\').trigger(\'click\');', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-content-types-list > div > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-actions > button > span > a > mat-icon\').trigger(\'click\');', 
    [])

WebUI.delay(3)*/

/*String good = WebUI.getText(findTestObject('select'))
String vibes = 'HABILITADO'

if (good==vibes) {
	System.out.println('Esta Correcto')
}else{
	System.out.println('Esta mal...')
}*/


/*List<WebElement> elements = WebUiCommonHelper.findWebElements(By.className(findTestObject('object')))
System.out.println("Number of elements:" +elements.getSize());

for (int i=0; i<elements.getSize();i++){
	System.out.println("Radio button text:" + elements.getItems(i));
  }*/

//WebUI.verifyOptionSelectedByLabel(findTestObject('select'), 'Habilitado', false, 20, FailureHandling.STOP_ON_FAILURE)

/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('select'), 3)

boolean status = element.isSelected()

System.out.println(status.toString())*/

