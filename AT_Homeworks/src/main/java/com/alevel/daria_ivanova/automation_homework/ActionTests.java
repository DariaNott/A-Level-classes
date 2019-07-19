package com.alevel.daria_ivanova.automation_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionTests extends TestBase {

    public void searchFilterInput(String filterName, String inputSearchXpath, String searchWord) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prozorro.gov.ua/tender/search");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        WebElement filter = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'" + filterName + "')]")));
        filter.click();
        WebElement inputBox = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputSearchXpath)));
        inputBox.sendKeys(searchWord);
    }

    private void activateChoice() {
        WebElement dropdown = (new WebDriverWait(driver, 3))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'selectize-dropdown single')]")));
        Actions choice = new Actions(driver);
        choice.moveToElement(dropdown).click().build().perform();
    }

    private void searchAssertion() {
        String expectedResult = "Знайдено:";
        WebElement result = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'result-all')]")));
        String actualResult = result.getText();
        Assert.assertTrue(actualResult.contains(expectedResult), "Message with number of found results wasn't shown");
    }

    @Test
    public void keyWord() {
        String filterName = "Ключове слово";
        String inputSearchXpath = "//div[contains(@class,'block block-query')]/input[contains(@type,'text')]";
        String searchWord = "картопля";
        searchFilterInput(filterName, inputSearchXpath, searchWord);
        searchAssertion();
    }

    @Test
    public void dkpp() {
        String filterName = "ДКПП";
        String inputSearchXpath = "//div[contains(@class,'block block-dkpp')]//input[contains(@type,'text')]";
        String searchWord = "01.11.1 - Пшениця";
        searchFilterInput(filterName, inputSearchXpath, searchWord);
        activateChoice();
        searchAssertion();
    }

    @Test
    public void purchaseNumber() {
        String filterName = "№ закупівлі";
        String inputSearchXpath = "//div[contains(@class,'block block-tid')]//input[contains(@type,'text')]";
        String searchWord = "UA-2019-07-09-002473-b";
        searchFilterInput(filterName, inputSearchXpath, searchWord);
        searchAssertion();
    }

    @Test
    public void dk021() {
        String filterName = "ДК021:2015";
        String inputSearchXpath = "//div[contains(@class,'selectize-input items not-full has-options')]//input[contains(@type,'text')]";
        String searchWord = "03111100-3";
        searchFilterInput(filterName, inputSearchXpath, searchWord);
        activateChoice();
        searchAssertion();
    }

    @Test
    public void purchaser() {
        String filterName = "Замовник";
        String inputSearchXpath = "//div[contains(@class,'selectize-input items not-full')]//input[contains(@type,'text')]";
        String searchWord = "21113139";
        searchFilterInput(filterName, inputSearchXpath, searchWord);
        activateChoice();
        searchAssertion();
    }

}
