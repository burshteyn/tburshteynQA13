package com.telran.course.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateListTest extends TestBase {
    @BeforeClass

    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");

    }
    @Test
    public void testCreateList() {
        app.selectBoard();
        clickOnAddListField("NewListBurshteyn");
        clickOnTheSaveListButton();
        app.returnToHomePage();

    }

    public void clickOnTheSaveListButton() {
        app.wd.findElement(By.cssSelector("input.primary.mod-list-add-button.js-save-edit")).click();

    }

    public void clickOnAddListField(String newListName) {
        app.wd.findElement(By.cssSelector("div.js-add-list.list-wrapper.mod-add.is-idle")).click();
        app.wd.findElement(By.cssSelector("input.list-name-input")).clear();
        app.wd.findElement(By.cssSelector("input.list-name-input")).sendKeys(newListName);


    }
}
