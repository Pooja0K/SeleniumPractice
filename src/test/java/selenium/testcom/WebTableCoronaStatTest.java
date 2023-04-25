package selenium.testcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTableCoronaStatTest extends BaseUIClass {
    public  static final String URL="file:///D:/SeleniumPractice/website.html";
    String Xpath="//th[text()='Country']//ancestor::thead//following::tbody/tr[%d]";

    @Test
    public void findCountriesPerContinent() throws InterruptedException {
        driver.get(URL);
        List<WebElement> webElements = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        List<String> continent= new ArrayList<>();
        for (WebElement element:webElements){
             String continentName= element.getText();
             continent.add(continentName);
        }
        //System.out.println(continent);

        Map<String,Integer> map = new HashMap<String, Integer>();
        for(String name: continent){
            if(map.containsKey(name)){
                map.put(name, map.get(name)+1);

            }
            else{
                map.put(name,1);
            }
        }
        System.out.println(map);
    }
}
