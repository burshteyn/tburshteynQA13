package com.telran.course.tests;

import com.telran.course.model.ListData;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateListTest extends TestBase {
    @BeforeClass

    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");

    }
    @Test
    public void testCreateList() {
        app.selectBoard();
        app.clickOnAddListField(new ListData("NewListBurshteyn"));
        app.clickOnTheSaveListButton();
        app.returnToHomePage();
        app.clickOnManePageEmptySpace();
        app.logout();

    }

}
