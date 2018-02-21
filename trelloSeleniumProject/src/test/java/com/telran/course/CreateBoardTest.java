package com.telran.course;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase{
    @BeforeClass

    public void precondition(){
        login("elena.telran@yahoo.com", "12345.com");

    }
    @Test
    public void CreateBoardTest() {

        clickPlusButton();
        clickCreateBoardValue();
        fillBoardTitle("BurshteynNewBoard");
        clickPrivateButton();
        clickPublicValue();
        clickCreateBoardButton();

    }

    public void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();

    }


    public void clickPublicValue() {
        wd.findElement(By.xpath("//span[contains(text(),\"The board is public. It's visible to anyone with t\")]")).click();
    }

    public void clickPrivateButton() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    public void fillBoardTitle(String Name) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(Name);

    }

    public void clickCreateBoardValue() {
        wd.findElement(By.cssSelector("a.js-new-board>span.sub-name")).click();
    }

    public void clickPlusButton() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
    }


}
