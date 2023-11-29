package objectMapping;

public interface ObjectLocators {
	public By obj_UserName_Edit = By.xpath("//input[@name='username']");
	public By obj_Password_Edit = By.xpath("//input[@name='pwd']");
	public By obj_Login_Btn = By.id("loginButton");
	public By obj_SaveChanges_Btn = By.xpath("//input[@id='SubmitTTButton']");
	public By obj_USERS_Menu = By.xpath("//div[text()='USERS']");
	public By obj_Shortcut_Window = By.xpath("//div[@id='gettingStartedShortcutsMenuWrapper' and @style='display: block;']");
	public By obj_Shortcut_Close_Btn = By.id("gettingStartedShortcutsMenuCloseId");
	public By obj_AddUser_Btn = By.xpath("//div[text()='Add User']");
	public By obj_User_FirstName_Edit = By.xpath("//input[@name='firstName']");
	public By obj_User_LastName_Edit = By.xpath("//input[@name='lastName']");
	public By obj_User_Email_Edit = By.xpath("//input[@name='email']");
	public By obj_User_UserName_Edit = By.xpath("//input[@name='username']");
	public By obj_User_Password_Edit = By.xpath("//input[@name='password']");
	public By obj_User_RetypePassword_Edit = By.xpath("//input[@name='passwordCopy']");
	public By obj_CreateUser_Btn = By.xpath("//span[text()='Create User']");
	public By obj_DeleteUser_Btn = By.id("userDataLightBox_deleteBtn");
	public By obj_Logout_Link = By.id("logoutLink");
	public By obj_LoginHeader_Label = By.id("headerContainer");
	
}
