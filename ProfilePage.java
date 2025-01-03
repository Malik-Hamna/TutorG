import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class ProfilePage extends BaseClass{
    @Test
    public void calling() throws InterruptedException {
        Info();
        profile();

    }

    public void Info() throws InterruptedException {
        Thread.sleep(25000);

        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(36)\n"));
        System.out.println("profile");

        //error
//        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)\n"));
//        System.out.println("profile picture");
//
//        clickWhenReady(androidUIAutomator("com.android.gallery3d:id/gl_root_view\n"));


        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Edit Personal Information\")\n"));
        System.out.println("clicked");
        Thread.sleep(20000);

  //      error
//        sendWhenReady(androidUIAutomator("new UiSelector().text(\"Enter Name\")\n"),true,"Hamna");
//        System.out.println("entered");
//
//        sendWhenReady(androidUIAutomator("new UiSelector().text(\"Enter Email\")\n"),true,"hamnamalik197@gamil.com");
//        System.out.println("email entered");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE313\").instance(0)\n"));
        System.out.println("drop down");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"SSC-I (Punjab Board)\")\n"));
        System.out.println("selected");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE313\").instance(1)\n"));
        System.out.println("drop down");

        clickWhenReady(androidUIAutomator("//android.widget.TextView[@text=\"Male\"]\n"));
        System.out.println("selected");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Update\")\n"));
        System.out.println("updated");

    }
    public void profile() throws InterruptedException{

       clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(19)\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Downloads\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Teacher's Notes\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));

        if (isElementClickable(androidUIAutomator("new UiSelector().text(\"Your Assessments\")\n"))) {
            // If the "Your Assessments" button is clickable
            clickWhenReady(androidUIAutomator("new UiSelector().text(\"Your Assessments\")\n"));
        }
       else{
       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Your Assessments\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uF0C9\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Bookmarks\")"));

       clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")"));

       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Your Enrollments\")\n"));

       clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
       }
    }
    public boolean isElementClickable(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed() && element.isEnabled(); // The element must be visible and enabled
        } catch (Exception e) {
            return false; // Return false if the element is not found or not clickable
        }
    }


}
