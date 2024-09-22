package Utility;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.WebTestBase;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Util extends WebTestBase {

    public static final long IMPLICITY_WAIT = 20;
    public static final long PAGE_LOAD_TIME = 20;
    public static final long EXPLICITY_WAIT = 20;
    public static WebDriverWait webDriverWait;
    public static Actions actions;

    public static WebDriver webDriver;

    public static void waitElementUntilToClickable(WebElement element){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITY_WAIT));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public static void fluentWaitUntilClicable(WebElement element)
    {
        FluentWait<WebDriver> Wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
    }

    public static void sendTextIntoBox(WebElement element, String text){
        element.sendKeys(text);
    }
    public static String getTextOfElement(WebElement element){
        return element.getText();

    }

    public static void scrollUpMethod(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 3000)");
    }

    public static void scrollDownMethod(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, -1000)");
    }


    public static void mouseHoverActionMethod(WebElement resourcesElement){
        WebElement element=driver.findElement(By.xpath("//div[text()='Resources']"));
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();

    }
    public static void navigateBackwordMethod()
    {
        driver.navigate().back();
    }

    public static  void navigateForwardMethod()
    {
        driver.navigate().forward();
    }

    public static void dropDownElement(WebElement element){
        Select s = new Select(element);
        List<WebElement> getOption =s.getOptions();

        for (WebElement e: getOption){
            System.out.println(e);
        }
    }

    public static void navigateRefresh(){
        driver.navigate().refresh();
    }



}
