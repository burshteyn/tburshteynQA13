package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.tr.selenium.model.ContactData;
import org.openqa.selenium.support.ui.Select;

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
        //for drop down lists
        new Select(wd.findElement(By.name("new_group")))
                .selectByVisibleText(contactData.getGroup());
        attach(By.name("photo"), contactData.getPhoto());
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















