package com.telran.course.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

@BeforeMethod
        public void createPreconditions() {
    app.openSite("https://trello.com");
}


    @Test (priority = 1)
    public void LoginTrelloTest() {
       // wd.findElement(By.xpath("//div[2]")).click();
        app.clickLogInButton();
        app.enterUserName("elena.telran@yahoo.com");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
    }

//    public void logout() {
//        wd.findElement(By.cssSelector("span.member-initials")).click();
//        wd.findElement(By.cssSelector("a.js-logout")).click();
//    }


    @Test
    public void ALoginTrelloTestNotValidMail() {

        app.clickLogInButton();
        app.enterUserName("1");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
    }

    @Test
    public void BLoginTrelloEmptyFieldTest() {
        app.openSite("https://trello.com");
        app.clickLogInButton();
        app.enterUserName("");
        app.enterPassword("");
        app.confirmLogInButton();

    }


}
