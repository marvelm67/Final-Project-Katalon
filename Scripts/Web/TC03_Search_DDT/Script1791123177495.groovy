import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.setText(findTestObject('Page_HomePage/input__keyword'), keyword)
WebUI.click(findTestObject('Page_HomePage/input__searchProducts'))
WebUI.verifyTextPresent(expected, false)
WebUI.closeBrowser()