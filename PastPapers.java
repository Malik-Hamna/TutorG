import org.junit.Test;
import static io.appium.java_client.AppiumBy.androidUIAutomator;

public class PastPapers extends BaseClass {
    @Test

    public void calling() throws InterruptedException {
          expand();

    }

    public void expand() throws InterruptedException {

        Thread.sleep(25000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(1)\n"));
        System.out.println("see all button");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Physics\")\n"));
        System.out.println("subject");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"CAIE\")\n"));
        System.out.println("board");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Select year\")\n"));
        System.out.println("drop down");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"2021\")\n"));
        System.out.println("year");

//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"O'level\")\n"));
//        System.out.println("grade");
//
//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE313\").instance(1)\n"));
//        System.out.println("drop down");
//
//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"O'level\")\n"));
//        System.out.println("grade");
//
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Next\")\n"));
//


        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Physics-P1\")\n"));
        System.out.println("subject");

//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Biology-P2\")\n"));
//        System.out.println("part2");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"View PDF\")\n"));
        System.out.println("view Pdf clicked");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"View Solution\")\n"));
        System.out.println("solution");

        Thread.sleep(25000);

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
        System.out.println("partner selected");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDC4D\")\n"));
        System.out.println("clicked");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDC4D\")\n"));

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDC4D\")\n"));

     /*   Thread.sleep(2500);

    //click the screen to pause video
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(1)\n"));
        System.out.println("clicked");

        clickWhenReady(androidUIAutomator("new UiSelector().resourceId(\"com.tutorg.android:id/exo_play_pause_container\")\n"));
        System.out.println("pause");

        Thread.sleep(25000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Next\")\n"));
        System.out.println("next button");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"ok\")\n"));
        System.out.println("OK");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back");

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
        System.out.println("back");

        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Biology-P1\")\n"));
        System.out.println("part1");

      */

    }

}
