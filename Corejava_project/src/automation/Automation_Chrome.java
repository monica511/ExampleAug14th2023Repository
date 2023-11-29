package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_101_Chrome();
	}
	public static  void Test_101_Chrome() {
		ChromeDriver ch = null;
		String strText = null;
		try {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Library\\Drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			
			ch.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			ch.findElement(By.name("username")).sendKeys("admin");
			ch.findElement(By.name("pwd")).sendKeys("manager");
			
			ch.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			strText = ch.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to ActiTime is successful");
			}else {
				System.out.println("Failed to login to ActiTime");
			}
			
			ch.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			ch.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ch =null;
		}
	}

}
