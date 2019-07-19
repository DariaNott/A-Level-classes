package com.alevel.daria_ivanova.automation_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorTests extends TestBase{

    @Test
    public void checkUkrNet() {
        driver.get("https://www.ukr.net");
        driver.findElement(By.id("search-input")).sendKeys("ololo" + Keys.ENTER);
    }

    @Test
    public void countRozetkaElements() {
        driver.get("https://www.rozetka.com.ua");
        List<WebElement> items = driver.findElements(By.className("menu-categories__item"));
        System.out.println(items.size() + " items");
    }

    @Test
    public void countRozetkaImages() {
        driver.get("https://www.rozetka.com.ua");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size() + " images");
    }

    @Test
    public void checkUkrNetLogPass() {
        driver.get("https://www.ukr.net");
        driver.findElement(By.name("q")).sendKeys("There are definetaly some problems with login and password search");
    }

    @Test
    public void checkGoogleLanguageChange() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.linkText("українська")).click();
        driver.findElement(By.partialLinkText("русс")).click();
    }

    @Test
    public void checkCSSheader() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("html body app-root div div div.app-rz-header header.header"));
    }

    @Test
    public void checkCSSinput() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("div > input"));
    }

    @Test
    public void checkCSSform() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("form input"));
    }

    @Test
    public void checkCSSsearch() {
        driver.get("https://www.ukr.net");
        driver.findElement(By.cssSelector("#search-input"));
    }

    @Test
    public void checkCSSsearchClass() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector(".search-form__input ng-untouched ng-pristine ng-valid"));
    }

    @Test
    public void checkCSSlogo() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.cssSelector("img [alt='Интернет магазин Rozetka.ua - №1']"));
    }

    @Test
    public void checkXPathHeaderLong() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("html/body/app-root/div/div/div.app-rz-header/header.header"));
    }

    @Test
    public void checkXPathHeaderShort() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//header.header"));
    }

    @Test
    public void checkXPathHeaderParent() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//div/input"));
    }

    @Test
    public void checkXPathHeaderGrandParent() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//form//input"));
    }

    @Test
    public void checkXPathLogo() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("img [@alt='Интернет магазин Rozetka.ua - №1']"));
    }

    @Test
    public void checkXPathLanguages() {
        driver.get("https://www.rozetka.com.ua");
        driver.findElement(By.xpath("//*[text()='UA']"));
    }

    @Test
    public void checkUkrNetLogPassXPath() {
        driver.get("https://www.ukr.net");
        driver.switchTo().frame("mail widget");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("login");
        driver.findElement(By.id("id-input-password")).sendKeys("pass");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("#search-input")).sendKeys("Done");
    }
}
