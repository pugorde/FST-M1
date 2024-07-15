package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
        // Driver Declaration
        AndroidDriver driver;

        // Set up method
        @BeforeClass
        public void setUp() throws MalformedURLException {
            // Desired Capabilities
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("android");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.sec.android.app.popupcalculator");
            options.setAppActivity(".Calculator");
            options.noReset();

            // Server Address
            URL serverURL = new URL("http://localhost:4723/wd/hub");

            // Driver Initialization
            driver = new AndroidDriver(serverURL, options);
        }

        // Test method
        @Test
        public void additionTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05")).click();
            driver.findElement(AppiumBy.accessibilityId("Plus")).click();
            driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09")).click();
            driver.findElement(AppiumBy.accessibilityId("Calculation")).click();

            // Find the result
            String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();

            // Assertion
            Assert.assertEquals(result, "14 Calculation result");
        }

        // Test method
        @Test
        public void subtractTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01")).click();
            driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00")).click();
            driver.findElement(AppiumBy.accessibilityId("Minus")).click();
            driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05")).click();
            driver.findElement(AppiumBy.accessibilityId("Calculation")).click();

            // Find the result
            String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();

            // Assertion
            Assert.assertEquals(result, "5 Calculation result");
        }

        // Test method
        @Test
        public void multiplyTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("digit_5")).click();
            driver.findElement(AppiumBy.accessibilityId("multiply")).click();
            driver.findElement(AppiumBy.id("digit_1")).click();
            driver.findElement(AppiumBy.id("digit_0")).click();
            driver.findElement(AppiumBy.id("digit_0")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();

            // Find the result
            String result = driver.findElement(AppiumBy.id("result")).getText();

            // Assertion
            Assert.assertEquals(result, "500");
        }

        // Test method
        @Test
        public void divideTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("digit_5")).click();
            driver.findElement(AppiumBy.id("digit_0")).click();
            driver.findElement(AppiumBy.accessibilityId("divide")).click();
            driver.findElement(AppiumBy.id("digit_2")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();

            // Find the result
            String result = driver.findElement(AppiumBy.id("result")).getText();

            // Assertion
            Assert.assertEquals(result, "25");
        }

        // Tear down method
        @AfterClass
        public void tearDown() {
            // Close the app
            driver.quit();
    }
}
