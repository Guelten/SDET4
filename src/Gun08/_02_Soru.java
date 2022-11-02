package Gun08;

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Dogum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();   // girildikten sonrada cookies ler silinmek icin

        Myfunc.Bekle(1);
        //  //*[text()='Allow essential and optional cookies']
        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();


        Myfunc.Bekle(1);
        WebElement btnYeniHesap=driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();


        Myfunc.Bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("ismet");


        Myfunc.Bekle(1);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("temur");


        //1.Yöntem   // [id='reg_form_box'] > [class='hidden_elem']   --> direct WebElement arandi, classs özelligi ile
        // Görünmediginin kontrol edilecek yer
        List<WebElement> secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.Email su an gözüküyor mu", (secondEmail.size()==1));

        Myfunc.Bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");

        secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.Email su an gözüküyor mu", (secondEmail.size()==0));
        // Göründügününü kontrol edilecegi yer


        // #fullname_field+div+div   -->  WebElementi buldu, getattribute ile Class controlü yapti

        WebElement email2=driver.findElement(By.cssSelector("reg_email_confirmation__"));  // 2. email girdik
        email2.sendKeys("istmet@hotmail.com");

        WebElement day = driver.findElement(By.id("day"));
        Select dropDownDay = new Select(day);
        dropDownDay.selectByValue("4");

        WebElement month = driver.findElement(By.id("month"));
        Select dropDownMonth = new Select(month);
        dropDownMonth.selectByValue("10");

        WebElement year = driver.findElement(By.id("year"));
        Select dropDownYear = new Select(year);
        dropDownYear.selectByValue("2000");



        //menu.selectByValue("23");
        driverBekleKapat();


    }
}
