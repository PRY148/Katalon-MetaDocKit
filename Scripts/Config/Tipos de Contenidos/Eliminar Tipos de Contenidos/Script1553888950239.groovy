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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Basicos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-1 > span.mat-content\').trigger(\'click\')', [])

//WebUI.delay(3)
WebUI.executeJavaScript('$(\'#cdk-accordion-child-1 > div > div > a:nth-child(1) > span\').trigger(\'click\');', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-content-types-list > div > app-paginator > mat-paginator > div > div > div.mat-paginator-range-actions > button.mat-paginator-navigation-next.mat-icon-button > span\').trigger(\'click\')', 
    [])

WebUI.delay(3)

//Seleccion de un registro de la tabla...
//Para una lista que devuelva los elemntos Web utilizar: java.util.List 
List<WebElement> prueba1 = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipo contenido/btnDesplegarOpciones'), 
    3)

//Obtengo el tamaño del List
WebUI.comment('# de Elementos: ' + prueba1.size())

//Se crean variables para el Iterador y contador de los elementos... 
int numero = 0

int index = 0

//Con el For obtenemos cada elemento de la lista...
for (index = 0; index < prueba1.size(); index++) {
    numero = (numero + index)

    WebUI.comment((('Elemento en la posicion: ' + numero) + ' tiene el link: ') + (prueba1[index]))
}

//Creamos una variable de tipo WebElement que nos permita acceder al elemento elegido de acuerdo a la List
//Y por ultimo generamos la accion requerida...
WebElement btn2 = prueba1.get(1)

btn2.click()

WebUI.delay(5)

//Seleccionando una Opcion del Registro seleccionado, Edit or Delete...
List<WebElement> elementos1 = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipo contenido/btnEditAndDelete'), 
    2)

//Se obtiene el tamaño de la lista...
WebUI.comment('Number of elements: ' + elementos1.size())

//Mediante el For se recorre el ArrayList y se obtine el nombre y posicion de cada elemento
int num = 0

for (i = 0; i < elementos1.size(); i++) {
    num = (num + i)

    WebUI.comment((('Elemento en la posicion: ' + num) + ' tiene el link: ') + (elementos1[i]))
}

WebElement btn3 = elementos1.get(1)

btn3.click()

WebUI.delay(3)

List<WebElement> deleteElements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Config/Tipo contenido/Delete'), 2)

WebUI.comment('Numero de Elementos: '+ deleteElements.size())

int numDelete = 0
for(y = 0; y < deleteElements.size(); y++){
	numDelete = (numDelete + y)
	WebUI.comment('Elemento en la posicion: '+ numDelete + ' tiene el objeto: '+ deleteElements[y])
}

WebElement btnEleccion = deleteElements.get(1)
btnEleccion.click()





