import org.junit.Test;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class HomeScreen extends BaseClass{
@Test
    public void homeTest() throws InterruptedException {

    Thread.sleep(2000);

    clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(11)"));
    System.out.println("live Tutor");

    clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)\n"));
    System.out.println("course videos");

    clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(11)\n"));
    System.out.println("profile");



}

}
