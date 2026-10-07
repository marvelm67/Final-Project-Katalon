import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.WebUrl)
WebUI.click(findTestObject('Page_HomePage/img_Fish'))
WebUI.click(findTestObject('Page_Fish/a_Add to Cart'))
WebUI.click(findTestObject('Page_Cart/a_Proceed to Checkout'))
WebUI.verifyElementPresent(findTestObject('Page_LoginPage/input_login'), 10)
WebUI.closeBrowser()