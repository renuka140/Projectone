import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    
public static void main(String args[])
{
    System.out.println("welcome");
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver d;
    d=new ChromeDriver();
    d.get("https://parabank.parasoft.com/parabank/index.htm");
    
}

}
