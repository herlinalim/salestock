import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckOutElements {
	public WebDriver driver;
	public WebElement email;
	public WebElement name;
	public WebElement address;
	public WebElement card_type;
	public WebElement card_number;
	public WebElement cardholder_name;
	public WebElement verification_code;
	public WebElement submit;
	
	public CheckOutElements(){
		driver = new FirefoxDriver();
	}
	
	public void setValidData(){
		email.sendKeys("herlina.lim.08@gmail.com");
		name.sendKeys("Herlina");	
		address.sendKeys("Perum. Nogotirto");
		card_type.sendKeys("Visa");
		card_number.sendKeys("1234567890123456");	
		cardholder_name.sendKeys("Herlina");
		verification_code.sendKeys("123");
	}
	
	public void loadElements(){
		driver.get("http://www.practiceselenium.com/check-out.html");
		
		email = driver.findElement(By.id("email"));
		name = driver.findElement(By.id("name"));	
		address = driver.findElement(By.id("address"));
		card_type = driver.findElement(By.id("card_type"));
		card_number = driver.findElement(By.id("card_number"));
		cardholder_name = driver.findElement(By.id("cardholder_name"));
		verification_code = driver.findElement(By.id("verification_code"));
		submit = driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button"));
	}

}
