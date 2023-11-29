package childwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver ch =null;
String sParent=null;
Set<String> oChildwnd=null;
String url=null;
String title =null;

try {
	ch = new ChromeDriver();
	ch.manage().window().maximize();
	ch.navigate().to("file:///E:/Java%20Notes/SG_06th-OCT-2023_HTML_Locators/HTML/WebPages/SampleWebPage.html");
	Thread.sleep(2000);
	
	ch.findElement(By.id("link_id1")).click();
	Thread.sleep(2000);
	
	sParent=ch.getWindowHandle();
	System.out.println("Parent Window ID :"+sParent);
	
	oChildwnd=ch.getWindowHandles();
	for(String child: oChildwnd) {
		if(!child.equals(sParent)) {
			ch.switchTo().window(child);
			url=ch.getCurrentUrl();
			System.out.println("Child Window URL:"+url);
			title = ch.getTitle();
			System.out.println("Child Window Title: " +title);
			
			ch.close();
			Thread.sleep(2000);
		}
	}
	ch.switchTo().window(sParent);
	url=ch.getCurrentUrl();
	System.out.println("Parent Window URL: " + url);
	
	title=ch.getCurrentUrl();
	System.out.println("Parent Window Title: " +title);
	
	ch.close();
	
}catch(Exception e) {
e.printStackTrace();	
}
finally {
	sParent=null;
	oChildwnd=null;
	url=null;
	title=null;
	ch=null;
	
}


	}

}
