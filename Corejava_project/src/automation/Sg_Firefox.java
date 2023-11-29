package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sg_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Firefox();
	}
	public static  void Test_Firefox() {
		FirefoxDriver ff = null;
		String strText = null;
		String Address=null;
		try {
			
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "E:\\workspace\\Corejava_project\\Library\\Drivers\\geckodriver.exe");
			ff = new FirefoxDriver();
			ff.manage().window().maximize();
			
			ff.get("http://www.sgtestinginstitute.com/");
			Thread.sleep(2000);
			
			ff.findElement(By.xpath("//a[@href='contact.php']")).click();
			Thread.sleep(2000);
			
			Address = ff.findElement(By.xpath("//i[@class='fa.fa-home.pr-10']")).getText();
			Thread.sleep(2000);
			System.out.println(Address);
			ff.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ff =null;
		}
	}

}
