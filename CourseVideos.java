import org.junit.Test;

import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class CourseVideos extends BaseClass{

    @Test

    public void CourseVideo() throws InterruptedException {
        Thread.sleep(20000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(0)\n"));
        System.out.println("expand all");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Business Studies\")\n"));
        System.out.println("subject");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
        System.out.println("partner selected");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Unit 1 - Understanding Business Activity\")\n"));
        System.out.println("chapter");

        /*
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)\n"));
        System.out.println("filter");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE313\").instance(0)\n"));
        System.out.println("drop down");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Faiq Shah\")\n"));
        System.out.println("Teacher selected");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE313\").instance(1)\n"));
        System.out.println("drop down");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Chemistry (Punjab)\")\n"));
        System.out.println("subject selected");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Apply Filter\")\n"));
        System.out.println("Filter applied");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back button");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
        System.out.println("partner");


//        error
//        clickWhenReady(androidUIAutomator("new UiSelector().resourceId(\"com.tutorg.android:id/exo_play_pause_container\")\n"));
//        System.out.println("pause");

        Thread.sleep(20000);

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Pay Now\")\n"));
        System.out.println("pay now");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Daily 1\")\n"));
        System.out.println("plan");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Next\")\n"));
        System.out.println("next button");

        Thread.sleep(20000);

        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)\n"));
        getWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)\n"));
        System.out.println("OTP");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Verify\")\n"));
        System.out.println("clicked");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Done\")\n"));
        System.out.println("Done");

        */
    }
}
