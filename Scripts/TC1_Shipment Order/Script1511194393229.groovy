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

WebUI.openBrowser(GlobalVariable.G_MY_SITE)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('LogIn/LogIn'), 30)

WebUI.click(findTestObject('LogIn/LogIn'))

WebUI.waitForElementVisible(findTestObject('LogIn/UserId'), 10)

WebUI.setText(findTestObject('LogIn/UserId'), 'panship@pos.com.my')

WebUI.setText(findTestObject('LogIn/Password'), GlobalVariable.password)

WebUI.click(findTestObject('LogIn/LogIn_uCustoms'))

WebUI.waitForElementVisible(findTestObject('Menu/Ship_Cargo'), 10)

WebUI.click(findTestObject('Menu/Ship_Cargo'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('Menu/Journey_Manifest'), 10)

WebUI.click(findTestObject('Menu/Journey_Manifest'))

WebUI.waitForElementVisible(findTestObject('Menu/ShipmentOrder'), 10)

WebUI.click(findTestObject('Menu/ShipmentOrder'))

WebUI.switchToFrame(findTestObject('ShipmentInfo/Frame'), 10)

WebUI.click(findTestObject('ShipmentInfo/AddShipment'))

WebUI.setText(findTestObject('ShipmentInfo/BookingReferenceNo'), 'NAZ')

WebUI.setText(findTestObject('ShipmentInfo/ExportJourneyNo'), '%%')

WebUI.click(findTestObject('ShipmentInfo/selectEXPjourney'))

WebUI.click(findTestObject('ShipmentInfo/Create'))

WebUI.click(findTestObject('HBPartiesDetails/Link'))

WebUI.click(findTestObject('HBPartiesDetails/HBpartiesMenu'))

WebUI.waitForPageLoad(30)

WebUI.switchToFrame(findTestObject('HBPartiesDetails/Frame'), 10)

WebUI.setText(findTestObject('HBPartiesDetails/ConsignorRegistered'), 'AD')

WebUI.click(findTestObject('HBPartiesDetails/SelectConsignorRegistered'))

WebUI.scrollToElement(findTestObject('HBPartiesDetails/Consignee'), 5)

WebUI.setText(findTestObject('HBPartiesDetails/Consignee'), 'NAZ')

WebUI.setText(findTestObject('HBPartiesDetails/ConsigneeAddress'), 'AD')

WebUI.setText(findTestObject('HBPartiesDetails/ConsigneeCountry'), 'Japan')

WebUI.click(findTestObject('HBPartiesDetails/selectConsigneeCountry'))

WebUI.scrollToElement(findTestObject('HBPartiesDetails/Create'), 5)

WebUI.click(findTestObject('HBPartiesDetails/Create'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('HBPartiesDetails/Close'))

WebUI.switchToFrame(findTestObject('ShipmentInfo/Frame'), 10)

WebUI.click(findTestObject('ShipmentInfo/Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

