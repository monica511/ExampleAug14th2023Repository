package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_101_Edge();
	}
	public static  void Test_101_Edge() {
		EdgeDriver ed = null;
		String strText = null;
		try {
			
			System.setProperty("webdriver.Edge.driver", System.getProperty("user.dir") + "E:\\workspace\\Corejava_project\\Library\\Drivers\\msedgedriver.exe");
			ed = new EdgeDriver();
			ed.manage().window().maximize();
			
			ed.get("http://localhost/login.do");
			Thread.sleep(2000);
		
			ed.findElement(By.name("username")).sendKeys("admin");
			ed.findElement(By.name("pwd")).sendKeys("manager");
			
			ed.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			strText = ed.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to ActiTime is successful");
			}else {
				System.out.println("Failed to login to ActiTime");
			}
			
			ed.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			ed.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ed =null;
		}
	}

}
