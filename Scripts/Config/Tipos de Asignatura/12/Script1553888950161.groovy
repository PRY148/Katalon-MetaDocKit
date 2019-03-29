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
import org.openqa.selenium.Keys as Keys



WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Tipo de asignatura'))

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Externa'))

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_name'), 
    'Prueba de Calidad')

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_effort'), 
    '10')

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/input_subject_num_sessions'), 
    '5')

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/textarea_subject_objective'), 
    'Generar una prueba para calidad...')

WebUI.setText(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/textarea_subject_scope'), 
    'La perfeccion del producto final...')

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/span_Evaluaciones'))

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option'))

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option_1'))

WebUI.click(findTestObject('Gestion de Asignaturas de Formacion/Crear/Detalles de asignatura/Page_FrontEnd/mat-pseudo-checkbox_mat-option_2'))

WebUI.closeBrowser()

