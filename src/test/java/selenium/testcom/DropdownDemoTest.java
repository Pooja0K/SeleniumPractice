package selenium.testcom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropdownDemoTest extends BaseUIClass {
    @Test
    public void handleDropdown() throws InterruptedException {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up"));
        Thread.sleep(2000);

        WebElement daydropDown = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement monthdropDown = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement yeardropDown = driver.findElement(By.xpath("//select[@id='year']"));

        //We use Select class to handle dropdown if it is present in Dom of dropdown field in webpage
        Select select = new Select(daydropDown);
        //Using selectByIndex() method of select class to select value present in dropdown using index value
        select.selectByIndex(3);

        //Using selectByValue() method of select class to select value present in dropdown, here we use value tag
        select = new Select(monthdropDown);
        select.selectByValue("12");

        //Using selectByVisibleText() method to select value in dropdown here we give the visible text value that we see on UI directly
        select = new Select(yeardropDown);
        select.selectByVisibleText("2013");

        //using getOptions() method of select class to get list of all values present in dropdown
        //This method returns List of WebElements and here variable list stores object of type WebElement
        //So if we use Iterator we will get address hence we have to use for loop
        List<WebElement> list = select.getOptions();



        //Creating new Arraylist of type String to store value which is returned by getText() as getText() method return String value
        List<String> newList = new ArrayList<>();
        for (WebElement webElement : list) {
            newList.add(webElement.getText());
        }
        System.out.println(newList);
        Assert.assertTrue(newList.contains("2013"), "Year value is not present");
    }

}
