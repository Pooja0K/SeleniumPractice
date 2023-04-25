package selenium.testcom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.core.GenericMethodsTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AlertDemoTest extends BaseUIClass {
    @Test(enabled = true)
    public void handleAlertConcur() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://www.concursolutions.com");
        driver.findElement(By.xpath("//*[@id='username-input']")).sendKeys("pooja.kumari5@ey.com");
        driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("welcome1");
        driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.concursolutions.com/home.asp"));
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Home"), "Title is not correct");
        WebElement origin = driver.findElement(By.xpath("//*[@id='fltDepCityDisplay0']"));
        origin.sendKeys("YYZ");
        origin.click();
        Thread.sleep(5000);
        List<WebElement> departure = driver.findElements(By.xpath("//div[@id='outerfltDepCityDisplay0_airAC']/ul/li/a//span[2]"));
        for (WebElement webElement : departure) {
            if (webElement.getText().equals("Toronto Pearson Intl Airport")) {
                System.out.println("************");
                webElement.click();
                break;
            }
        }

        WebElement destination = driver.findElement(By.xpath("//*[@name='fltArrCityDisplay0']"));
        destination.sendKeys("LHR");
        destination.click();
        Thread.sleep(7000);

        List<WebElement> arrival = driver.findElements(By.xpath("//*[@id='outerfltArrCityDisplay0_airAC']/ul/li/a//span[2]"));
        String arrivalAirport = "London Heathrow Airport";
        GenericMethodsTest.selectValueFromBootDropdown(arrival,arrivalAirport);
        driver.findElement(By.xpath("//*[@aria-label='Search for Flights']")).click();
        Thread.sleep(3000);


        Alert alert = driver.switchTo().alert(); //switch to alert
        String alertText = alert.getText(); // to get text of alert
        System.out.println(alertText);
        String expectedAlertText = "Please enter a value for the departure date.";
        Assert.assertEquals(alertText, expectedAlertText, "Alert text does not match");
        alert.accept(); // to click on ok button of alert or accept alert


    }

    @Test
    public void handleAlertGuruQA() throws InterruptedException {


        driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[name=cusid]")).sendKeys("53920");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name=submit]")).click();
        Thread.sleep(3000);


        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("Customer Successfully Delete!"));
        alert.accept();

    }


}



