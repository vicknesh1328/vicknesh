package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace SECOND\\Mouseover\\driver\\chromedriver.exe");
		WebDriver vv= new ChromeDriver();
		vv.get("https://www.sprint.com/");
		WebElement sprint = vv.findElement(By.xpath("//button[@class='unstyled-button sprint-menu__root js-nav-link-root']"));
		Actions ac= new Actions(vv);
		ac.moveToElement(sprint).perform();
		WebElement bill = vv.findElement(By.xpath("//li[@class='sprint-menu__back-button']"));
		ac.doubleClick(bill).perform();
	}

}
