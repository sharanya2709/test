package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.geom.AreaOp;

import javax.xml.soap.SOAPPart;
import java.util.concurrent.TimeUnit;

public class Main {
WebDriver driver;
    public void invokeBrowser()
    {
        try {


                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                //driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.get("http://localhost:9099/epadd/");
                driver.findElement(By.xpath("//div[@id='all-cards']/a[1]/img/h1/h2"));
                //driver.findElement(By.className("cta-box")).click();
                Thread.sleep(2000);
                String at= driver.getTitle();
                String et="Correspondents";
                driver.close();
                if (at.equalsIgnoreCase(et))
                {
                    System.out.println("Test successful");
                }
                else {
                    System.out.println("Test unsuccessful");
                }
            }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.invokeBrowser();
    }
}
