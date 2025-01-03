import org.junit.Test;

import static com.codeborne.selenide.Selenide.back;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class SideBar extends BaseClass{
    @Test
    public void sideMenu(){

        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)\n"));
        System.out.println("SideBar");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Bookmarks\")\n"));
        System.out.println("Bookmarks");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Your Enrollments\")\n"));
        System.out.println("Enrollments");

        /*

        clickWhenReady(androidUIAutomator("new UiSelector().text(\" Enrolled\")\n"));

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"View OutClass Content\")\n"));

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Delete\")\n"));

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Delete\")\n"));
        System.out.println("popup delete");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"OK\")\n"));
        System.out.println("ok popup");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Cancel\")\n"));
        System.out.println("popup cancel");

        */

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back");
    }
}
