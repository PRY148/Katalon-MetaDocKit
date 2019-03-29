import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.List as List
import org.junit.After as After
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement as WebElement
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

WebUI.callTestCase(findTestCase('Basicos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-1 > span.mat-content\').trigger(\'click\')', [])

//WebUI.delay(3)
WebUI.executeJavaScript('$(\'#cdk-accordion-child-1 > div > div > a:nth-child(1) > span\').trigger(\'click\');', [])

WebUI.delay(3)

//Seleccion de un registro de la tabla...

//Para una lista que devuelva los elemntos Web utilizar: java.util.List 
java.util.List<WebElement> prueba = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipo contenido/btnDesplegarOpciones'), 3)

//Obtengo el tamaño del List
WebUI.comment('# de Elementos: ' + prueba.size())

//Se crean variables para el Iterador y contador de los elementos... 
int numero = 0
int index = 0

//Con el For obtenemos cada elemento de la lista...
for (index = 0; index < prueba.size(); index++) {
	numero = (numero + index)
	WebUI.comment((('Elemento en la posicion: ' + numero) + ' tiene el link: ') + (prueba[index]))
}

//Creamos una variable de tipo WebElement que nos permita acceder al elemento elegido de acuerdo a la List
//Y por ultimo generamos la accion requerida...
WebElement btn1 = prueba.get(3);
btn1.click()

WebUI.delay(5)

//Seleccionando una Opcion del Registro seleccionado, Edit or Delete...
java.util.List<WebElement> elementos = WebUiCommonHelper.findWebElements(findTestObject('Config/Tipo contenido/btnEditAndDelete'), 
    2)

//Se obtiene el tamaño de la lista...
WebUI.comment('Number of elements: ' + elementos.size())

//Mediante el For se recorre el ArrayList y se obtine el nombre y posicion de cada elemento
int num = 0
for (i = 0; i < elementos.size(); i++) {
    
	num = (num + i)
    WebUI.comment((('Elemento en la posicion: ' + num) + ' tiene el link: ') + (elementos[i]))
}

WebElement btn = elementos.get(0);
btn.click();

WebUI.delay(3)

WebUI.setText(findTestObject('Config/Tipo contenido/inputNombre TipoCrearEditar'), 'Ediatando un registro')

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-content-type-create-form > div > div > form > mat-card > div > div > button.mat-raised-button.mat-primary > span\').trigger(\'click\');', 
    [])

