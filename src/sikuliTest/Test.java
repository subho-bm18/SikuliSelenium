package sikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Test {

	public static WebDriver webdriver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");

System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
webdriver=new ChromeDriver();
webdriver.manage().window().maximize();
webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
webdriver.get("http://newtours.demoaut.com/");
try{
Thread.sleep(5);
Screen s=new Screen();
s.find("username.png"); //identify username button
s.find("password.png");
s.find("signin.png");
if(s.exists("username.png")!=null)
{
s.click("username.png"); 
System.out.println("Found username");
s.type("subho.qtp");
System.out.println("Typed username");

s.click("password.png"); 
System.out.println("Found password");
s.type("qaz1wsx2");
System.out.println("Typed password");

s.click("signin.png"); 
System.out.println("Clicked Sign In");
}}
catch(Exception e)
{
	e.printStackTrace();
	
}
finally
{
	webdriver.close();
}
	}

}
