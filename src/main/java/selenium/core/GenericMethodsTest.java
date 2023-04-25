package selenium.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class GenericMethodsTest extends CustomDriver {

    public static void selectByVisibleText(WebElement webElement, String visibleText) {
        Select select = new Select(webElement);
        select.selectByVisibleText(visibleText);
    }

    public static void selectByValue(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    public static void selectByIndex(WebElement webElement, int index) {
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

    public  static void selectValueFromBootDropdown(List<WebElement> list, String text) {
        for (WebElement element : list) {
            if (element.getText().equals(text)) {
                element.click();
                System.out.println("Inside selectValueFromBootDropdown method");
                break;
            }

        }
    }
}
