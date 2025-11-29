package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginPage {
	
	
		static openLoginPage() {
			WebUI.openBrowser('')
			WebUI.navigateToUrl(GlobalVariable.baseUrl)
			waitForVisible('Object Repository/LoginPage/link_EmailLogin')
			WebUI.click(findTestObject('LoginPage/link_EmailLogin'))
		}
	
		static enterEmail(String email) {
			waitForVisible('Object Repository/LoginPage/input_Email')
			WebUI.setText(findTestObject('LoginPage/input_Email'), email)
		}
	
		static toggleTermsCheckbox() {
			waitForClickable('Object Repository/LoginPage/chk_Terms')
			WebUI.click(findTestObject('LoginPage/chk_Terms'))
		}
	
		static boolean isMasukEnabled() {
			waitForVisible('Object Repository/LoginPage/btn_Masuk')
			return WebUI.verifyElementClickable(
				findTestObject('LoginPage/btn_Masuk'),
				FailureHandling.OPTIONAL
			)
		}
	
		private static waitForVisible(String obj) {
			WebUI.waitForElementVisible(findTestObject(obj), 10)
		}
	
		private static waitForClickable(String obj) {
			WebUI.waitForElementClickable(findTestObject(obj), 10)
		}
}
