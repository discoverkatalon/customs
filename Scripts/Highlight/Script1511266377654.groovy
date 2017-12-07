import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://10.138.77.101/ucustomsportcstest/Main.aspx')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('LogIn/LogIn'), 30)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('LogIn/LogIn'), 30)

WebUI.executeJavaScript('arguments[0].setAttribute(\'style\',\'background: yellow; border: 5px solid red;\');', [element])

WebUI.click(findTestObject('LogIn/LogIn'))

WebUI.waitForElementVisible(findTestObject('LogIn/UserId'), 10)

WebUI.setText(findTestObject('LogIn/UserId'), 'panship@pos.com.my')

WebUI.setText(findTestObject('LogIn/Password'), 'q')

WebUI.click(findTestObject('LogIn/LogIn_uCustoms'))

