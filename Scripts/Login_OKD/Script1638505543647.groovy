import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://oauth-openshift.apps.arrow-v2.edo.globetel.com/login/arrow-v2-users?then=%2Foauth%2Fauthorize%3Fclient_id%3Dconsole%26idp%3Darrow-v2-users%26redirect_uri%3Dhttps%253A%252F%252Fconsole-openshift-console.apps.arrow-v2.edo.globetel.com%252Fauth%252Fcallback%26response_type%3Dcode%26scope%3Duser%253Afull%26state%3De245d89f')

WS.delay(10)

WebUI.setText(findTestObject('Page_Login - OKD/input_Username_username'), 'zx012389')

WebUI.setText(findTestObject('Page_Login - OKD/input_Password_password'), 'zx012389')

WebUI.click(findTestObject('Page_Login - OKD/button_Log in'))

WebUI.click(findTestObject('Page_Login - OKD/a_arrow-v2-users'))

WebUI.setText(findTestObject('Page_Login - OKD/input_Username_username'), 'zx012389')

WebUI.setText(findTestObject('Page_Login - OKD/input_Password_password'), 'zx012389')

WebUI.click(findTestObject('Page_Login - OKD/button_Log in'))

WebUI.click(findTestObject('Page_Login - OKD/Page_Topology  OKD/button_Skip tour'))

