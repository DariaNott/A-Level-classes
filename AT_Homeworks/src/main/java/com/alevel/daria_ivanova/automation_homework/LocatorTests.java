package com.alevel.daria_ivanova.automation_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorTests {
    private WebDriver driver;

    public void setChrome() {
        System.setProperty("webdriver.chrome.driver", "D:\\3Testing\\JavaGit\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void checkUkrNet() {
        setChrome();
        driver.get("https://www.ukr.net");
        driver.findElement(By.id("search-input")).sendKeys("ololo" + Keys.ENTER);
        driver.quit();
    }

    @Test
    public void countRozetkaElements() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        List<WebElement> items = driver.findElements(By.className("menu-categories__item"));
        System.out.println(items.size() + " items");
        driver.quit();
    }

    @Test
    public void countRozetkaImages() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size() + " images");
        driver.quit();
    }

    @Test
    public void checkUkrNetLogPass() {
        setChrome();
        driver.get("https://www.ukr.net");
        driver.findElement(By.name("q")).sendKeys("There are definetaly some problems with login and password search");
        driver.quit();
    }

    @Test
    public void checkGoogleLanguageChange() {
        setChrome();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.linkText("українська")).click();
        driver.findElement(By.partialLinkText("русс")).click();
        driver.quit();
    }

    @Test
    public void checkCSSheader() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("html body app-root div div div.app-rz-header header.header"));
        driver.quit();
    }

    @Test
    public void checkCSSinput() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("div > input"));
        driver.quit();
    }

    @Test
    public void checkCSSform() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("form input"));
        driver.quit();
    }

    @Test
    public void checkCSSsearch() {
        setChrome();
        driver.get("https://www.ukr.net");
        driver.findElement(By.cssSelector("#search-input"));
        driver.quit();
    }

    @Test
    public void checkCSSsearchClass() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector(".search-form__input ng-untouched ng-pristine ng-valid"));
        driver.quit();
    }

    @Test
    public void checkCSSlogo() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("img [alt='Интернет магазин Rozetka.ua - №1']"));
        driver.quit();
    }

    @Test
    public void checkXPathHeaderLong() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("html/body/app-root/div/div/div.app-rz-header/header.header"));
        driver.quit();
    }

    @Test
    public void checkXPathHeaderShort() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//header.header"));
        driver.quit();
    }

    @Test
    public void checkXPathHeaderParent() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//div/input"));
        driver.quit();
    }

    @Test
    public void checkXPathHeaderGrandParent() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//form//input"));
        driver.quit();
    }

    @Test
    public void checkXPathLogo() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("img [@alt='Интернет магазин Rozetka.ua - №1']"));
        driver.quit();
    }

    @Test
    public void checkXPathLanguages() {
        setChrome();
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//*[text()='UA']"));
        driver.quit();
    }

    @Test
    public void checkUkrNetLogPassXPath() {
        setChrome();
        driver.get("https://www.ukr.net");
        driver.switchTo().frame("mail widget");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("login");
        driver.findElement(By.id("id-input-password")).sendKeys("pass");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("#search-input")).sendKeys("Done");
        driver.quit();
    }
}
