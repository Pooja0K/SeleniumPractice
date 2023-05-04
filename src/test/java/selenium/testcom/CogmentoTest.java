package selenium.testcom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CogmentoTest extends  BaseUIClass{

    public final String URL= "https://ui.cogmento.com/";
    @Test
    public void handleCompanyPage(){
        WebDriverWait webDriverWait=new WebDriverWait(driver,40);
        driver.get(URL);
        driver.findElement(By.name("email")).sendKeys("Pooja19.cse@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Stupid#876");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        WebElement HomePageImageText= driver.findElement(By.xpath("//div[@class='header item']"));
        webDriverWait.until(ExpectedConditions.visibilityOf(HomePageImageText));
        Assert.assertTrue(HomePageImageText.isDisplayed());
        driver.findElement(By.xpath("//div[@id='main-nav']")).click();
        //driver.findElement(By.xpath(""))

    }
}
