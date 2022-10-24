package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

 //     <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
 //     id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="">

        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));

        // Class in karsigi olan CSS degerlerini almak icin getCssValue kullanilir
        System.out.println("getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("getCssValue(color) = " + inputValEnter.getCssValue("background"));
        System.out.println("getCssValue(color) = " + inputValEnter.getCssValue("font-size"));


        driverBekleKapat();
    }
}
