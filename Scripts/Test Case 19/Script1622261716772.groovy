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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDrive

System.setProperty('webdriver.chrome.driver', 'E:\\Program\\Katalon_Studio_Windows_64-8.0.0\\Katalon_Studio_Windows_64-8.0.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

System.setProperty('webdriver.gecko.driver', 'E:\\Program\\Katalon_Studio_Windows_64-8.0.0\\Katalon_Studio_Windows_64-8.0.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe')

WebDriver chrome = new ChromeDriver()

WebDriver ff = new FirefoxDriver()

// let Katalon know that chrome driver is usedDriverFactory.changeWebDriver(chrome)// Katalon keywords work as usual
DriverFactory.changeWebDriver(chrome)

WebUI.callTestCase(findTestCase('Test Case 15'), [('username') : 'oldtester@gmail.com', ('password') : 'Hcmus2017!', ('isCloseBrowser') : false
        , ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(ff)

WebUI.callTestCase(findTestCase('Test Case 15'), [('username') : 'supremetester@gmail.com', ('password') : 'Hcmus2017!', ('isCloseBrowser') : false
        , ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

TestObject channelObject = new TestObject()

channelObject.setSelectorMethod(SelectorMethod.BASIC)

channelObject.addProperty('tag', ConditionType.EQUALS, 'a', true)

channelObject.addProperty('class', ConditionType.EQUALS, 'sidebar-item', true)

channelObject.addProperty('text', ConditionType.EQUALS, channelName, true)

WebUI.click(channelObject)

WebUI.setText(findTestObject('Object Repository/Mattermost_channel/textarea_chatbar'), 'Hello')

WebUI.sendKeys(findTestObject('Object Repository/Mattermost_channel/textarea_chatbar'), Keys.chord(Keys.ENTER))

DriverFactory.changeWebDriver(chrome)

WebUI.click(channelObject)

WebUI.setText(findTestObject('Object Repository/Mattermost_channel/textarea_chatbar'), 'Hi')

WebUI.sendKeys(findTestObject('Object Repository/Mattermost_channel/textarea_chatbar'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

DriverFactory.changeWebDriver(ff)

WebUI.closeBrowser()