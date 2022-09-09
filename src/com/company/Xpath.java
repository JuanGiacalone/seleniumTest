package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.ebay.com/");

        // El xpath se obtiene con segundo click sobre el elemento en la pestania elements del navegador

        // Absolute Xpath
        // WebElement searchField = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]"));
        // WebElement searchButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]"));

        // Relative Xpath
        // WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        // WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        // Or operator
            //WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']"));
        //And operator
            //WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn' and @name=]"));

        // Contains(@attribute,value) -> evalua si contiene
            // driver.findElement(By.xpath("//input[contains (@id, 'first')]"));

        // Start-with(@attribute,value) -> lo devuelve si comienza con ...
             // driver.findElement(By.xpath("//input[starts-with (@id, 'st')]"));

        // uso de text() -> // Tag [text() = "el texto objetivo"]
        driver.findElement(By.xpath("//a[text () = 'Sell']")).click();

        // uso de  tagName[@attribute='value']
        driver.findElement(By.xpath("//img[name='imagenName']"));

        // contains y text
        driver.findElement(By.xpath("//contains(text(), 'Sell')")).click();


        // Xpath Axes.... todo un tema viste  parents, siblings childs de un self.

        //searchField.sendKeys("Rpi");
        //searchButton.click();
    }

}
