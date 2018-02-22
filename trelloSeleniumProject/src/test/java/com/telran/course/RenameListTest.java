package com.telran.course;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameListTest extends TestBase{
    @BeforeClass
    public void precondition(){
        login("elena.telran@yahoo.com", "12345.com");

    }

    @Test
    public void testRenameList(){
        selectBoard();
        fillNewListTitle("NewRenameListBurshteyn");
        EmptySpaceClick();

    }

    public void EmptySpaceClick() {
        wd.findElement(By.xpath("//div[@id='board']")).click();
    }

    public void fillNewListTitle(String renameListBurshteyn) {
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).findElement(By.xpath("..")).click();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).clear();
        wd.findElement(By.xpath("//textarea[text()=\"NewListBurshteyn\"]")).sendKeys(renameListBurshteyn);

    }


}
