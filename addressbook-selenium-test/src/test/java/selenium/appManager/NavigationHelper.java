package selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void goToGroupsPage() {

        wd.findElement(By.linkText("groups")).click();
    }

    public void clickAddNewButton() {

        click(By.xpath("//a[@href='edit.php']"));
    }


}
