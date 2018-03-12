package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{
    @Test

    public void ContactChangeTest(){
        app.getNavigationHelper().goToHomePage();

        if(!app.getContactHelper().isContactExist()){
            app.getContactHelper().createContact();

        }
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().clickOnEditButton();
        app.getContactHelper().fillContactData(new ContactData()
                .withFirstName("FirstSunnyChanged")
                .withLastName("LastSunnyChanged"));
        app.getContactHelper().submitContactChange();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before );

    }


}
