import org.junit.Test;

import static io.appium.java_client.AppiumBy.androidUIAutomator;


public class GuestLogin extends BaseClass {
    @Test
    public void calling() throws InterruptedException {

        guestUser();
//    logout();

    }

    public void guestUser() throws InterruptedException {

        Thread.sleep(10000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Login as Guest\")"));
        System.out.println("login");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"O'level\")\n"));
        System.out.println("grade");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Done\")\n"));
        System.out.println("done");

        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(36)\n"));
        System.out.println("user icon");

        sendWhenReady(androidUIAutomator("new UiSelector().text(\"xxx-xxxxxxx\") "),false,"3030532228");
        System.out.println("entered");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDD31\")\n"));
        System.out.println("checked");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Send OTP\")\n"));
        System.out.println("clicked");
        Thread.sleep(25000);

        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)\n"));
        System.out.println("OTP");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Verify\")\n"));
        System.out.println("clicked");

    }

    public void logout(){
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)\n"));
        System.out.println("user icon");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Log Out\")\n"));
        System.out.println("logout");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Logout\")\n"));
        System.out.println("successfully logout");
    }
}