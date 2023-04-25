package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MousehoverDemoTest extends BaseUIClass {
    @Test
    public void handleMouseover() {
        driver.get("https://www.orangehrm.com/");
        String expectedUrl = "https://www.orangehrm.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Url does not match");

        WebElement platformLink = driver.findElement(By.xpath("//a[text()='Platform']"));
        WebElement peopleMgmtLink = driver.findElement(By.xpath("//div[@class='secondary-menu']//*[contains(text(),'People M')]"));
        WebElement hrLink = driver.findElement(By.xpath("//*[@href='features/hr-administration']"));

        Actions action = new Actions(driver);
        action.moveToElement(platformLink).moveToElement(peopleMgmtLink).moveToElement(hrLink).click().build().perform();
        Assert.assertTrue(driver.getCurrentUrl().contains("hr-administration"));
    }

    @Test
    public void handleKeyPress() throws InterruptedException {
        //This method is to open google page & then verify page title and after that
        // in google search box enter facebook login text and click enter using action class
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        String expectedPageTitle = "Google";
        Assert.assertEquals(pageTitle, expectedPageTitle, "Title does not match");
        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.sendKeys(searchBox, "mobile").sendKeys(Keys.ENTER).click().build().perform();
        //build is used to build set of action, here we have 2 action or sendKeys hence using build
        //and perform will perform the action
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("mobile - google search"));
        //using assertion to verify after facebook login search is successfully done, page title is changes or not
    }

    @Test
    public void dragElementToDestination() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        Assert.assertTrue(driver.getTitle().contains("Droppable"));

        Thread.sleep(2000);

        WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));

        driver.switchTo().frame(frameElement);

        WebElement destination = driver.findElement(By.cssSelector("div[class*='droppable']"));
        WebElement source = driver.findElement(By.cssSelector("div[class*='draggable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();
        Thread.sleep(3000);

        Assert.assertTrue(destination.getText().equals("Dropped!"),"Text does not match");
    }
}



