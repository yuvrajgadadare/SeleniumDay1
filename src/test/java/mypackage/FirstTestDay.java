package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTestDay {

	public void FirstTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ciitinstitute.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		String code=driver.getPageSource();
		System.out.println("Current Url="+url);
		System.out.println("Title="+title);
		System.out.println(code);
		driver.close();
	}
	
	public void LoginTest() {
		String loginurl="https://ciitinstitute.com/login";
		WebDriver driver=new ChromeDriver();

		driver.get(loginurl);
		driver.manage().window().maximize();
		
		WebElement ecode=driver.findElement(By.id("txtempcode"));
		ecode.sendKeys("CTIE002");
		
		WebElement pass=driver.findElement(By.id("txtpassword"));
		pass.sendKeys("pp");
		
		WebElement btn=driver.findElement(By.id("btnlogin"));
		btn.click();
		try {
				Thread.sleep(4000)
		}
		catch(Exception ex) {}
//		WebElement m=driver.findElement(By.id("msg"));
//		String txt=m.getText();
//		System.out.println("Status Message="+txt);
		
		String currenturl=driver.getCurrentUrl();
		if(!loginurl.equals(currenturl)) {
			System.out.println("Login Success for User");
		}
		else {
			System.out.println("Login Fail for User");

		}
		driver.close();
		 
	}
	public static void main(String[] args) {
		 
		FirstTestDay f=new FirstTestDay();
//		f.FirstTest();
		f.LoginTest();
	}

}
