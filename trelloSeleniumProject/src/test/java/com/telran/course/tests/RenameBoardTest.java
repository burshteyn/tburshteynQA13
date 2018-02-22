package com.telran.course.tests;

import com.telran.course.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");

    }

    @Test
    public void testRenameBoard(){
        app.selectBoard();
        app.clickOnTheBoardTitle();
        app.fillNewBoardTitle(new BoardData("Renamed"));
        app.clickRenameBoardButton();
        app.returnToHomePage();
    }

}
