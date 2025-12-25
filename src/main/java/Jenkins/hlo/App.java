package Jenkins.hlo;

import org.openqa.selenium.edge.EdgeDriver;

public class App {
  public static void main(String[] args) {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\v-bbharath\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe"); 
    EdgeDriver driver = new EdgeDriver();
    driver.get("https://google.com");  }
}
