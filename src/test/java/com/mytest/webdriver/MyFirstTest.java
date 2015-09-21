package com.mytest.webdriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    @Test
    public void startDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://biq-dev.sentrana.com/biq");
        Assert.assertTrue("title should start with MarketMover",driver.getTitle().startsWith("MarketMover"));
        driver.close();
        driver.quit();
    }
}
