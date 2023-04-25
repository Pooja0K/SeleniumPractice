package selenium.testcom;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;
import selenium.core.CustomDriver;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class BaseUIClass {
     WebDriver driver;
    @BeforeSuite
    public void cleanUpScreenshots() {
        String directoryToClean = ".//screenshots/";
        File file = new File(directoryToClean);
        try {
            FileUtils.cleanDirectory(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Parameters("browser")
    @BeforeMethod
    public void initializeDriver(@Optional("chrome") String browser) {
        driver = CustomDriver.initializeBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void onTestFailure(ITestResult result) {
        String methodName = result.getName().trim();
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(methodName);
        }
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }


    public String getDateTime(String pattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }


    public void takeScreenshot(String methodName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String filePath = ".//screenshots/" + methodName + getDateTime("dd-MM-YYYY_HH-mm-ss") + ".png";
        File destination = new File(filePath);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

}
