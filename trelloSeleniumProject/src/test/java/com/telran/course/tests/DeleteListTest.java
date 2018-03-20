package com.telran.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteListTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));
    }

    @Test
    public void testDeleteList(){
        app.selectBoard();
        app.clickOnMoreOptionsDropDownList();
        app.clickOnArchiveThisListTitle();
        app.returnToHomePage();
        app.clickOnMainPageEmptySpace();
        app.logout();

    }
}
