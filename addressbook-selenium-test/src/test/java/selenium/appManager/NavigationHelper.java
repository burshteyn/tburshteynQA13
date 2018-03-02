package selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void goToGroupsPage() {
        click(By.xpath("//a[@href='group.php']"));

    }

    public void clickAddNewButton() {

        click(By.xpath("//a[@href='edit.php']"));
    }

    public void goToHomePage(){
        click(By.cssSelector("a[href='./']"));
    }


}
