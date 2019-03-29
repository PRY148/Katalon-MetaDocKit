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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement

/*WebUI.callTestCase(findTestCase('Basicos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-1 > span.mat-content\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#cdk-accordion-child-1 > div > div > a:nth-child(2) > span\').trigger(\'click\')', [])*/

WebUI.delay(3)

//Click despliegue de opciones...
java.util.List<WebElement> listOptions = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Config/Tipo contenido/btnDesplegarOpciones'), 2)

WebUI.comment('El numero de Elementos es: '+ listOptions.size())

int numElementos = 0
for(i=0; i < listOptions.size(); i++){
	numElementos = numElementos + i
	WebUI.comment('El elemento en la posicion '+numElementos+' es: '+ listOptions[i])
}

WebElement btnOptions = listOptions.get(3)
btnOptions.click()

//Click Seleccion de Edit or Delete
WebUI.delay(5)
java.util.List<WebElement> listActions = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Config/Tipo contenido/btnDeleteInvolucrados'), 2)

WebUI.comment('El numero de elementos es: '+ listActions.size())

int numActions = 0
for(x=0; x < listActions.size(); x++){
	numActions = numActions + i
	WebUI.comment('Elemento en posicion '+numActions+' es: '+ listActions[x])
}

WebElement btnActions = listActions.get(1)
WebUI.delay(5)
btnActions.click()

WebUI.delay(3)

WebUI.delay(5)
List<WebElement> deleteElements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Config/Tipo contenido/DeleteInvolucrados'), 2)

WebUI.comment('Numero de Elementos: '+ deleteElements.size())

int numDelete = 0
for(y = 0; y < deleteElements.size(); y++){
	numDelete = (numDelete + y)
	WebUI.comment('Elemento en la posicion: '+ numDelete + ' tiene el objeto: '+ deleteElements[y])
}

WebElement btnEleccion = deleteElements.get(1)
WebUI.delay(5)
btnEleccion.click()

