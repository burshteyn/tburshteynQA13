package selenium.appManager;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.internal.GroupsHelper;
import selenium.model.ContactData;
import selenium.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;

    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        openSite();
        sessionHelper.logIn("admin", "secret");
    }


    public void openSite() {

        wd.get("http://localhost/addressbook/");
    }

    public void stop() {

        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }


    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public void goToGroupsPage() {

        wd.findElement(By.linkText("groups")).click();
    }


}





















