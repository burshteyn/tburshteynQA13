package selenium.tests;


import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.appManager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void setUp() throws Exception {
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
