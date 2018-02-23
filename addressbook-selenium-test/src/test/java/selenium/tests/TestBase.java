package selenium.tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.appManager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws Exception {
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
