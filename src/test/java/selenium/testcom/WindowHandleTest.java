package selenium.testcom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends BaseUIClass {

    public final String URL = "https://www.lambdatest.com/selenium-playground/window-popup-modal-demo";

    @Test(priority = 1)
    public void handleMultipleWindow() throws InterruptedException {
        driver.get(URL);
        driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
        //System.out.println(driver.getTitle());
        String mainWindowID = driver.getWindowHandle();
        Set<String> allWindowID = driver.getWindowHandles();

        for (String currentWindowID : allWindowID) {
            if (!currentWindowID.equals(mainWindowID)) {
                driver.switchTo().window(currentWindowID);
            }
        }
        Thread.sleep(3000);
        System.out.println(driver.getTitle());


    }

    @Test(priority = -1)
    public void handleMultipleWindowsBasedOnTitle() {
        driver.get(URL);
        driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
        String mainWindowID = driver.getWindowHandle();
        Set<String> allWindowID = driver.getWindowHandles();
        for (String currentWindowID : allWindowID) {
            String pageTitle = driver.switchTo().window(currentWindowID).getTitle();
            if (pageTitle.contains("Twitter")) {
                driver.switchTo().window(currentWindowID);
                break;
            }
            System.out.println(driver.getTitle());
            System.out.println("***********************");
        }
        driver.switchTo().window(mainWindowID);

    }
}
