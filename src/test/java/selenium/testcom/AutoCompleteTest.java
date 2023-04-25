package selenium.testcom;

import org.bouncycastle.dvcs.DVCSRequestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class AutoCompleteTest extends BaseUIClass {
    public static final String URL = "https://www.google.com";

    @Test
    public void handleGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("mobile shop");
        Thread.sleep(3000);
        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));

        for (WebElement element : webElementList) {
            Thread.sleep(3000);
            if (element.getText().equals("mobile shop pimpri")) {
                element.click();
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().contains("mobile shop pimpri"), "Title does not match");
    }
}
