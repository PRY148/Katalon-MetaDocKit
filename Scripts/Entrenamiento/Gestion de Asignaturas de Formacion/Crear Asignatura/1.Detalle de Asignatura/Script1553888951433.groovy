import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.WaitDispatchSupport
import java.io.File as File
import java.util.TreeMap.DescendingSubMap.DescendingEntrySetView

import org.junit.After as After
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

import com.googlecode.javacv.cpp.opencv_videostab.IFrameSource
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.org.apache.bcel.internal.generic.RETURN
import com.thoughtworks.selenium.Wait
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Ingreso (Login) y Acceso al Crear
WebUI.callTestCase(findTestCase('Basicos/Login'), [:])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-expansion-panel-header-0 > span.mat-content\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#cdk-accordion-child-0 > div > div > a:nth-child(1) > span\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subjects-list > div > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-trigger > button > span\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subjects-list > div > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-actions > button > span > a > mat-icon\').trigger(\'click\')', 
    [])

//Detalle de Asignatura
WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Tipo de asignatura'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Externa'))

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_name'), 
    'Prueba de Calidad')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_effort'), 
    '10')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_num_sessions'), 
    '5')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/textarea_subject_objective'), 
    'Generar una prueba para calidad...')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/textarea_subject_scope'), 
    'La perfeccion del producto final...')

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Evaluaciones'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option_2'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-tab-content-0-0 > div > form > div.text-left > button\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-trigger > button > span\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-actions > button > span > span > mat-icon\').trigger(\'click\')', 
    [])

WebUI.delay(3)

//Sesiones de Trabajo
/*Este tipo de sintaxis funciona, pero en este caso al encontrar dos elementos con los mismos atributos 
no puede generar el click. Las soluciones es ejecutar un JS o Crear un List de WebElements y cliquear sobre el necesitado
con la posicion que le asigne el ArrayList. 
WebElement span = WebUiCommonHelper.findWebElement(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/span_Tipo'), 2)
span.click()*/
//WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/span_Tipo'))
WebUI.executeJavaScript('$(\'#mat-select-6 > div > div.mat-select-value > span\').trigger(\'click\')', [])

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/span_Virtual'))

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/input_topic_session_number'), 
    '1')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/input_topic_preparation_effort'), 
    '5')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/input_topic_face_effort'), 
    '5')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/input_topic_virtual_effort'), 
    '5')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Sesiones de trabajo/Page_FrontEnd/textarea_topic_observations'), 
    'Nueva sesion para pruebas de calidad...')

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-tab-content-0-1 > div > div:nth-child(1) > app-work-session-form > div > form > div > div > button.mat-raised-button.mat-primary.ng-star-inserted\').trigger(\'click\')', 
    [])

WebUI.executeJavaScript('$(\'#mat-tab-content-0-1 > div > div.text-left.ng-star-inserted > button.mat-raised-button.mat-primary\').trigger(\'click\')', 
    [])

WebUI.delay(3)

//Temario
//No dar click en continuar sino en Agregar...
WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-trigger > button > span\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-actions > button > span > span > mat-icon\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Temario/Page_FrontEnd/span_Tipo tema'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Temario/Page_FrontEnd/span_Conocimiento Formal'))

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Temario/Page_FrontEnd/input_topic_name'), 'Calidad de Software')

WebUI.delay(3)

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Temario/Page_FrontEnd/input_topic_effort'), '5')

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-tab-content-3-2 > div > div:nth-child(1) > app-topic-form > div > form > div > div > button.mat-raised-button.mat-primary.ng-star-inserted\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-tab-content-0-2 > div > div:nth-child(1) > app-topic-form > div > form > div > div > button.mat-raised-button.mat-primary.ng-star-inserted\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'#mat-tab-content-0-2 > div > div.text-left.ng-star-inserted > button.mat-raised-button.mat-primary\').trigger(\'click\')',
	[])


//Material de Apoyo
WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-trigger > button > span\').trigger(\'click\')', 
    [])

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > app-root > div > mat-sidenav-container > mat-sidenav-content > div > div > app-subject-create-form > app-floating-actions-buttons > eco-fab-speed-dial > div > eco-fab-speed-dial-actions > button > span > span > mat-icon\').trigger(\'click\')', 
    [])

WebUI.delay(3)

//Detalles del Material 4.1
WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/span_Tipo de contenido'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/span_Anexos'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/span_Sesiones vinculadas'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/span_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/button_Continuar'))

WebUI.delay(3)

//Vinculos 4.2
WebElement dropArea = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/target'), 
    2)

DropFile(new File('C:\\Users\\Jessica\\Downloads\\At.pdf'), dropArea, 0, 0)

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/Page_FrontEnd/button_Continuar'))

WebUI.delay(3)

//Presentacion 4.3
WebDriver driver3 = DriverFactory.getWebDriver()
WebDriverWait wait = new WebDriverWait(driver3, 20)
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#materialEditor_ifr')))

WebElement iframe = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Gestion de Asignaturas de Formacion/Crear/Material de Apoyo/iframe'), 2)
driver3.switchTo().frame(iframe)

WebElement item = driver3.findElement(By.xpath('//body[@id="tinymce"]'))
String desc = 'Texto para Katalon'
item.sendKeys(desc)
driver3.switchTo().defaultContent()
//return driver3

WebUI.delay(10)
WebUI.executeJavaScript('$(\'#mat-tab-content-1-2 > div > div > div:nth-child(2) > button.mat-raised-button.mat-primary.ng-star-inserted\').trigger(\'click\')', 
    [])

WebUI.executeJavaScript('$(\'#mat-tab-content-0-3 > div > div:nth-child(3) > button.mat-raised-button.mat-primary\').trigger(\'click\')',
	[])


static void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
    if (!(filePath.exists())) {
        throw new WebDriverException('File not found: ' + filePath.toString())
    }
    
    WebDriver driver = DriverFactory.getWebDriver()

    JavascriptExecutor jse = ((driver) as JavascriptExecutor)

    WebDriverWait wait = new WebDriverWait(driver, 30)

    String JS_DROP_FILE = (((((((((((((((((((((((('var target = arguments[0],' + '    offsetX = arguments[1],') + '    offsetY = arguments[2],') + 
    '    document = target.ownerDocument || document,') + '    window = document.defaultView || window;') + '') + 'var input = document.createElement(\'INPUT\');') + 
    'input.type = \'file\';') + 'input.style.display = \'none\';') + 'input.onchange = function () {') + '  var rect = target.getBoundingClientRect(),') + 
    '      x = rect.left + (offsetX || (rect.width >> 1)),') + '      y = rect.top + (offsetY || (rect.height >> 1)),') + 
    '      dataTransfer = { files: this.files };') + '') + '  [\'dragenter\', \'dragover\', \'drop\'].forEach(function (name) {') + 
    '    var evt = document.createEvent(\'MouseEvent\');') + '    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);') + 
    '    evt.dataTransfer = dataTransfer;') + '    target.dispatchEvent(evt);') + '  });') + '') + '  setTimeout(function () { document.body.removeChild(input); }, 25);') + 
    '};') + 'document.body.appendChild(input);') + 'return input;'

    WebElement input = ((jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY)) as WebElement)

    input.sendKeys(filePath.getAbsoluteFile().toString())

    wait.until(ExpectedConditions.stalenessOf(input))
}

//Terminar Flujo. Boton Agregar Asignatura...