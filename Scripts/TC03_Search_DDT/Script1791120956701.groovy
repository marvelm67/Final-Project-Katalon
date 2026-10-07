import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.setText(findTestObject('null'), GlobalVariable.keyword)
WebUI.click(findTestObject('null'))
WebUI.verifyElementText(findTestObject('null'), GlobalVariable.expected)
WebUI.closeBrowser()
