import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('General/Abrir Navegador'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Encabezado Pagina/a_Inicio de sesion'))

WebUI.sendKeys(findTestObject('Inicios de sesion pop-up/input_Correo'), GlobalVariable.usuario)

WebUI.sendKeys(findTestObject('Inicios de sesion pop-up/input_Contrasena'), GlobalVariable.contrasena)

WebUI.click(findTestObject('Inicios de sesion pop-up/button_Identificarse'))

WebUI.waitForElementPresent(findTestObject('Encabezado Pagina/div_Encabezado WordPress'), 5)

WebUI.waitForElementVisible(findTestObject('Encabezado Pagina/div_Encabezado WordPress'), 5)

WebUI.callTestCase(findTestCase('General/Cerrar Sesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Cerrar Navegador'), [:], FailureHandling.STOP_ON_FAILURE)

