import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'invalid_user')
WebUI.setText(findTestObject('null'), 'wrong_password')
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 10)
WebUI.closeBrowser()
