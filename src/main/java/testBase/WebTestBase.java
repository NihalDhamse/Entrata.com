package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import static Utility.Util.IMPLICITY_WAIT;
import static Utility.Util.PAGE_LOAD_TIME;

public class WebTestBase {

    public static WebDriver driver;
    public static Properties prop;


    public WebTestBase() {
        prop = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialization()
        {
            String browserName = prop.getProperty("browser");
            if (browserName.equalsIgnoreCase("chrome")) {
                System.getProperty("WebDriver.chrome.driver", System.getProperty("/src/main/resources/driver/chromedriver.exe"));
                driver = new ChromeDriver();
            }  else {
                throw new RuntimeException("Please select proper browser name");
            }


            driver.get(prop.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(IMPLICITY_WAIT));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PAGE_LOAD_TIME));
    }
}
