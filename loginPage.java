import org.junit.Test;

import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class loginPage extends BaseClass {

    @Test
    public void calling() throws InterruptedException {
          sub();
          unsub();
    }
    public void sub() throws InterruptedException {

        String userNumber="3176538569";

        sendWhenReady(androidUIAutomator("new UiSelector().text(\"xxx-xxxxxxx\") "),false,userNumber);
        System.out.println("entered");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDD31\")\n"));
        System.out.println("checked");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Send OTP\")\n"));
        System.out.println("clicked");

        if (notajazzUser(userNumber)) {
            System.out.println("You must be a Jazz customer to avail premium deal");
            return;
        }

        else{
        Thread.sleep(25000);
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)\n"));
        System.out.println("OTP");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Verify\")\n"));
        System.out.println("clicked");

        }
    }
    // Method to validate if the user is a Jazz network subscriber
    public boolean notajazzUser(String mobileNumber) {
        // Example Jazz network prefixes: 030, 031, 032, etc.
        String[] jazzPrefixes = {"030", "031", "032"};
        for (String prefix : jazzPrefixes) {
            if (mobileNumber.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

    public void unsub() throws InterruptedException{

        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(36)\n"));
        System.out.println("user icon");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Delete Account\")\n"));
        System.out.println("delete button");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Delete Account\")\n"));
        System.out.println("delete");
    }
}