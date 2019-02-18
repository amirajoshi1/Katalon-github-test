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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.13.194.3/corporate/#/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Express Banking/div_Client Login_feature-icon'))

WebUI.setText(findTestObject('Object Repository/Page_Express Banking/input_Username_username'), 'approver12')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Express Banking/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_Express Banking/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Express Banking/a_Batch Transaction'))

WebUI.click(findTestObject('Object Repository/Page_Express Banking/span_Approve'))

WebUI.click(findTestObject('Object Repository/Page_Express Banking/td_788945511112NPR'))

WebUI.click(findTestObject('Object Repository/Page_Express Banking/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_Express Banking/button_Proceed'))

WebUI.rightClick(findTestObject('Object Repository/Page_Express Banking/input_Note that the OTP is cas'))

WebUI.setText(findTestObject('Object Repository/Page_Express Banking/input_Note that the OTP is cas'), 'mD6mKE7')

WebUI.click(findTestObject('Object Repository/Page_Express Banking/button_Confirm'))

