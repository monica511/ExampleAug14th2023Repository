package automation;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppDependentMethods_Excel {
	
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
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys(objData.get("User_FirstName"));
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys(objData.get("User_LastName"));
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys(objData.get("User_EmailID"));
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys(objData.get("User_UserName"));
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys(objData.get("User_Password"));
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys(objData.get("User_RetypePassword"));
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
			
			userName = objData.get("User_LastName") + ", " + objData.get("User_FirstName");
			
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
	 * Method Name		: getExcelData()
	 * Purpose			: It reads the data from excel based on the testCaseID (LogicalName)
	 * Author			: SG Tester
	 * Date Creation	:
	 * Reviewed By		:
	 * Modified By		:
	 * Date Modified	:
	 * arguments		: browserName
	 * ex				: Map<String, String> objMap = getExcelData("TestData", "Test_001");
	 ************************************************************/
	public Map<String, String> getExcelData(String filePath, String sheetName, String logicalName){
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row1 = null;
		Row row2 = null;
		Cell cell1 = null;
		Cell cell2 = null;
		Map<String, String> objData = null;
		Calendar cal = null;
		String sDay = null;
		String sMonth = null;
		String sYear = null;
		String sKey = null;
		String sValue = null;
		int rowNum = 0;
		int colNum = 0;
		int dataRoWNum = 0;
		try {
			objData = new HashMap<String, String>();
			fin = new FileInputStream(filePath);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(sheetName);
			if(sh==null) {
				System.out.println("Failed to find the '"+sheetName+"' sheet");
				return null;
			}
			
			//find the presence of the given logicalName in the first column
			rowNum = sh.getPhysicalNumberOfRows();
			for(int r=0; r<rowNum; r++) {
				row1 = sh.getRow(r);
				cell1 = row1.getCell(0);
				if(cell1.getStringCellValue().equalsIgnoreCase(logicalName)) {
					dataRoWNum = r;
					break;
				}
			}
			
			
			//If logicalName is present, then read columns as Key & data as values
			if(dataRoWNum > 0) {
				row1 = sh.getRow(0);
				row2 = sh.getRow(dataRoWNum);
				
				colNum = row1.getPhysicalNumberOfCells();
				for(int c=0; c<colNum; c++) {
					cell1 = row1.getCell(c);
					cell2 = row2.getCell(c);
					
					sKey = cell1.getStringCellValue();
					
					//Format the cell2 data
					if(cell2==null || cell2.getCellType()==CellType.BLANK) {
						sValue = "";
					}
					else if(cell2.getCellType()==CellType.BOOLEAN) {
						sValue = String.valueOf(cell2.getBooleanCellValue());
					}
					else if(cell2.getCellType()==CellType.STRING) {
						sValue = cell2.getStringCellValue();
					}
					else if(cell2.getCellType()==CellType.NUMERIC) {
						if(DateUtil.isCellDateFormatted(cell2) == true) {
							double dt = cell2.getNumericCellValue();
							cal = Calendar.getInstance();
							cal.setTime(DateUtil.getJavaDate(dt));
							
							//If day is <10, then add zero as prefix
							if(cal.get(Calendar.DAY_OF_MONTH) < 10) {
								sDay = "0" + cal.get(Calendar.DAY_OF_MONTH);
							}else {
								sDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
							}
							
							//If month is <10, then add zero as prefix
							if((cal.get(Calendar.MONTH)+1) < 10) {
								sMonth = "0" + (cal.get(Calendar.MONTH)+1);
							}else {
								sMonth = String.valueOf((cal.get(Calendar.MONTH)+1));
							}
							
							sYear = String.valueOf(cal.get(Calendar.YEAR));
							sValue = sDay + "/" + sMonth + "/" + sYear;
						}else {
							sValue = String.valueOf(cell2.getNumericCellValue());
						}
					}
					objData.put(sKey, sValue);
				}
				return objData;
			}else {
				System.out.println("Failed to find the logical name '"+logicalName+"' in the TestData excel sheet");
				return null;
			}
		}catch(Exception e) {
			System.out.println("Exception in the 'getExcelData()' method. " + e);
			return null;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				cell1 = null;
				cell2 = null;
				row1 = null;
				row2 = null;
				sh = null;
				wb.close();
				wb = null;
				cal = null;
				sDay = null;
				sMonth = null;
				sYear = null;
				sKey = null;
				sValue = null;
			}catch(Exception e) {
				return null;
			}
		}
	}
}
