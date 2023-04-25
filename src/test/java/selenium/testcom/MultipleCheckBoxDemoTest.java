package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class MultipleCheckBoxDemoTest extends BaseUIClass {

    String URL = "https://datatables.net/extensions/select/examples/initialisation/checkbox.html";

    @Test
    public void handleMultipleCheckBoxUsingForLoop() throws InterruptedException {
        driver.get(URL);
        List<WebElement> listOfWebElement = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[@class='  select-checkbox']"));

        for (WebElement element : listOfWebElement) {
            element.click();
            Thread.sleep(500);
        }
    }

    @Test
    public void handleMultipleCheckBoxUsingIterator() throws InterruptedException {
        driver.get(URL);
        List<WebElement> listOfWebElement = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[@class='  select-checkbox']"));

        Iterator<WebElement> itr = listOfWebElement.iterator();
        while (itr.hasNext()) {
            Thread.sleep(500);
            WebElement element = itr.next();
            element.click();
        }
    }

    @Test
    public void handleMultipleCheckBoxUsingStream() throws InterruptedException {
        driver.get(URL);
        List<WebElement> listOfWebElement = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[@class='  select-checkbox']"));

        listOfWebElement.stream().forEach(element -> element.click());
    }
}


