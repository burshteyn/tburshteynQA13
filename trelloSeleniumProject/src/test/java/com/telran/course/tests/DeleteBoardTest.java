package com.telran.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));
    }

    @Test
    public void testDeleteBoard(){
        app.selectBoardMethod_2();
        app.clickOnShowMenuButton();
        app.clickOnMoreTitle();
        app.clickOnCloseBoardTitle();
        app.clickOntheCloseButton();
        app.returnToHomePage();
        app.clickOnMainPageEmptySpace();
        app.logout();


    }
}
