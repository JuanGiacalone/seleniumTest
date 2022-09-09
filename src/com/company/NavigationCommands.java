package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().back(); // retrocede
        driver.navigate().forward(); // avanza
        driver.navigate().to("a.com"); // ingresa a url
        driver.navigate().refresh(); // f5
    }
}
