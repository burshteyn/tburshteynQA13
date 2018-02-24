package com.telran.course.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteListTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }

    @Test
    public void testDeleteList(){
        app.selectBoard();
        app.clickOnMoreOptionsDropDownList();
        app.clickOnArchiveThisListTitle();
        app.returnToHomePage();
        app.clickOnManePageEmptySpace();
        app.logout();

    }
}
