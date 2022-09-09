package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class testHrmLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("button[type=submit]"));

        usernameField.sendKeys(LoginInfo.getUsername());
        passwordField.sendKeys(LoginInfo.getPassword());
        submitButton.click();
    }
}
