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
import com.kms.katalon.core.testdata.CSVData as CSVData
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://deloyweb.herokuapp.com/signup_email?id=qznkk1ofgjyndbpkqsyg3mxcah&fbclid=IwAR07I26kIi8a4wvhACX1Ty5ujCJX7ZVB3kuvx48dbsUg8xbNHHv_crAyzgY')

WebUI.setText(findTestObject('Object Repository/Mattermost_login/input_loginId'), email)

WebUI.setText(findTestObject('Object Repository/Mattermost_signup/input_username'), username)

WebUI.setText(findTestObject('Object Repository/Mattermost_signup/input_password'), password)

WebUI.click(findTestObject('Object Repository/Mattermost_login/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Mattermost_login/notification'), 10)

WebUI.closeBrowser()

