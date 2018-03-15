package com.telran.course.application;

import com.telran.course.model.BoardData;
import com.telran.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public FirefoxDriver wd;
    public Properties properties;



    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() throws IOException {
        String target = properties.getProperty("target", "local");
        properties.load(new FileReader(String.format("src/test/resources/%s.properties",target)));
        properties = new Properties();
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite(properties.getProperty("web.baseUrl"));
    }

    public void stop() {

        wd.quit();
    }

    public void openSite(String url) {

        wd.get(url);
    }

    public void confirmLogInButton() {

        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void clickLogInButton() {

        wd.findElement(By.linkText("Log In")).click();
    }



    public void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    public void login(String user, String password) {
        clickLogInButton();

        enterUserName(user);
        enterPassword(password);
        confirmLogInButton();
    }

    public void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

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

    public void clickOnShowMenuButton() {
        wd.findElement(By.cssSelector("a.board-header-btn.mod-show-menu.js-show-sidebar")).click();
    }

    public void clickOnMoreTitle() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-open-more")).click();
    }

    public void clickOnCloseBoardTitle() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }


    public void clickOntheCloseButton() {

        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();
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

    public void fillBoardTitle(BoardData boardData) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardData.getRenamed());

    }

    public void clickCreateBoardValue() {

        wd.findElement(By.cssSelector("a.js-new-board>span.sub-name")).click();
    }

    public void clickPlusButton() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
    }

    public void clickOnMoreOptionsDropDownList() {
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]"))
                .findElement(By.xpath(".."))
                .findElement(By.xpath("//div[@class='list-header-extras']")).click();

    }

    public void clickOnArchiveThisListTitle() {

        wd.findElement(By.cssSelector("a.js-close-list")).click();
    }

    public void clickOnTheSaveListButton() {
        wd.findElement(By.cssSelector("input.primary.mod-list-add-button.js-save-edit")).click();

    }

    public void clickOnAddListField(ListData listData) {
        wd.findElement(By.cssSelector("div.js-add-list.list-wrapper.mod-add.is-idle")).click();
        wd.findElement(By.cssSelector("input.list-name-input")).clear();
        wd.findElement(By.cssSelector("input.list-name-input")).sendKeys(listData.getRenamedList());
    }

    public void clickOnSecondPageEmptySPace() {

        wd.findElement(By.xpath("//div[@id='board']")).click();
    }

    public void clickOnManePageEmptySpace(){

        wd.findElement(By.xpath("//div[@class='member-boards-view']")).click();
    }


    public void fillNewListTitle(ListData listData) {
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).findElement(By.xpath("..")).click();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).clear();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).sendKeys(listData.getRenamedList());

    }

}
