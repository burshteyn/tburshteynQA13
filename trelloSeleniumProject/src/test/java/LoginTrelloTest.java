import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class LoginTrelloTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void LoginTrelloTest() {
        opensite();
       // wd.findElement(By.xpath("//div[2]")).click();
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
    }


    @Test
    public void LoginTrelloTestNotValidMail() {
        opensite();
        // wd.findElement(By.xpath("//div[2]")).click();
        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test
    public void LoginTrelloEmptyFieldTest() {
        opensite();
        // wd.findElement(By.xpath("//div[2]")).click();
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();
    }



    private void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    private void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    private void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    private void clickLogInButton() {

        wd.findElement(By.linkText("Log In")).click();
    }

    private void opensite() {
        wd.get("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
