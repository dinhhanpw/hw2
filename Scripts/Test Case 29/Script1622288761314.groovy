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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Case 15'), [('username') : 'oldtester@gmail.com', ('password') : 'Hcmus2017!', ('isCloseBrowser') : false], 
    FailureHandling.STOP_ON_FAILURE)

TestObject channelObject = new TestObject()

channelObject.setSelectorMethod(SelectorMethod.BASIC)

channelObject.addProperty('tag', ConditionType.EQUALS, 'a', true)

channelObject.addProperty('class', ConditionType.EQUALS, 'sidebar-item', true)

channelObject.addProperty('text', ConditionType.EQUALS, channelName, true)

WebUI.click(channelObject)

WebUI.click(findTestObject('Object Repository/Mattermost_channel/button_features channel dropdown'))

TestObject viewButtonObject = new TestObject()

viewButtonObject.setSelectorMethod(SelectorMethod.BASIC)

viewButtonObject.addProperty('tag', ConditionType.EQUALS, 'button', true)

viewButtonObject.addProperty('text', ConditionType.EQUALS, 'Edit Channel Header', true)

WebUI.click(viewButtonObject)

WebUI.setText(findTestObject('Object Repository/Mattermost_channel/textarea_edit header'), '[private-test](https://drive.google.com/)')

WebUI.click(findTestObject('Object Repository/Mattermost_channel/button_save'))

WebUI.closeBrowser()