package com.example.kvizko;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KvizkoSeleniumTests {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        // Set up the WebDriver (Make sure you have chromedriver or another appropriate driver installed)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kliment\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLoginPage() {

        driver.get("http://localhost:8080/getLogin");

        WebElement poleZaUsername = driver.findElement(By.id("email-4c18"));
        WebElement poleZaPassword = driver.findElement(By.id("name-4c18"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        poleZaUsername.sendKeys("admin");
        poleZaPassword.sendKeys("admin");

        loginButton.click();

        assertEquals("http://localhost:8080/", driver.getCurrentUrl());
    }

    @Test
    public void testInvalidLogin() {

        driver.get("http://localhost:8080/getLogin");


        WebElement poleZaUsername = driver.findElement(By.cssSelector("#email-4c18"));
        WebElement poleZaPassword = driver.findElement(By.id("name-4c18"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        poleZaUsername.sendKeys("nevalidenUsername");
        poleZaPassword.sendKeys("nevalidenPassword");

        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        assertEquals("The credentials you entered were invalid!", errorMessage.getText());
    }

    @AfterAll
    public static void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}