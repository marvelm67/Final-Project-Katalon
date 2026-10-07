import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.click(findTestObject('Page_HomePage/a_Sign In'))
WebUI.setText(findTestObject('Page_LoginPage/input_Need a user name and password_stripes-664047238'), 'invalid_user')
WebUI.setText(findTestObject('Page_LoginPage/input_Need a user name and password_password'), 'wrong_password')
WebUI.click(findTestObject('Page_LoginPage/input_Need a user name and password_signon'))
WebUI.verifyElementPresent(findTestObject('Page_LoginPage/li_Invalid username or password.  Signon failed'), 10)
WebUI.closeBrowser()