package com.telran.course.tests;

import org.testng.annotations.BeforeClass;

public class DeleteBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");

    }

    public void testDeleteBoard(){
        app.selectBoard2();




    }
}
