package Selenium_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Activity4 extends BaseClass{
    @Test
    public void login(){
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

        String logincheck=driver.findElement(By.xpath("//a[@id='tab0']")).getText();
        System.out.println("visibility of "+logincheck +" so login is successful!");

    }
}
