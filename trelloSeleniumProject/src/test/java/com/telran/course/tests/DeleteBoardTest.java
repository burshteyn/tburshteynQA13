package com.telran.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }

    @Test
    public void testDeleteBoard(){
        app.selectBoardMethod_2();
        app.clickOnShowMenuButton();
        app.clickOnMoreTitle();
        app.clickOnCloseBoardTitle();
        app.clickOntheCloseButton();
        app.returnToHomePage();
        app.clickOnManePageEmptySpace();
        app.logout();


    }
}
