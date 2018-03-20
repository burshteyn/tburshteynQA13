package com.telran.course.application;

import com.telran.course.model.BoardData;
import org.openqa.selenium.By;

public class BoardHelper {


    public void clickRenameBoardButton() {
        wd.findElement(By.xpath("//input[@type='submit'and@value='Rename']")).click();
    }

    public void fillNewBoardTitle(BoardData boardData) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(boardData.getRenamed());
    }

    public void clickOnTheBoardTitle() {
        wd.findElement(By.cssSelector("a.board-header-btn.board-header-btn-name")).click();
    }

    public void selectBoard() {

        wd.findElement(By.linkText("BurshteynT")).click();
    }

    public void selectBoardMethod_2() {

        wd.findElement(By.linkText("BurshteynNewBoard")).click();
    }

    public void clickOnCloseBoardTitle() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }

    public void fillBoardTitle(BoardData boardData) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardData.getRenamed());

    }

    public void clickCreateBoardValue() {

        wd.findElement(By.cssSelector("a.js-new-board>span.sub-name")).click();
    }

    public void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();

    }

    public void clickOnShowMenuButton() {
        wd.findElement(By.cssSelector("a.board-header-btn.mod-show-menu.js-show-sidebar")).click();
    }

    public void clickOnMoreTitle() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-open-more")).click();
    }

    public void clickOntheCloseButton() {

        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();
    }

    public void clickPublicValue() {
        wd.findElement(By.xpath("//span[contains(text(),\"The board is public. It's visible to anyone with t\")]")).click();
    }

    public void clickPrivateButton() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    public void clickPlusButton() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
    }


}
