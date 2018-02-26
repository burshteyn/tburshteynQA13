package selenium.appManager;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import selenium.model.ContactData;
import selenium.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
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
        openSite();
        logIn("admin", "secret");
    }

    public void returnToGroupsPage() {

        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {

        wd.findElement(By.name("submit")).click();
    }


    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
    }

    public void initGroupCreation() {

        wd.findElement(By.name("new")).click();
    }

    public void goToGroupsPage() {

        wd.findElement(By.linkText("groups")).click();
    }

    public void logIn(String user, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(user);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void openSite() {

        wd.get("http://localhost/addressbook/");
    }

    public void stop() {

        wd.quit();
    }

    public void selectGroup() {

        wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupDeletion() {

        wd.findElement(By.name("delete")).click();
    }

    public void clickAddNewButton() {
        wd.findElement(By.xpath("//a[@href='edit.php']")).click();
    }

    public void fillContactData(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    }


    public void submitContactCreaction() {
        wd.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void submitContactChange() {
        wd.findElement(By.name("update")).click();
    }

    public void clickOnEditButton() {
        wd.findElement(By.xpath("//tr[@class='odd']")).findElement(By.xpath("//img[@src='icons/pencil.png']")).click();
    }

    public void clickOnDeleteButton() {
    wd.findElement(By.xpath("//form[@action=\"delete.php\"]")).findElement(By.xpath("//input[@value=\"Delete\"]")).click();

    }

}




















