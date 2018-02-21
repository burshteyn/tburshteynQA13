package com.telran.course;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends ApplicationManager{


    @BeforeClass
    public void setUp() throws Exception {
        init();
    }

    @AfterClass
    public void tearDown() {
        stop();
    }

}
