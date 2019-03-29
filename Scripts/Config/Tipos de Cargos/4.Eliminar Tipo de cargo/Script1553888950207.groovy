import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Basicos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-1 > span.mat-content\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#cdk-accordion-child-1 > div > div > a:nth-child(7) > span\').trigger(\'click\')', [])

WebUI.delay(5)

//Desplegar lista de opciones...
List<WebElement> elementsPosition = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipos de cargo/Page_FrontEnd/btnDesplegarCargos'),
	2)

WebUI.comment('Numero de programas en pantalla: ' + elementsPosition.size())

int numPosition = 0

for (i = 0; i < elementsPosition.size(); i++) {
	numPrograms = (numPosition + i)

	WebUI.comment((('Elemento #: ' + numPosition) + ' es ') + (elementsPosition[i]))
}

WebElement selectedItem = elementsPosition.get(3)

WebUI.delay(5)

selectedItem.click()

//Seleccionar una opcion Edit or Delete
List<WebElement> selectedActions = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipos de cargo/Page_FrontEnd/btnAccionesCargos'),
	2)

WebUI.comment('# de acciones: ' + selectedActions.size())

int numActions = 0

for (y = 0; y < selectedActions.size(); y++) {
	numActions = (numActions + y)

	WebUI.comment((('Posicion: ' + numActions) + ' elemento: ') + (selectedActions[y]))
}

WebElement selectedItem2 = selectedActions.get(1)

WebUI.delay(5)

selectedItem2.click()

WebUI.delay(5)

List<WebElement> DeleteItems = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Config/Tipo contenido/DeleteInvolucrados'), 2)
WebUI.comment('# de acciones: '+DeleteItems.size())

int numDelet = 0
for(x=0;x < DeleteItems.size(); x++){
	numDelet = numDelet + y
	WebUI.comment('Posicion: '+numDelet+' elemento: '+DeleteItems[x])
}

WebElement EditDelete = DeleteItems.get(1)
WebUI.delay(5)
EditDelete.click()