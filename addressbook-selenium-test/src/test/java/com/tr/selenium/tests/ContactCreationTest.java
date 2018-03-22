package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTest extends TestBase{

    @Test
    public void TestContactCreate(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().clickAddNewButton();
        File photo = new File("addressbook-selenium-test/src/test/resources/catCat.jpg");
        app.getContactHelper().fillContactData(new ContactData()
                .withFirstName("FirstSunny")
                .withLastName("LastSunny")
                .withGroup("test1")
                .withPhoto(photo));
        app.getContactHelper().submitContactCreaction();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);

    }


}
