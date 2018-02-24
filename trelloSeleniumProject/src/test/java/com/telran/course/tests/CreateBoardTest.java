package com.telran.course.tests;

import com.telran.course.model.BoardData;
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
        app.fillBoardTitle(new BoardData("BurshteynNewBoard"));
        app.clickPrivateButton();
        app.clickPublicValue();
        app.clickCreateBoardButton();
        app.returnToHomePage();
        app.clickOnManePageEmptySpace();
        app.logout();

    }

}


