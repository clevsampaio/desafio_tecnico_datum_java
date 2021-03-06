package br.com.datum.framework.utils;

import br.com.datum.framework.webdrivers.DriverFactory;
import br.com.datum.framework.webdrivers.DriverManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerClassAdapter.class})
public class BaseTest {
    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.createInstance();
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }
}