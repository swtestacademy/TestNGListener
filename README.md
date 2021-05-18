# TestNGListener
TestNG retrysingletests.Listener Example

Article Links:
TestNG retrysingletests.Listener: https://www.swtestacademy.com/how-to-use-testng-listeners/

TestNG RetryAnalyzer: https://www.swtestacademy.com/retry-failed-tests-testng-iretryanalyzer/


Extra notes for the future:

**Below lines were used for retest creation with suite. I am keeping here as a reference.**

    //XmlTest test = new XmlTest(suite);
    //test.setName(result.getTestName());
    //List<XmlClass> classes = new ArrayList<XmlClass>();
    //classes.add(result.getTestClass().getXmlClass());
    //test.setXmlClasses(classes) ;
    //XmlSuite suite = new XmlSuite();
    //suite.setName("rerunFailedTestClasses");
    //List<XmlSuite> suites = new ArrayList<XmlSuite>();
    //suites.add(suite);
    //tng.setXmlSuites(suites);
        