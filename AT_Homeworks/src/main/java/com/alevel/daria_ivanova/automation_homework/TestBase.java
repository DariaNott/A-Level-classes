package com.alevel.daria_ivanova.automation_homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void setChrome() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}
