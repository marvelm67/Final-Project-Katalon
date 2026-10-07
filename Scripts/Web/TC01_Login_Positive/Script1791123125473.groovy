import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.click(findTestObject('Page_HomePage/a[contains(text(),'Sign In')]
WebUI.setText(findTestObject('Page_LoginPage/input_Need a user name and password_stripes-664047238'), GlobalVariable.Username)
WebUI.setText(findTestObject('Page_LoginPage/input_Need a user name and password_password'), GlobalVariable.Password)
WebUI.click(findTestObject('Page_LoginPage/input_Need a user name and password_signon'))
WebUI.verifyElementText(findTestObject('Page_HomePage/div_Welcome ABC'), 'Welcome ABC')
WebUI.closeBrowser()