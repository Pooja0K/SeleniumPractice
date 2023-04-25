package selenium.testcom;

import staticdata.WidgetTest;
import staticdata.WidgetTypeTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StringFormatterDemoTest extends BaseUIClass {

    public static final String URL = "https://jqueryui.com/droppable/";
    String locator = "a[href*=%s]";

    @Test
    public void handleMultipleElementWithFormatter() {
        driver.get(URL);
        driver.findElement(By.cssSelector(String.format(locator, WidgetTest.accordion))).click();
        clickOnWidget(WidgetTest.autocomplete);
        clickOnWidget(WidgetTypeTest.BUTTON.getValue());
    }

    public  void clickOnWidget(String WidgetType){
        String formattedLocator=String.format(locator, WidgetType);
        System.out.println(formattedLocator);
        driver.findElement(By.cssSelector(formattedLocator)).click();
    }

}

