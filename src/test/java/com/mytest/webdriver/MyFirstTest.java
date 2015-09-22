package com.mytest.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void startDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://biq-dev.sentrana.com/biq");
        Assert.assertTrue( driver.getTitle().startsWith("MarketMover"),"title should start with MarketMover");
        driver.close();
        driver.quit();
    }

    @Test
    public void anotherTest(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://biq-dev.sentrana.com/biq");
        Assert.assertTrue(driver.getTitle().startsWith("rketMover"),"title should start with MarketMover");
        driver.close();
        driver.quit();
    }
}
