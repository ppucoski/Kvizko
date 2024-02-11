package com.example.kvizko;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class KvizkoSeleniumTests {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kliment\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

    }


    @Test
    @Order(1)
    public void testInvalidLogin() throws InterruptedException {

        driver.get("http://localhost:8080/getLogin");

        driver.manage().window().maximize();

        WebElement poleZaUsername = driver.findElement(By.cssSelector("#email-4c18"));
        WebElement poleZaPassword = driver.findElement(By.id("name-4c18"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        poleZaUsername.sendKeys("nevalidenUsername");
        poleZaPassword.sendKeys("nevalidenPassword");

        synchronized (driver)
        {
            driver.wait(1000);

            loginButton.click();

            WebElement errorMessage = driver.findElement(By.id("errorMessage"));

            driver.wait(1000);

            assertEquals("The credentials you entered were invalid!", errorMessage.getText());
        }


    }

    @Test
    @Order(2)
    public void testLoginPage() throws InterruptedException {

        driver.get("http://localhost:8080/getLogin");

        driver.manage().window().maximize();

        WebElement poleZaUsername = driver.findElement(By.id("email-4c18"));
        WebElement poleZaPassword = driver.findElement(By.id("name-4c18"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        poleZaUsername.sendKeys("admin");
        poleZaPassword.sendKeys("admin");

        synchronized (driver)
        {

            driver.wait(1000);
            loginButton.click();

            driver.wait(1000);
            assertEquals("http://localhost:8080/", driver.getCurrentUrl());
        }


    }

    @Test
    @Order(3)
    public void testQuizSolvingFunctioniality() throws InterruptedException {
        driver.get("http://localhost:8080/");

        driver.manage().window().maximize();

        List<WebElement> subjects = driver.findElements(By.cssSelector("div.u-repeater a"));

        assertEquals(subjects.size(), 4);
        assertEquals("Physics", subjects.get(0).getText());
        assertEquals("History", subjects.get(1).getText());
        assertEquals("Sports", subjects.get(2).getText());
        assertEquals("Geography", subjects.get(3).getText());

        synchronized (driver)
        {
            driver.wait(1000);

            subjects.get(0).click();

            assertEquals("http://localhost:8080/4/categories", driver.getCurrentUrl());

            List<WebElement> categories = driver.findElements(By.cssSelector("div.u-list a"));

            assertEquals(categories.size(), 4);
            assertEquals("General Knowledge", categories.get(0).getText());
            assertEquals("Famous Physicists", categories.get(1).getText());
            assertEquals("Dynamics", categories.get(2).getText());
            assertEquals("Inventions", categories.get(3).getText());

            driver.wait(1000);
            categories.get(0).click();

            assertEquals("http://localhost:8080/10/quizzes", driver.getCurrentUrl());

            List<WebElement> quizzes = driver.findElements(By.cssSelector("div.u-list a"));

            assertEquals("General Physics Knowledge", quizzes.get(0).getText());
            assertEquals("Easy Trivia", quizzes.get(1).getText());

            driver.wait(1000);
            quizzes.get(0).click();

            assertEquals("http://localhost:8080/9/quizStart", driver.getCurrentUrl());

            for (int i=0; i<5; i++)
            {
                WebElement quizChoice = driver.findElement(By.cssSelector("div.u-list-1 .input-i-label"));

                if (!quizChoice.isSelected()) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", quizChoice);
                }

                WebElement nextButton = driver.findElement(By.cssSelector(".btn-epic"));
                if(i!=4)
                {
                    driver.wait(1000);
                    nextButton.click();
                }
                else
                {
                    driver.wait(1000);
                    WebElement finishButton = driver.findElement(By.id("finishButton"));
                    finishButton.click();
                }
            }

            driver.wait(5000);
            WebElement points = driver.findElement(By.cssSelector("#sec-88e1 > div > div > div > p"));
            assertTrue(points.getText().contains("You scored: "));
        }

    }



    @AfterAll
    public static void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}