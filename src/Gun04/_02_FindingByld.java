package Gun04;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();    // web sayfasini kontrol eden görevli
        driver.get("https://form.jotform.com/221934510376353");  // web sayfasini ac


        WebElement name= driver.findElement(By.id("first_8"));  // elemani bulma
        name.sendKeys("Gülten");  // kutucuklara yazi gönderme

        WebElement surName= driver.findElement(By.id("last_8"));  // elemani bulma
        surName.sendKeys("Campinari");  // kutucuklara yazi gönderme



        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());


        Myfunc.Bekle(10);
        driver.quit();

    }
}
