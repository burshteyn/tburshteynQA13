package com.telran.course.application;

import com.telran.course.model.BoardData;
import com.telran.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    private ListHelper listHelper;
    private BoardHelper boardHelper;
    private NavigationHelper navigationHelper;
    WebDriver wd;
    public String browser;
    public Properties properties;

    public ApplicationManager(String browser){
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(String.format("src/test/resources/%s.properties",target)));

        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.CHROME)){
            wd = 
        }

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


    public void clickOnMainPageEmptySpace(){

        wd.findElement(By.xpath("//div[@class='member-boards-view']")).click();
    }



}
