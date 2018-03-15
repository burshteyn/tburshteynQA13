package com.telran.course.tests;

import com.telran.course.model.ListData;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateListTest extends TestBase {
    @BeforeClass

    public void precondition(){
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));

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
