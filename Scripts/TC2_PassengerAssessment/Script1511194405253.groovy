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

WebUI.setText(findTestObject('LogIn/UserId'), 'mycdeo@customs.gov.my')

WebUI.setText(findTestObject('LogIn/Password'), GlobalVariable.password)

WebUI.click(findTestObject('LogIn/LogIn_uCustoms'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('Menu/TradeFacilitation'), 10)

WebUI.click(findTestObject('Menu/TradeFacilitation'))

WebUI.waitForElementVisible(findTestObject('Menu/Assesment'), 10)

WebUI.click(findTestObject('Menu/Assesment'))

WebUI.waitForElementVisible(findTestObject('Menu/PassengerAssessments'), 10)

WebUI.click(findTestObject('Menu/PassengerAssessments'))

WebUI.switchToFrame(findTestObject('PassengerAssessment/Frame'), 10)

WebUI.click(findTestObject('PassengerAssessment/New'))

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PassengerAssessment/NRIC-PassportNo'), 'NAZPASS')

WebUI.setText(findTestObject('PassengerAssessment/Name'), 'NAZ')

WebUI.setText(findTestObject('PassengerAssessment/DeclarationSerialNo'), ' NAZ DEC SER NO')

WebUI.setText(findTestObject('PassengerAssessment/Flight-VesselNo'), 'NAZ VSL NO')

WebUI.click(findTestObject('PassengerAssessment/Create'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/AddGoods'))

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/GoodsDescription'), '%%')

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/SelectGoods'))

WebUI.selectOptionByLabel(findTestObject('PassengerAssessment/GoodDetails/PassengerAssessmentType'), 'TEMPORARY USE', false)

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/SerialNo'), ' NAZ SERIAL NO')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Model-Brand'), 'NAZ MOD BRAND')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Quantity'), '12')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/UOM'), '%%')

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/SelectUOM'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/UnitPrice'), '123')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/DutyRate'), '12')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Remarks'), 'NAZ REMARKS')

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/Save'))

WebUI.waitForPageLoad(30)

WebUI.scrollToElement(findTestObject('PassengerAssessment/GoodDetails/AssociateApprovalPermit'), 10)

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/AssociateApprovalPermit'))

WebUI.waitForPageLoad(30)

WebUI.switchToFrame(findTestObject('PassengerAssessment/GoodDetails/Frame'), 10)

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Approval-NO-1'), 'NAZ 1')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Approval-NO-2'), 'NAZ 2')

WebUI.setText(findTestObject('PassengerAssessment/GoodDetails/Approval-NO-3'), 'NAZ 3')

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/SaveApprovalList'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/ApproveRow1'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('PassengerAssessment/GoodDetails/ApproveRow2'), 10)

WebUI.waitForElementClickable(findTestObject('PassengerAssessment/GoodDetails/ApproveRow2'), 10)

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/ApproveRow2'))

WebUI.delay(2)

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.waitForElementVisible(findTestObject('PassengerAssessment/GoodDetails/ApproveRow3'), 10)

WebUI.waitForElementClickable(findTestObject('PassengerAssessment/GoodDetails/ApproveRow3'), 10)

WebUI.click(findTestObject('PassengerAssessment/GoodDetails/ApproveRow3'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.switchToFrame(findTestObject('PassengerAssessment/Frame'), 10)

WebUI.scrollToElement(findTestObject('PassengerAssessment/CurrencyDetails/AddCurrency'), 10)

WebUI.click(findTestObject('PassengerAssessment/CurrencyDetails/AddCurrency'))

WebUI.selectOptionByLabel(findTestObject('PassengerAssessment/CurrencyDetails/CurrencyType'), 'CURRENCY', false)

WebUI.setText(findTestObject('PassengerAssessment/CurrencyDetails/CurrencyName'), 'INR')

WebUI.click(findTestObject('PassengerAssessment/CurrencyDetails/SelectCurrency'))

WebUI.setText(findTestObject('PassengerAssessment/CurrencyDetails/Facevalue'), '123')

WebUI.setText(findTestObject('PassengerAssessment/CurrencyDetails/CompoundAmount'), '12')

WebUI.setText(findTestObject('PassengerAssessment/CurrencyDetails/Remarks'), 'NAZ CUR Remarks')

WebUI.click(findTestObject('PassengerAssessment/CurrencyDetails/save'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('PassengerAssessment/Save'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('PassengerAssessment/Submit'))

WebUI.waitForPageLoad(30)

WebUI.waitForJQueryLoad(30)

WebUI.click(findTestObject('PassengerAssessment/Back'))

WebUI.delay(5)

WebUI.closeBrowser()

