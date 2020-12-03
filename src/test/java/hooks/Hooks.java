package hooks;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

import java.io.File;

import static io.qameta.allure.Allure.*;

public class Hooks {
    @Before
    public void initDriver() {
        DriverManager.setUpDriver();
    }

    @After
    public void quiteBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            File screenshotAs = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DriverManager.quiteDriver();
    }
}
