package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    //Driver declaration
    AndroidDriver driver;

    //set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //set the capabilities
        UiAutomator2Options caps = new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.sec.android.app.popupcalculator")
                .setAppActivity(".Calculator")
                .noReset();
        //set the server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Initialize the android driver
        driver = new AndroidDriver(serverURL, caps);

    }
    @Test
    public void multiplyTest(){
        //find the number 7 and tab it
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();
        //find the multiply button and tap it
        driver.findElement(AppiumBy.accessibilityId("Multiplication")).click();
        //find the number 6 and tab it
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06")).click();
        //find the equals button and tap it
        driver.findElement(AppiumBy.accessibilityId("Calculation")).click();
        // Find the result
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        // Assertion
        Assert.assertEquals(result, "42 Calculation result");
    }
}
