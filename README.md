Requirements

- Katalon Studio 9+
- JDK 11+
- Chrome/Chromedriver installed

Running Tests Locally

```bash
katalonc -noSplash -runMode=console \
  -projectPath="$(pwd)/katalon-email-login-example.prj" \
  -testSuitePath="Test Suites/AuthenticationSuite" \
  -browserType="Chrome"
