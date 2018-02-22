package com.telran.course.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase{
    @BeforeClass

    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");


    }
    @Test
    public void testCreateBoard() {

        clickPlusButton();
        clickCreateBoardValue();
        fillBoardTitle("BurshteynNewBoard");
        clickPrivateButton();
        clickPublicValue();
        clickCreateBoardButton();
        app.returnToHomePage();

    }

    public void clickCreateBoardButton() {
        app.wd.findElement(By.cssSelector("button.primary")).click();

    }


    public void clickPublicValue() {
        app.wd.findElement(By.xpath("//span[contains(text(),\"The board is public. It's visible to anyone with t\")]")).click();
    }

    public void clickPrivateButton() {
        app.wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    public void fillBoardTitle(String Name) {
        app.wd.findElement(By.cssSelector("input.subtle-input")).click();
        app.wd.findElement(By.cssSelector("input.subtle-input")).clear();
        app.wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(Name);

    }

    public void clickCreateBoardValue() {
        app.wd.findElement(By.cssSelector("a.js-new-board>span.sub-name")).click();
    }

    public void clickPlusButton() {
        app.wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
    }




}
