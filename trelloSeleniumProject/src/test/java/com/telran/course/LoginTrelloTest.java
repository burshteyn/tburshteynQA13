package com.telran.course;

import org.testng.annotations.*;

import org.openqa.selenium.*;

public class LoginTrelloTest extends TestBase {

@BeforeMethod
        public void createPreconditions() {
    openSite("https://trello.com");
}


    @Test (priority = 1)
    public void LoginTrelloTest() {
       // wd.findElement(By.xpath("//div[2]")).click();
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }

    public void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }


    @Test
    public void ALoginTrelloTestNotValidMail() {

        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test
    public void BLoginTrelloEmptyFieldTest() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }


}
