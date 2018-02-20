//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//import static org.testng.Assert.*;
//
//import java.util.concurrent.TimeUnit;
//import java.util.Date;
//import java.io.File;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.*;
//import static org.openqa.selenium.OutputType.*;
//
//public class CreateBoardTest extends TestBase{
//    FirefoxDriver wd;
//
//    @BeforeMethod
//    public void setUp() throws Exception {
//        wd = new FirefoxDriver();
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void CreateBoardTestt() {
//        wd.get("https://trello.com/");
//        wd.findElement(By.linkText("Log In")).click();
//        wd.findElement(By.id("user")).click();
//        wd.findElement(By.id("user")).clear();
//        wd.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");
//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("12345.com");
//        wd.findElement(By.id("login")).click();
//        wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='Create new board…']")).click();
//        wd.findElement(By.cssSelector("input.subtle-input")).click();
//        wd.findElement(By.cssSelector("input.subtle-input")).clear();
//        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys("BurshteynT");
//        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
//        wd.findElement(By.linkText("PublicThe board is public. It's visible to anyone with the link and will show up in search engines like Google.  Only people added to the board can edit it.")).click();
//        wd.findElement(By.xpath("//ul[@class='background-grid']/li[3]/button")).click();
//        wd.findElement(By.cssSelector("button.primary")).click();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        wd.quit();
//    }
//
//    public static boolean isAlertPresent(FirefoxDriver wd) {
//        try {
//            wd.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
//}
