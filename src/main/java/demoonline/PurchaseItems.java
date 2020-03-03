package demoonline;

import static org.fest.assertions.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseItems
{
   WebDriver driver;
   WebElement element;

   public void launch()
   {
      System.setProperty("webdriver.chrome.driver", "C:\\workspace\\demoonline\\src\\main\\resources\\driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://www.demoblaze.com");
      driver.manage().window().maximize();
   }

   public void clickCategory(String value)
   {
      element = driver.findElement(By.xpath("//a[text()='" + value + "']"));
      element.click();
   }

   public void clickProduct(String value)
   {
      element = driver.findElement(By.xpath("//a[text()='" + value + "']"));
      element.click();
   }

   public void clickButton(String value)
   {
      element = driver.findElement(By.xpath("//a[text()='" + value + "']"));
      element.click();
   }

   public void clickPopUp()
   {
      driver.switchTo().alert().accept();
   }

   public void fillForm(String value)
   {
      WebElement name = driver.findElement(By.id("name"));
      name.sendKeys("TestUser");

      WebElement country = driver.findElement(By.id("country"));
      country.sendKeys("TestCountry");

      WebElement city = driver.findElement(By.id("city"));
      city.sendKeys("TestCity");

      WebElement creditCard = driver.findElement(By.id("creditcard"));
      creditCard.sendKeys("123456789012");

      WebElement month = driver.findElement(By.id("month"));
      month.sendKeys("TestMonth");

      WebElement year = driver.findElement(By.id("year"));
      year.sendKeys("TestYear");

      WebElement purchase = driver.findElement(By.xpath("//a[text()='" + value + "']"));
      purchase.click();
   }

   public void deleteProduct(String value)
   {
      element = driver.findElement(By.xpath("//a[text()='" + value + "']"));
      element.click();
   }

   public void assertAmount(String value)
   {
      element = driver.findElement(By.className("lead text-muted"));
      String text = element.getAttribute("textContent");
      assertThat(text).contains(value);
   }

}
