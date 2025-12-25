package Jenkins.hlo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class print {
	WebDriver driver;
	@BeforeTest
    public void prin() {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\v-bbharath\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe"); 
    	driver = new EdgeDriver();	
        driver.get("https://office.com");
        System.out.println(driver.getTitle());
        

	}
	@Test
	public void launch()
{
		}
}

