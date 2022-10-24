package Gun05;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // web sayfasi acma komutu
        Myfunc.Bekle(3);
        WebElement element= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); // o anda bulundugum URL veriyor.

        Myfunc.Bekle(3);
        driver.navigate().back(); // tarayici history sinden geri geldim.

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum URL veriyor.

        Myfunc.Bekle(3);
        driver.navigate().forward(); // tarayici history sinden ileri gittim.

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum URL veriyor.

        driverBekleKapat();

    }

}
