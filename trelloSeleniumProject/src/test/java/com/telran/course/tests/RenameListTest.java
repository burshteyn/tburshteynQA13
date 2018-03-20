package com.telran.course.tests;

import com.telran.course.model.ListData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameListTest extends TestBase{
    @BeforeClass
    public void precondition(){
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));
    }

    @Test
    public void testRenameList(){
        app.selectBoard();
        app.fillNewListTitle(new ListData("NewRenameListBurshteyn"));
        app.clickOnSecondPageEmptySPace();
        app.returnToHomePage();
        app.clickOnMainPageEmptySpace();
        app.logout();

    }

}
