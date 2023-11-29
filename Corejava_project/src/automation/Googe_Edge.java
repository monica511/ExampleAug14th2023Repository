package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Googe_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test_Edge();
	}
 
	public static  void Test_Edge() {
		EdgeDriver ed = null;
		String strText = null;
		try {
			
			System.setProperty("webdriver.Edge.driver", System.getProperty("user.dir") + "E:\\workspace\\Corejava_project\\Library\\Drivers\\msedgedriver.exe");
			ed = new EdgeDriver();
			ed.manage().window().maximize();
			
			ed.get("https://www.google.co.in/");
			Thread.sleep(2000);
		
			ed.findElement(By.xpath("//textarea[@id='APjFqb'][@class='gLFyf']")).sendKeys("Sg Testing Institute");
			Thread.sleep(2000);
			
			ed.findElement(By.xpath("//input[@class='gNO89b'][@name='btnK'][@type='submit']")).click();
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
