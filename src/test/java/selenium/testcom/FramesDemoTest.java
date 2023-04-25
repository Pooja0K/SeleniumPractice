package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesDemoTest extends BaseUIClass {

    @Test
    public void handleDragAndDrop() {
        driver.get("https://jqueryui.com/droppable/");
        Assert.assertTrue(driver.getTitle().contains("Droppable"));
        WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frameElement);
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(target.getText().contains("Dropped!"));

        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[href*=accordion]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/accordion/"));

    }
}
