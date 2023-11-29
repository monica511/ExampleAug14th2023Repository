package automation;

import java.util.Map;
import org.openqa.selenium.WebDriver;

public class TestScripts_Excel extends AppDependentMethods_Excel{
	public static void main(String[] args) {
		TestScripts script = new TestScripts();
		script.TC_CreateAndDeleteUser();
	}
	
	
	public void TC_CreateAndDeleteUser() {
		WebDriver oBrowser = null;
		Map<String, String> objData = null;
		try {
			objData = getExcelData(System.getProperty("user.dir") + "\\TestData\\TestData.xlsx", "TestData", "Test_002");
			oBrowser = launchBrowser(objData.get("BrowserName"));
			
			navigateURL(oBrowser, objData.get("URL"));
			
			loginToActiTime(oBrowser, objData.get("userName"), objData.get("Password"));
			
			String userName = createUser(oBrowser, objData);
			
			deleteUser(oBrowser, userName);
			
			logoutFromActiTime(oBrowser);
		}catch(Exception e) {
			System.out.println("Exception in 'TC_CreateAndDeleteUser()' test script");
		}finally {
			oBrowser.close();;
			oBrowser = null;
		}
	}
}
