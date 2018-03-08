package selenium.appManager;

import com.sun.javafx.binding.ExpressionHelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void submitContactCreaction() {

        click(By.xpath("//input[@type='submit']"));
    }

    public void submitContactChange() {

        click(By.name("update"));
    }

    public void clickOnEditButton() {
        wd.findElement(By.xpath("//tr[@class='odd']"))
                .findElement(By.xpath("//img[@src='icons/pencil.png']")).click();
    }

    public void clickOnDeleteButton() {
        wd.findElement(By.xpath("//form[@action=\"delete.php\"]"))
                .findElement(By.xpath("//input[@value=\"Delete\"]")).click();

    }

    public void fillContactData(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
    }


    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();

    }

    public void clickAddNewButton () {

        click(By.xpath("//a[@href='edit.php']"));
    }

    public boolean isContactExist() {
        return isElementPresent((By.name("selected[]")));

    }

    public void createContact() {
        clickAddNewButton();
        fillContactData(new ContactData()
                .withFirstName("FirstSunny")
                .withLastName("LastSunny"));
        submitContactCreaction();
    }
}















