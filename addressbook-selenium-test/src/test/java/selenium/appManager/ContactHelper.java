package selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.model.ContactData;

public class ContactHelper {

    FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {

        this.wd = wd;
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

    public void fillContactData(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    }

    public void clickAddNewButton() {
        wd.findElement(By.xpath("//a[@href='edit.php']")).click();
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();

    }
}
