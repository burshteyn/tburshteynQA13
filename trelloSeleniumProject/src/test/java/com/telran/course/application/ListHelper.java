package com.telran.course.application;

import com.telran.course.model.ListData;
import org.openqa.selenium.By;

public class ListHelper {

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


    public void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    public void clickOnMoreOptionsDropDownList() {
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]"))
                .findElement(By.xpath(".."))
                .findElement(By.xpath("//div[@class='list-header-extras']")).click();

    }

    public void fillNewListTitle(ListData listData) {
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).findElement(By.xpath("..")).click();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).clear();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).sendKeys(listData.getRenamedList());

    }

    public void clickOnSecondPageEmptySPace() {

        wd.findElement(By.xpath("//div[@id='board']")).click();
    }

}
