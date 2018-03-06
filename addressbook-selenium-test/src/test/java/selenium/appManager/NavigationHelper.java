package selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {

        super(wd);
    }

    public void goToGroupsPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }

        click(By.xpath("//a[@href='group.php']"));
    }


    public void clickAddNewButton () {

        click(By.xpath("//a[@href='edit.php']"));
    }

    public void goToHomePage () {
        if(isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.cssSelector("a[href='./']"));
    }
}
























