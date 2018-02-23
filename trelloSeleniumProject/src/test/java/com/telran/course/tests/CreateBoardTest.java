package com.telran.course.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase {
    @BeforeClass

    public void precondition() {
        app.login("elena.telran@yahoo.com", "12345.com");
    }

    @Test
    public void testCreateBoard() {

        app.clickPlusButton();
        app.clickCreateBoardValue();
        app.fillBoardTitle("BurshteynNewBoard");
        app.clickPrivateButton();
        app.clickPublicValue();
        app.clickCreateBoardButton();
        app.returnToHomePage();

    }

}


