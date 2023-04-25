package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitTest extends  BaseUIClass{

    @Test(enabled = false)
    public void concurLogin() throws InterruptedException {
        driver.get("https://www.concursolutions.com");
        driver.findElement(By.xpath("//*[@id='username-input']")).sendKeys("pooja.kumari5@ey.com");
        driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("welcome1");
        driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div/img[@id='brandinglogo']"))));
         WebElement signIn = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div/img[@id='brandinglogo']"));
            }
        });
//        signin.click();
    }
}
