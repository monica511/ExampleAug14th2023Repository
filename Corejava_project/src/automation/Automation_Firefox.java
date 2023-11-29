package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_101_Firefox();
	}
	public static  void Test_101_Firefox() {
		FirefoxDriver ff = null;
		String strText = null;
		try {
			
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "E:\\workspace\\Corejava_project\\Library\\Drivers\\geckodriver.exe");
			ff = new FirefoxDriver();
			ff.manage().window().maximize();
			
			ff.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			ff.findElement(By.name("username")).sendKeys("admin");
			ff.findElement(By.name("pwd")).sendKeys("manager");
			
			ff.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			strText = ff.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to ActiTime is successful");
			}else {
				System.out.println("Failed to login to ActiTime");
			}
			
			ff.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			ff.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ff =null;
		}
	}

}

