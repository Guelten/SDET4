package Gun05;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver{

    public static void main(String[] args) {

       // driverBaslat();

        driver.get("https://www.hepsiburada.com/");  // web sayfasini ac

        List<WebElement> linkler= driver.findElements(By.tagName("a")); // tag ine göre bulma
        // bu bana sayfadaki tüm linkleri verir.

        for (WebElement e : linkler) {
            if (e.getText().equals("")){
                System.out.println("link.getAttribute(href) = " + e.getAttribute("href"));
                System.out.println("link.getAttribute(title) = " + e.getAttribute("title"));
                System.out.println("link.getAttribute(rel) = " + e.getAttribute("rel"));
            }
        }

       driverBekleKapat();

    }
}
