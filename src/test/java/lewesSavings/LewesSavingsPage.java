package lewesSavings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class LewesSavingsPage {
    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        WebDriver driver=new ChromeDriver();
        //2.enter url
        driver.get("https://www.lowes.com");
        //3.maximize window
        driver.manage().window().maximize();
        // 4.get tittle
        String pageTitle =driver.getTitle();
        System.out.println("Page Title is "+pageTitle);
        //4.valigation point/checkpoint

       if(pageTitle.equals("Lowe’s Home Improvement")){
          System.out.println("passed");
       }
      else {
          System.out.println("Failed");
       }
     //5. move cursor to Savings
//        Actions action= new Actions(driver) ;
//    action.moveToElement(driver.findElement(By.linkText("Savings"))).build().perform();
      Thread.sleep(5000);
      driver.manage().deleteAllCookies();
      driver.findElement(By.xpath(("//button[@type='button']"))).click(); //clicked shop button
        driver.findElement(By.xpath("//span[text()='Savings']")).click();
       // driver.findElement(By.linkText("Savings")).click();
        //driver.findElement(By.className("ButtonBase-sc-1ngvxvr-0 ehyYDO backyard " +
             //   "button size--medium variant--ghost color--contrast shape--rounded " +
              //  "sc-1oca1nc-1 sc-c0o4cs-6 kaejRT eLczSe")).click();
        //driver.findElement(By.id("menulink_2")).click();

       driver.close();






        };











    }
















