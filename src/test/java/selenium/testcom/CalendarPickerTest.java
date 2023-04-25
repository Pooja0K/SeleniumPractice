package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPickerTest extends BaseUIClass {
    String URLJqueryApp = "https://jqueryui.com/datepicker/";
    String datePatternJqueryApp = "MM/dd/yyyy";
    String XpathJqueryDateField = "//input[@id='datepicker']";
    String URLGuru99 = "http://demo.guru99.com/test/";
    String datePatternGuru99 = "dd-MM-yyyy HH:mm";

    @Test
    public void calendarDatePickerJqueryApp() throws InterruptedException {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePatternJqueryApp);
        String formattedDate = simpleDateFormat.format(calendar.getTime());
        System.out.println(formattedDate);

        driver.get(URLJqueryApp);
        Thread.sleep(2000);
        WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frameElement);
        WebElement dateField = driver.findElement(By.xpath(XpathJqueryDateField));
        Thread.sleep(2000);
        dateField.sendKeys(formattedDate);
        dateField.sendKeys(Keys.TAB);
    }


    @Test
    public void datePickerGuru99() throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 2);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePatternGuru99);
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String expectedFormattedDate = simpleDateFormat.format(date);

        String [] arr = expectedFormattedDate.split(" ");
        String expectedDate = arr[0];
        System.out.println("Test" + expectedDate);
        String[] bdate = formattedDate.split(" ");
        String expectedBirthdayDate = bdate[0];
        System.out.println(expectedBirthdayDate);
        String expectedBirthdayTime = bdate[1];
        System.out.println(expectedBirthdayTime);

        driver.get(URLGuru99);
        Thread.sleep(3000);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("select date from datepicker demo page"));
        WebElement birthdayDateBox = driver.findElement(By.xpath("//input[@name='bdaytime']"));
        birthdayDateBox.sendKeys(expectedBirthdayDate);
        birthdayDateBox.sendKeys(Keys.TAB);
        birthdayDateBox.sendKeys(expectedBirthdayTime);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("birth date demo page"), "This is not birthdate demo page");

        WebElement birthDateText = driver.findElement(By.xpath("//div[contains(text(),'Your Birth Date')]"));
        System.out.println(birthDateText.getText());
        Assert.assertTrue(birthDateText.getText().contains("Your Birth Date is " +expectedDate), "Birth Date does not match");
        Assert.assertTrue(birthDateText.getText().contains("Your Birth Time is " +expectedBirthdayTime), "Birth Time does not match");
    }
}


