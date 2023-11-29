package automation;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class TestScripts extends AppDependentMethods{
	public static void main(String[] args) {
		TestScripts script = new TestScripts();
		script.TC_CreateAndDeleteUser();
	}
	
	
	public void TC_CreateAndDeleteUser() {
		WebDriver oBrowser = null;
		Map<String, String> objData = null;
		try {
			objData = getPropData(System.getProperty("user.dir")+"\\TestData\\TestData.properties");
			
			oBrowser = launchBrowser(objData.get("browser"));
			
			navigateURL(oBrowser, objData.get("url"));
			
			loginToActiTime(oBrowser, objData.get("userName"), objData.get("password"));
			
			String userName = createUser(oBrowser, objData);
			
			deleteUser(oBrowser, userName);
			
			logoutFromActiTime(oBrowser);
		}catch(Exception e) {
			System.out.println("Exception in 'TC_CreateAndDeleteUser()' test script");
		}finally {
			oBrowser.close();
			oBrowser = null;
		}
	}
}
