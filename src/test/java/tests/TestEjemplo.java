package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestEjemplo {

    AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Nexus 6 API 24");
        cap.setCapability("platformVersion","7.0");
        cap.setCapability("platformName","Android");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("appPackage", "com.android..calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

    }

@Test

public void primerTest(){
        String boton9 = "digit_9";
        MobileElement me_boton9 = driver.findElement(By.id(boton9));


    Assert.fail();

}

@AfterTest
public void closeDriver(){
        driver.quit();
}

}
