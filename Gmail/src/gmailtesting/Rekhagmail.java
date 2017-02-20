package gmailtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rekhagmail {

	public Rekhagmail() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new FirefoxDriver();
		dr.get("https://accounts.google.com");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println(dr.getPageSource());//
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
        dr.findElement(By.xpath(".//*[@id='Email']")).sendKeys("surekha3.ch@gmail.com");
        dr.findElement(By.xpath(".//*[@id='next']")).click();
        dr.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("rekha406");
        dr.findElement(By.xpath(".//*[@id='signIn']")).click();
        System.out.println("Gmail account is opened succcessfully");
        System.out.println("First change checkin for Github");
        dr.close();
	}

}
