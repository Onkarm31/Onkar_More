pakage Selinium_Script;
import org.openqa.selenium.By;

public class Automation_Test{
public static void main(String[] args) throws Exception{
WebDriver wd=new ChromeDriver();
Thread.sleep(2000);
wd.manage().window().maximize();
wd.navigate().to("https://testffc.nimapinfotech.com/");

//Username
WebElement username=wd.findElement(By.linkText("Email Id / Mobile No"));
username.clear();
username.sendKeys("onkarmore59@gmail.com");

//Password
WebElement Password=wd.findElement(By.linkText("Password"));
username.clear();
username.sendKeys("Onkar@123");

//Sign In
wd.findElement(By.linktext("Sign In")).click();


//Puch In
wd.findElement(By.linktext("Puch In")).click();

//My Customers
wd.findElement(By.linktext("My Customers")).click();

//Add customer
wd.findElement(By.linktext("New Customer")).click();


//Fill Details of customers

//Lead/Customer Name
wd.findElement(By.xpath("//*[@id="mat-input-23"]")).click();
username.clear();
username.sendKeys("Onkar");

//Ref No.
wd.findElement(By.xpath("//*[@id="mat-input-24"]")).click();
username.clear();
username.sendKeys("01");

//Contact person Name
wd.findElement(By.xpath("//*[@id="mat-input-25"]")).click();
username.clear();
username.sendKeys("Onkar");

//Mobile Number
wd.findElement(By.xpath("//*[@id="mat-input-26"]")).click();
username.clear();
username.sendKeys("9870934404");

//Email
wd.findElement(By.xpath("//*[@id="mat-input-28"]")).click();
username.clear();
username.sendKeys("onkarmore59@gmail.com");

//Contact person Name
wd.findElement(By.linkText("Save)).click();
}
}