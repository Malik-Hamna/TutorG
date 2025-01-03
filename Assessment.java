import org.junit.Test;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class Assessment extends BaseClass{
@Test

    public void Enrollment(){

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(0)\n"));
    System.out.println("see all");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
    System.out.println("partners");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"Chemistry\").instance(0)\n"));
    System.out.println("subjects");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"Energy From Chemicals\")\n"));
    System.out.println("chapters");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"Energy From Chemicals\").instance(1)\n"));
    System.out.println("Topic");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"Enroll Now\")\n"));
    System.out.println("Enroll now");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"Daily 1\")\n"));
    System.out.println("plan");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"Next\")\n"));
    System.out.println("Next");

    getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)\n"));
    getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)\n"));
    getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)\n"));
    getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)\n"));
    System.out.println("OTP");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"Verify\")\n"));
    System.out.println("verify");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"Done\")\n"));
    System.out.println("Done");

}

    public void cancel(){

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(0)\n"));
        System.out.println("see all");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
        System.out.println("partners");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Chemistry\").instance(0)\n"));
        System.out.println("subjects");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Energy From Chemicals\")\n"));
        System.out.println("chapters");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Energy From Chemicals\").instance(1)\n"));
        System.out.println("Topic");







    }

}

