package selenium.testcom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaScriptExecutorTest extends BaseUIClass {

    public static final String URL = "https://datatables.net/extensions/select/examples/initialisation/checkbox.html";

    @Test
    public void scrollToElement() {
        driver.get(URL);
        WebElement webElement = driver.findElement(By.xpath("//a[text()='Bulma']"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        //Generate alert
        javascriptExecutor.executeScript("alert('Welcome to Selenium')");

        Alert alert = driver.switchTo().alert();
        alert.accept();
        //scroll to element
        javascriptExecutor.executeScript("arguments[0].scrollIntoView", webElement);
        webElement.click();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.equals("DataTables example - Bulma"), "PageTitle does not match");
    }
}
