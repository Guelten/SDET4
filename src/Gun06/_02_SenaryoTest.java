package Gun06;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoTest extends BaseDriver {

    public void Test1()
    {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Myfunc.Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        Myfunc.Bekle(2);
        WebElement dropDownDiscover=driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        Myfunc.Bekle(2);
        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        Myfunc.Bekle(2);
        WebElement buttonEveryDay=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        Myfunc.Bekle(2);
        WebElement goodRadio=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        Myfunc.Bekle(2);
        WebElement howLongDropdown=driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLongDropdown.click();

        Myfunc.Bekle(2);
        WebElement secenek4=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();

        goodRadio.click(); // sadece son açılan dropdown kapansın diye herhangi bir yere tıklattık


        driverBekleKapat();

    }


}
