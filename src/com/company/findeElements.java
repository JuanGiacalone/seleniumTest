package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class findeElements {
    public static void main(String[] args) {
        // write your code here
        // seteamos la prop para le driver
        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // para maximizar la ventana

        driver.manage().window().maximize();

        // entra a gugle
        driver.get("http://automationpractice.com/index.php");

        // find elementS por tagHtml

        List<WebElement> elementosA = driver.findElements(By.tagName("a"));

        for (WebElement webElement : elementosA) {
            System.out.println(webElement.getText());
        }

        // close brw
        // driver.close();



    }
}
