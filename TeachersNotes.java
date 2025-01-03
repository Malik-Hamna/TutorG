import org.junit.Test;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class TeachersNotes extends BaseClass{

    @Test

    public void Notes(){

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(0)\n"));
        System.out.println("see all");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
        System.out.println("partner");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Pakistan Studies ( Geography )\")\n"));
        System.out.println("subject");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Natural Resources\")\n"));
        System.out.println("chapter");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"View PDF\")\n"));
        System.out.println("view pdf");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Enroll Now\")\n"));
        System.out.println("Enrollment");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Daily Package\")\n"));
        System.out.println("Daily Package");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Next\")\n"));
        System.out.println("Next");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Mobile Balance\")\n"));
        System.out.println("Mobile balance");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Proceed\")\n"));
        System.out.println("proceed");

    }
}
