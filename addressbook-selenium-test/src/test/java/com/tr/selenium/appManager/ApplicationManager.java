package com.tr.selenium.appManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;

    WebDriver wd;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {
        //String browser = BrowserType.IE;
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);

        openSite();
        sessionHelper.logIn("admin", "secret");
    }


    public void openSite() {

        wd.get("http://localhost/addressbook/");
    }

    public void stop() {

        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }



}





















