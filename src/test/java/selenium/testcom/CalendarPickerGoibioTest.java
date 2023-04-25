package selenium.testcom;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class CalendarPickerGoibioTest extends BaseUIClass {
    String URLGoibio = "https://www.goibibo.com/flights/";
    @Test
    public void datePickerGoibio() throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 4);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);
        String[] arr = formattedDate.split("-");
        String monthToBeSelected = month + " " + arr[2];
        String Day = arr[0];
        System.out.println(monthToBeSelected);
        System.out.println(Day);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        driver.get(URLGoibio);
        driver.findElement(By.xpath("//span[@role='presentation']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Departure']")).click();
        Thread.sleep(3000);

        while (true) {
            String monthOnPage = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
            if (!monthOnPage.equals(monthToBeSelected)) {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            } else {
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='DayPicker-Day']/p[text()=" + Day + "]")).click();
        driver.findElement(By.xpath("//span[text()='Done']")).click();
    }
}
