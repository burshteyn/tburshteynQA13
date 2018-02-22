package com.telran.course;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateListTest extends TestBase {
    @BeforeClass

    public void precondition(){
        login("elena.telran@yahoo.com", "12345.com");

    }
    @Test
    public void testCreateList() {
        selectBoard();
        clickOnAddListField("NewListBurshteyn");
        clickOnTheSaveListButton();
        returnToHomePage();

    }

    public void clickOnTheSaveListButton() {
        wd.findElement(By.cssSelector("input.primary.mod-list-add-button.js-save-edit")).click();

    }

    public void clickOnAddListField(String newListName) {
        wd.findElement(By.cssSelector("div.js-add-list.list-wrapper.mod-add.is-idle")).click();
        wd.findElement(By.cssSelector("input.list-name-input")).clear();
        wd.findElement(By.cssSelector("input.list-name-input")).sendKeys(newListName);


    }
}
