package automation;


import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppDependentMethods {
	
	/***********************************************************
	 * Method Name		: launchBrowser()
	 * Purpose			: It opens chrome, firefox and edge browsers
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: browserName
	 * ex				: WebDriver OBrowser = launchBrowser("Chrome");
	 ************************************************************/
	public WebDriver launchBrowser(String browserName) {
		WebDriver oBrowser = null;
		try {
			switch(browserName.toLowerCase()) {
				case "chrome":
					//System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
					oBrowser = new ChromeDriver();
					break;
				case "firefox":
					//System.setProperty("webdriver.gecko.driver", ".\\Library\\drivers\\geckodriver.exe");
					oBrowser = new FirefoxDriver();
					break;
				case "edge":
					//System.setProperty("webdriver.edge.driver", ".\\Library\\drivers\\msedgedriver.exe");
					oBrowser = new EdgeDriver();
					break;
				default:
					System.out.println("Invalid browser '"+browserName+"' is used. Please use appropriate browser name");
					//return null;
			}
			
			if(oBrowser==null) {
				System.out.println("Failed to launch the '"+browserName+"' browser");
				return null;
			}else {
				oBrowser.manage().window().maximize();
				oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				System.out.println("The '"+browserName+"' browser launched successful");
				return oBrowser;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'launchBrowser()' method. " + e);
			return null;
		}
	}
	
	
	/***********************************************************
	 * Method Name		: navigateURL()
	 * Purpose			: It loads the URL
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: oBrowser, strURL
	 ************************************************************/
	public boolean navigateURL(WebDriver oBrowser, String strURL) {
		try {
			oBrowser.navigate().to(strURL);
			Thread.sleep(2000);
			
			if(oBrowser.getTitle().equalsIgnoreCase("actiTIME - Login")) {
				System.out.println("The url '"+strURL+"' is loaded successful");
				return true;
			}else {
				System.out.println("Failed to load the URL '"+strURL+"'");
				return false;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'navigateURL()' method. " + e);
			return false;
		}
	}
	
	
	
	/***********************************************************
	 * Method Name		: loginToActiTime()
	 * Purpose			: It logins to the actiTime
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: oBrowser, userName, password
	 ************************************************************/
	public boolean loginToActiTime(WebDriver oBrowser, String userName, String password) {
		try {
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			if(oBrowser.findElement(By.xpath("//input[@id='SubmitTTButton']")).isDisplayed()) {
				System.out.println("Login to actiTime is successful");
				return true;
			}else {
				System.out.println("Failed to login to actiTime");
				return false;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'loginToActiTime()' method. " + e);
			return false;
		}
	}
	
	
	
	/***********************************************************
	 * Method Name		: createUser()
	 * Purpose			: It will create the new user
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: oBrowser, objData
	 ************************************************************/
	public String createUser(WebDriver oBrowser, Map<String, String> objData) {
		String userName = null;
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			
			//4. click on Add Users button
			//Handle the optional shortcut window
			if(oBrowser.findElements(By.xpath("//div[@id='gettingStartedShortcutsMenuWrapper' and @style='display: block;']")).size() > 0) {
				oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			
			//5. Enter user details and click on "Create user" button & verify user is created successful
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys(objData.get("firstName"));
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys(objData.get("lastName"));
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys(objData.get("emailID"));
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys(objData.get("user_userName"));
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys(objData.get("user_password"));
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys(objData.get("user_retypePassword"));
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
			
			userName = objData.get("lastName")+", "+objData.get("firstName");
			
			if(oBrowser.findElements(By.xpath("//div[@class='name']/span[text()='"+userName+"']")).size() > 0) {
				System.out.println("User is created successful");
				return userName;
			}else {
				System.out.println("Failed to create the user");
				return null;
			}
			
		}catch(Exception e) {
			System.out.println("Exception in the 'createUser()' method. " + e);
			return null;
		}
	}
	
	
	/***********************************************************
	 * Method Name		: deleteUser()
	 * Purpose			: It will delete the user
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: oBrowser, userName, password
	 ************************************************************/
	public boolean deleteUser(WebDriver oBrowser, String userName) {
		try {
			oBrowser.findElement(By.xpath("//div[@class='name']/span[text()='"+userName+"']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			if(oBrowser.findElements(By.xpath("//div[@class='name']/span[text()='"+userName+"']")).size() > 0) {
				System.out.println("Failed to delete the user");
				return false;
			}else {
				System.out.println("User is deleted successful");
				return true;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'deleteUser()' method. " + e);
			return false;
		}
	}
	
	
	
	/***********************************************************
	 * Method Name		: logoutFromActiTime()
	 * Purpose			: It will delete the user
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: oBrowser, userName, password
	 ************************************************************/
	public boolean logoutFromActiTime(WebDriver oBrowser) {
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			if(oBrowser.findElement(By.id("headerContainer")).getText().equals("Please identify yourself")) {
				System.out.println("Logout from actiTime is successful");
				return true;
			}else {
				System.out.println("Failed to logout form the actiTime");
				return false;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'logoutFromActiTime()' method. " + e);
			return false;
		}
	}
	
	
	
	
	/***********************************************************
	 * Method Name		: getPropData()
	 * Purpose			: It will read the prop data in the form of Map object
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: filePath
	 ************************************************************/
	public Map<String, String> getPropData(String filePath){
		FileInputStream fin = null;
		Properties prop = null;
		Map<String, String> objMap = null;
		try {
			objMap = new HashMap<String, String>();
			fin = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fin);
			
			Set<Entry<Object, Object>> oBoth = prop.entrySet();
			Iterator<Entry<Object, Object>> it = oBoth.iterator();
			while(it.hasNext() == true) {
				Entry<Object, Object> mp = it.next();
				objMap.put(mp.getKey().toString(), mp.getValue().toString());
			}
			
			return objMap;
 		}catch(Exception e) {
			System.out.println("Exception in the 'getPropData()' method. " + e);
			return null;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				prop = null;
			}catch(Exception e) {
			}
		}
	}
}

