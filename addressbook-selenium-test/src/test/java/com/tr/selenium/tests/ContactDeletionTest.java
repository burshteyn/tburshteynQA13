package com.tr.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

    @Test
    public void TestDeleteContact(){
        app.getNavigationHelper().goToHomePage();

        if(!app.getContactHelper().isContactExist()){
            app.getContactHelper().createContact();

        }
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().clickOnEditButton();
        app.getContactHelper().clickOnDeleteButton();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);

    }
}
