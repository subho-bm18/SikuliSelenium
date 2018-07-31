package sikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliClass {



public static void main(String[] args)   {
// TODO Auto-generated method stub
	WebDriver webdriver = null;
	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
	webdriver=new ChromeDriver();
	webdriver.manage().window().maximize();
	webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	webdriver.get("http://newtours.demoaut.com/");
	try{
    Thread.sleep(5);
	Screen s=new Screen();
    s.find("username.png"); //identify username button
    if(s.exists("username.png")!=null)
    {
    s.click("username.png"); 
    s.type("subho.qtpp");
    System.out.println("username entered");
    }}
	catch(Exception e)
	{
		
	}

}

} 
