package pages;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automationpage {
	WebDriver driver;
	By resources=By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
	By tech=By.xpath("//*[@id=\"list-item-50\"]/div/div[1]");
	By shopify=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[1]");
	By createalead=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a");
	By techno=By.xpath("//input[@placeholder=\"Find a technology\"]");
	By field=By.id("input-985");
	By shoppy=By.xpath("//*[@id=\"list-item-2856-0\"]/div/span");
	
	public Automationpage(WebDriver driver2) {

	this.driver=driver2;
	}
	public void resources()
	{
		driver.findElement(resources).click();
	}
	public void tech()
	{
		driver.findElement(tech).click();
	}
	public void shopify()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(shopify)).click();
		
	}
	
	public void createalead()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(createalead)).click();
		
		
	}
	
	public void techno()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(techno)).click();
		
	
	
	}
	public void field()
	{
		driver.findElement(field).click();
	
}
	public void setvalues(String value)
	{
		driver.findElement(field).sendKeys(value);
	}
	
}

	



