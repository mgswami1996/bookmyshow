package Open_Browser;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Browser 
{



	public static void main(String[] args) throws InterruptedException,IOException
	{
			    
				
		//System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
       
		    WebDriver driver=new ChromeDriver();
		
			driver.get("http://in.bookmyshow.com/explore/home/");
		 
			Thread.sleep(2000);
			
			
			driver.navigate().to("https://Bengaluru@in.bookmyshow.com/explore/home/bengaluru");
			
			Thread.sleep(2000);
						
			WebElement signInButton = driver.findElement(By.xpath("//a[@id='wzrk-cancel']"));
	        signInButton.click();
	        
	        WebElement emailSignInButton = driver.findElement(By.xpath("//span[text()='Continue with Email']"));
	        emailSignInButton.click();

			WebElement emailId=driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("selauto@yopmail.com");
			
			
			driver.get("http://Yopmail.com");
			driver.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("selauto@yopmail.com");;

            driver.findElement(By.className("material-icons-outlined f36")).click();
            Thread.sleep(2000);
            
            driver.findElement(By.className("lms")).click();
            Thread.sleep(2000);
             driver.findElements(By.xpath("//input[@name='OTP']"));

			
		
		
		
		
		
	}

	

}
