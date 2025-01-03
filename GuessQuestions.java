import org.junit.Test;
import static io.appium.java_client.AppiumBy.androidUIAutomator;


public class GuessQuestions extends BaseClass{
@Test
    public void guessQuestion(){

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"See All\").instance(1)\n"));
    System.out.println("See all");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"OutClass\")\n"));
    System.out.println("partner");

    clickWhenReady(androidUIAutomator("new UiSelector().text(\"Maths\")\n"));
    System.out.println("subject");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
    System.out.println("back");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
    System.out.println("back");

    clickWhenReady(androidUIAutomator("new UiSelector().description(\"\uDB80\uDC4D\")\n"));
    System.out.println("back");

}
}

