package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.EmployeeTableColumnIndex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebTableDemoTest extends BaseUIClass {
    public static final String URL = "http" +
            "s://datatables.net/extensions/select/examples/initialisation/checkbox.html";
    private static final String locator = "//table[@id='example']/tbody/tr/td[%s]";

    @Test(priority = -1)
    public void printWebTable() {
        driver.get(URL);
        int columnCount = driver.findElements(By.xpath("//table[@id='example']//tbody/tr[1]/td")).size(); //6
        int rowCount = driver.findElements(By.xpath("//table[@id='example']//tbody/tr")).size(); //10

        for (int row = 1; row <= rowCount; row++) {
            for (int column = 1; column <= columnCount; column++) {
                String locator = "//table[@id='example']/tbody/tr[%d]/td[%d]";
                String tableData = driver.findElement(By.xpath(String.format(locator, row, column))).getText();
                System.out.println(tableData);
            }
            System.out.println("******************************");
        }
    }

    @Test(priority = -4)
    public void shouldValidateIfNameColumnIsSorted() {
        driver.get(URL);
        String formattedLocator = String.format(locator, EmployeeTableColumnIndex.NAME.getIndex());
        List<WebElement> webElements = driver.findElements(By.xpath(formattedLocator));
        List<String> listOfName = new ArrayList<>();

        for (WebElement elements : webElements) {
            String name = elements.getText();
            listOfName.add(name);
        }

        List<String> sortedList = new ArrayList<>(listOfName);
        Collections.sort(sortedList);
        System.out.println("Sorted Name List is "+sortedList);

        Assert.assertEquals(listOfName, sortedList, "List is not sorted ****");
        Assert.assertTrue(listOfName.equals(sortedList), "List is not sorted");

        //List<String> sortedList= listOfName.stream().sorted().collect(Collectors.toList());
    }

    @Test(priority = 1)
    public void shouldValidateIfOfficeColumnIsSorted() {
        driver.get(URL);
        String formattedLocator = String.format(locator, EmployeeTableColumnIndex.OFFICE.getIndex());
        List<WebElement> webElements = driver.findElements(By.xpath(formattedLocator));
        List<String> listOfOffices = getTextFromListOfWebElement(webElements);

        List<String> sortedList = new ArrayList<>(listOfOffices);
        Collections.sort(sortedList);
        System.out.println("Sorted office list is :"+sortedList);
        Assert.assertFalse(listOfOffices.equals(sortedList), "List is not sorted");

        //List<String> sortedList= listOfOffices.stream().sorted().collect(Collectors.toList());
    }

    public List<String> getTextFromListOfWebElement(List<WebElement> webElements) {
        List<String> listOfWebElement = new ArrayList<>();
        for (WebElement elements : webElements) {
            String text = elements.getText();
            listOfWebElement.add(text);
        }
        return listOfWebElement;
    }
}



