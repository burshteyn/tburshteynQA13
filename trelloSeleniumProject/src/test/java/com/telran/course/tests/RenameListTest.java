package com.telran.course.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameListTest extends TestBase{
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");

    }

    @Test
    public void testRenameList(){
        app.selectBoard();
        fillNewListTitle("NewRenameListBurshteyn");
        EmptySpaceClick();

    }

    public void EmptySpaceClick() {
        app.wd.findElement(By.xpath("//div[@id='board']")).click();
    }

    public void fillNewListTitle(String renameListBurshteyn) {
        app.wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).findElement(By.xpath("..")).click();
        app.wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).clear();
        app.wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).sendKeys(renameListBurshteyn);

    }


}
