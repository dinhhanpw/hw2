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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://deloyweb.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Mattermost_login/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'oldtester@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Mattermost_login/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'qj1BTyeJoE60NzCSyvy8/Q==')

WebUI.click(findTestObject('Object Repository/Mattermost_login/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Mattermost_dashboard/Page_Town Square - HCMUS Mattermost/textarea_(optional)_newChannelPurpose'))

WebUI.click(findTestObject('Mattermost_dashboard/Page_Town Square - HCMUS Mattermost/input_Type_channelType'))

WebUI.setText(findTestObject('Mattermost_dashboard/Page_Town Square - HCMUS Mattermost/input_Name_newChannelName'), name)

WebUI.setText(findTestObject('Mattermost_dashboard/Page_Town Square - HCMUS Mattermost/textarea_(optional)_newChannelPurpose'), 
    purpose)

WebUI.click(findTestObject('Mattermost_dashboard/Page_Town Square - HCMUS Mattermost/span_Create Channel'))

WebUI.verifyElementPresent(findTestObject('Mattermost_dashboard/Page_Test channel - HCMUS Mattermost/div_Beginning of Test channelThis is the st_5cb850'), 
    10)

WebUI.closeBrowser()

