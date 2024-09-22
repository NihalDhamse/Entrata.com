package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class DynamicContent {

    public static WebDriver driver;


    @Test
    public void testDynamicContentOnHomepage() {
        // Navigate to homepage
        driver.get("https://www.entrata.com/b");

        // Wait for a dynamic element (e.g., banner or popup) to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dynamicBanner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamic-banner")));

        // Assert that the dynamic banner is displayed
        assertTrue(dynamicBanner.isDisplayed(), "Dynamic banner is not visible on the homepage");
    }
}
