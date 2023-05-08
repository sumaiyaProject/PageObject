package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import base.Base;

public class Customer_Login_And_Customer_HomePage extends Base {
	WebDriver driver;
	//By WelcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");
	By Login =By.xpath("//a[@href='elogin.php']");
	By clickCustomer=By.xpath("//a[text()='Customer Login']");
	By userId=By.name("mailuid");
	By userPassword=By.name("pwd");
	By login=By.xpath("//input[@name='login-submit']");
	By WelcomeDavid=By.xpath("//h2[text()='Welcome David']");
	
	/* pageFactorypage Model
	 * @FindBy(xpath="//a[@href='elogin.php']")
	WebElement loginMenuClick;
	
	@FindBy(xpath="//a[text()='Customer Login'")
	WebElement customerMenuClick;
	
	@FindBy(name="mailuid")
	WebElement enterUserId;
	
 public	 Customer_Login_And_Customer_HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	
//	public String welcomeText() {
//		return getText(WelcomeText);
//	}
	public void click_Login() {
		//driver.findElement(Login).click();
		//loginMenuClick.click();
		click(Login);
	}
	public void click_Customer_Login() {
		click(clickCustomer);
	}
	public void enterUserId(String id) {
		//enterUserId.sendKeys(id);
		sendKeys(userId,id);
	}
	public void enterUserPassword(String Password) {
		sendKeys(userPassword,Password);
	}
	public void clickLoginBtn() {
		click(login);
	}
	public String getWelcomeText() {
		return getText(WelcomeDavid);
	}


}
