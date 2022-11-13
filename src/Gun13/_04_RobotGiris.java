package Gun13;

/*
Interview Sorulari :
  1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotGiris extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        Myfunc.Bekle(2);

        Robot rbt = new Robot();

        /* Accept All icin */
 //       for (int i=0; i<6; i++) {
 //           rbt.keyPress(KeyEvent.VK_TAB);
 //           rbt.keyRelease(KeyEvent.VK_TAB);
 //           Myfunc.Bekle(1);
 //       }

 //       rbt.keyPress(KeyEvent.VK_ENTER);
 //       rbt.keyRelease(KeyEvent.VK_ENTER);
 //       /********************************/


        for (int i=0; i<22; i++){
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Myfunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);  // su anda windows popup acildi



        /* popup 1 kapatma bölümü

        for (int i=0; i<4; i++){
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Myfunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

         */

        // bilgisayarimizdaki dosyanin path ini, dosya adinin oldugu yere yapistirmamiz gerekiyor bunun icin
        // önce dosyanin path, yolunu hafizaya kopyalayip, sonra ctrl+v ile acilan windows popup in
        // dosya adi bölümüne yapistirmamiz gerekiyor.

        // hafizaya path i kopyaladik
        StringSelection selection = new StringSelection("C:\\Users\\gcamp\\IdeaProjects\\SDET4\\src\\Gun13\\ornek.txt");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

        Myfunc.Bekle(1);
        // ctrl+v bastim
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Myfunc.Bekle(1);
        // ctrl+v biraktim
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        // Entera basarak popup 1 kapattim
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        WebElement chcBox = driver.findElement(By.xpath("//*[@id='terms']"));

        // butona basildiktan sonra yazinin cikmasi süre aliyyor, bu beklendi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded."));




        driverBekleKapat();


    }
}
