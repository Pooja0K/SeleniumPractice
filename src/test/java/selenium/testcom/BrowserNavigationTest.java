package selenium.testcom;
import org.openqa.selenium.By;
import staticdata.WidgetTypeTest;
import org.testng.annotations.Test;

public class BrowserNavigationTest extends BaseUIClass {
    String locator = "a[href*=%s]";
    private static final String URL = "https://jqueryui.com/droppable/";

    @Test
    public void handleBrowserNavigation() {
        driver.get(URL);
        clickOnWidget(WidgetTypeTest.AUTOCOMPLETE.getValue());
        refreshPage();
        driver.navigate().back();
        driver.navigate().forward();
    }

    public void clickOnWidget(String widgetType) {
        String formattedLocator = String.format(locator, widgetType);
        System.out.println(formattedLocator);
        driver.findElement(By.cssSelector(formattedLocator)).click();
    }
}



