package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        // seteamos la prop para le driver
        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // para maximizar la ventana

        driver.manage().window().maximize();

        // entra a gugle
        driver.get("http://automationpractice.com/index.php");

        // para ingresar un email a un input con id email

        //      driver.findElement(By.id("search_query_top")).sendKeys("test");

        WebElement searchQuery = driver.findElement(By.id("search_query_top"));

        searchQuery.sendKeys("test");



        // para ingresar un email a un input con name email

        //  driver.findElement(By.name("email")).sendKeys("email@mail.com");

        driver.findElement(By.name("submit_search")).click();


        // para clickear un link text

        WebElement textodel_link = driver.findElement(By.linkText("textodellink"));
        textodel_link.click();

        // find elem by class

        WebElement elementoConClase = driver.findElement(By.className("nombre clase"));
        elementoConClase.sendKeys("es una prueba");

        // find elementS por tagHtml

        List<WebElement> elementosA = driver.findElements(By.tagName("a"));


        // imprime el texto de los links
        for (WebElement webElement : elementosA) {
            System.out.println(webElement.getText());
        }


        // usando CSS Selector (Tag#Id) y (Tag.Class)  <input class='clase' id='emailnput' name='soyAttribute'>

        driver.findElement(By.cssSelector("input#emailnput")); // tag e ID
        driver.findElement(By.cssSelector("input.clase")); // seleccionar por tag y clase
        driver.findElement(By.cssSelector("input[name=soyAttribute]"));// (Tag[Attribute = Value])

        // se pueden combinar

        driver.findElement(By.cssSelector("input.clase[name=soyAttribute]")); // (Tag.Clase[Attribute=Value])

        driver.getTitle(); // devuelve el el html Title del momento
        driver.getCurrentUrl(); // devuelve la url actual

        // close brw
        // driver.close();



    }
}
