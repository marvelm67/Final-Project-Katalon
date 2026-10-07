import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import java.util.UUID
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


import com.katalon.execution.application.ExecutionMain

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/ry/9my71trj0k751cjs2phyk4rm0000gn/T/Katalon/Test Cases/Web/TC03_Search_DDT/20261006_220811_591/execution.properties')

TestCaseMain.beforeStart()

new ExecutionMain().init();

Map<String, String> tcProperties = new HashMap<String, String>();

def __tcBinding = new TestCaseBinding('Test Cases/Web/TC03_Search_DDT', [:])
if (__tcBinding != null) { __tcBinding.setTestCaseExecutionId(UUID.fromString('a310f50f-b809-4167-bece-1bd38f7b6e8d')) }


        TestCaseMain.runTestCase('Test Cases/Web/TC03_Search_DDT', __tcBinding, FailureHandling.STOP_ON_FAILURE , false, tcProperties)
    
