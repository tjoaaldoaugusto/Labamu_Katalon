import pages.LoginPage as Login
import utils.ApiInterceptor as API
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.util.KeywordUtil

// Load test data
def testData = TestDataFactory.findTestData("Data Files/login_test_data")
String email = testData.getValue("email", 1)

try {
    API.startProxy()
    API.interceptOtpEndpoint()

    Login.openLoginPage()
    Login.enterEmail(email)
    Login.toggleTermsCheckbox()

    assert Login.isMasukEnabled() : "❌ Masuk button should be enabled"

    KeywordUtil.markPassed("Email login UI validated successfully")
} finally {
    API.stopProxy()
}
