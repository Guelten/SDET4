package Gun14;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class _01_RobotFileUpload2 extends BaseDriver {

    @Test
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        Myfunc.Bekle(2);


  //      /******** Accept All   *******/
  //      driver.switchTo().frame(8);  //"gdpr-consent-notice"
  //      WebElement acceptAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
  //      //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
  //      acceptAll.click();
  //      driver.switchTo().defaultContent();
  //      /*****************************/


        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\gcamp\\IdeaProjects\\SDET4\\src\\Gun13\\ornek.txt");

        Myfunc.Bekle(2);
        WebElement submit=driver.findElement(By.id("submitbutton"));
        submit.click();

        // butona basıldıktan sonra yazının çıkması süre alıyor, bu beklendi
        WebElement uploadMesaj=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded.")); // beklentiyi yazıyoruz

        Myfunc.Bekle(2);
        driverBekleKapat();


    }
}
