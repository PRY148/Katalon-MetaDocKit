import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Basicos/Login'), [:])

WebUI.navigateToUrl('http://167.99.147.38/training/#/home')

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-0 > span.mat-expansion-indicator.ng-tns-c19-10.ng-trigger.ng-trigger-indicatorRotate.ng-star-inserted\').trigger(\'click\');', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#cdk-accordion-child-0 > div > div > a:nth-child(1) > span\').trigger(\'click\');', null)

WebUI.delay(3)

String txtLlegado = WebUI.getText(findTestObject('Texto'))

String txtEsperado = 'Gestión de Asignaturas de Formación'

if (txtLlegado == txtEsperado) {
	System.out.println('El texto tiene buena Ortografia')
} else {
	System.out.println('Esta mal Redactado')
}
