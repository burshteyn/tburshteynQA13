package com.telran.course.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

@BeforeMethod
        public void createPreconditions() {

    app.openSite(app.properties.getProperty("web.baseUrl"));
}


    @Test (priority = 1)
    public void LoginTrelloTest() {
        app.clickLogInButton();
        app.enterUserName(app.properties.getProperty("web.adminLogin"));
        app.enterPassword(app.properties.getProperty("web.adminPassword"));
        app.confirmLogInButton();
    }

    @Test
    public void ALoginTrelloTestNotValidMail() {

        app.clickLogInButton();
        app.enterUserName("1");
        app.enterPassword(app.properties.getProperty("web.adminPassword"));
        app.confirmLogInButton();
    }

    @Test
    public void BLoginTrelloEmptyFieldTest() {
        app.openSite(app.properties.getProperty("web.baseUrl"));
        app.clickLogInButton();
        app.enterUserName("");
        app.enterPassword("");
        app.confirmLogInButton();

    }


}
