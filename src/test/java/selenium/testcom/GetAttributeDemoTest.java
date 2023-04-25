package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAttributeDemoTest extends BaseUIClass {

    public static final String URL = "https://datatables.net/extensions/select/examples/initialisation/checkbox.html";
    public static final String fbURL = "https://www.facebook.com/";

    @Test
    public void getAttributeIsElement() {
        driver.get(URL);
        WebElement previousButton = driver.findElement(By.id("example_previous"));
        String valueOfButtonPrevious = previousButton.getAttribute("aria-disabled");
        System.out.println(valueOfButtonPrevious);

        Assert.assertTrue(valueOfButtonPrevious.equals("true"), "Aria-Disabled attribute is Enabled");
    }

    @Test
    public void getAttributeOfTextBox() {

        driver.get(fbURL);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sinjan.pk@gmail.com");
        String value = email.getAttribute("value");
        System.out.println(value);

    }
}

