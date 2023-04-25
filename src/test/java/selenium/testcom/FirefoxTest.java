package selenium.testcom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirefoxTest extends BaseUIClass{

    String URL="https://www.google.com";

    @Test
    public void launchGoogleonFirefox(){
                driver.get(URL);
    }
}
