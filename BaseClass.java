import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {

    protected static AppiumDriver driver;
    protected static WebDriverWait wait;


    // Clicks element when it's ready
    public void clickWhenReady(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

 /*  // Sends keys to the element when it's ready
    public void sendWhenReady(By locator, String keys) {
        if (wait != null) {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(keys);
        } else {
            System.out.println("Wait object is not initialized.");
        }
    }
  */

 public void sendWhenReady(By locator, boolean clearField,String keys) {
     if (wait != null) {
         // Wait until the element is clickable
         var element = wait.until(ExpectedConditions.elementToBeClickable(locator));

         // Optionally clear the field if the flag is set to true
         if (clearField) {
             element.clear();
         }

         // Send the new keys
         element.sendKeys(keys);
     } else {
         System.out.println("Wait object is not initialized.");
     }
 }
    // Gets the text of the element when it's ready
    public String getWhenReady(By locator) {
        if (wait != null) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        } else {
            System.out.println("Wait object is not initialized.");
            return null;
        }
    }
    @Before
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "SM-X810N");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("automationName", "uiAutomator2");
        cap.setCapability("appPackage", "com.tutorg.android");
        cap.setCapability("appActivity", "com.tutorg.android.MainActivity");
        cap.setCapability("noReset", true);
        cap.setCapability("fllReset", false);

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Initialize WebDriverWait

    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
