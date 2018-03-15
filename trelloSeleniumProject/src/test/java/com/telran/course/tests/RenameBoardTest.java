package com.telran.course.tests;

import com.telran.course.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login(app.properties.getProperty("web.adminLogin"), app.properties.getProperty("web.adminPassword"));

    }

    @Test
    public void testRenameBoard(){
        app.selectBoardMethod_2();
        app.clickOnTheBoardTitle();
        app.fillNewBoardTitle(new BoardData("BurshteynRenamed"));
        app.clickRenameBoardButton();
        app.returnToHomePage();
        app.clickOnManePageEmptySpace();
        app.logout();
    }

}
