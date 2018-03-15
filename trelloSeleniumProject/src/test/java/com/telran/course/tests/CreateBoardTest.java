package com.telran.course.tests;

import com.telran.course.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase {
    @BeforeClass

    public void precondition() {
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));
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


