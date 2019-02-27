package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelenium1 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://newtours.demoaut.com");
       String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
            
            driver.manage().window().maximize();
                          driver.findElement(By.linkText("CONTACT")).click();
                          driver.findElement(By.linkText("SUPPORT")).click();
                          driver.findElement(By.linkText("REGISTER")).click();
                          driver.findElement(By.linkText("SIGN-ON")).click();
                          driver.findElement(By.name("userName")).sendKeys("Mariano");
                          driver.findElement(By.name("password")).sendKeys("123456798");
                          driver.findElement(By.name("login")).click();
                          driver.findElement(By.linkText("REGISTER")).click();
                          driver.findElement(By.name("firstName")).sendKeys("Mariano");
                          driver.findElement(By.name("lastName")).sendKeys("Vera");
                          driver.findElement(By.name("phone")).sendKeys("123456798");
                          driver.findElement(By.name("address1")).sendKeys("Asurias 2");
                          driver.findElement(By.name("address2")).sendKeys("num 22");
                          driver.findElement(By.name("city")).sendKeys("Cela");
                          driver.findElement(By.name("state")).sendKeys("Gto");
                          driver.findElement(By.name("postalCode")).sendKeys("13245");
                          Select select = new Select(driver.findElement(By.name("country")));
                          select.selectByVisibleText("MEXICO");
                          Thread.sleep(1500);
                          driver.findElement(By.name("email")).sendKeys("Mariano");
                          driver.findElement(By.name("password")).sendKeys("123456");
                          driver.findElement(By.name("confirmPassword")).sendKeys("123456");
                          driver.findElement(By.name("register")).click();
                          driver.findElement(By.linkText("sign-in")).click();
                          driver.findElement(By.name("userName")).sendKeys("Mariano");
                          driver.findElement(By.name("password")).sendKeys("123456");
                          driver.findElement(By.name("login")).click();
                                                   
                          driver.findElement(By.xpath(("//td[@width ='67%']//input[@value ='oneway']"))).click();
                          
                        //  WebElement radioBtn =  driver.findElement(By.xpath(("//input[@type ='radio'])[2]")));
                          //radioBtn.click();
                          
                          Select select1 = new Select(driver.findElement(By.name("passCount")));
                          select1.selectByVisibleText("4");
                          Thread.sleep(1500);
                          
                          Select select2 = new Select(driver.findElement(By.name("fromPort")));
                          select2.selectByVisibleText("London");
                          Thread.sleep(1500);
                          
                          Select select3 = new Select(driver.findElement(By.name("fromMonth")));
                          select3.selectByVisibleText("March");
                          Thread.sleep(1500);
                          
                          Select select4 = new Select(driver.findElement(By.name("fromDay")));
                          select4.selectByVisibleText("15");
                          Thread.sleep(1500);
                          
                          Select select5 = new Select(driver.findElement(By.name("toPort")));
                          select5.selectByVisibleText("Portland");
                          Thread.sleep(1500);
                          
                          Select select6 = new Select(driver.findElement(By.name("toMonth")));
                          select6.selectByVisibleText("September");
                          Thread.sleep(1500);
                          
                          Select select7 = new Select(driver.findElement(By.name("toDay")));
                          select7.selectByVisibleText("20");
                          Thread.sleep(1500);
                          
                       driver.findElement(By.xpath("(//td[font='2']//input[@name='servClass'])")).click();
                                                   
                          Select select8 = new Select(driver.findElement(By.name("airline")));
                          select8.selectByVisibleText("Unified Airlines");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("findFlights")).click();
                          driver.findElement(By.name("reserveFlights")).click();
                        
                         driver.findElement(By.xpath("//table[border='0']//input[@name='outFlight']")).click();
                          //radioBtn3.click();
                          
                          driver.findElement(By.name("passFirst0")).sendKeys("Lalo");
                          driver.findElement(By.name("passLast0")).sendKeys("Tito");
                          
                          Select select9 = new Select(driver.findElement(By.name("pass.0.meal")));
                          select9.selectByVisibleText("Hindu");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("passFirst1")).sendKeys("Pepe");
                          driver.findElement(By.name("passLast1")).sendKeys("Miko");
                          
                          Select select10 = new Select(driver.findElement(By.name("pass.1.meal")));
                          select10.selectByVisibleText("Kosher");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("passFirst2")).sendKeys("Nene");
                          driver.findElement(By.name("passLast2")).sendKeys("Miko");
                          
                          Select select11 = new Select(driver.findElement(By.name("pass.2.meal")));
                          select11.selectByVisibleText("Low Calorie");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("passFirst3")).sendKeys("Alice");
                          driver.findElement(By.name("passLast3")).sendKeys("Tain");
                          
                          Select select13 = new Select(driver.findElement(By.name("pass.3.meal")));
                          select13.selectByVisibleText("Vegetarian");
                          Thread.sleep(1500);
                          
                          Select select14 = new Select(driver.findElement(By.name("creditCard")));
                          select14.selectByVisibleText("Visa");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("creditnumber")).sendKeys("12345679812345");
                          
                          Select select15 = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
                          select15.selectByVisibleText("03");
                          Thread.sleep(1500);
                          
                          Select select16 = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
                          select16.selectByVisibleText("2005");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("cc_frst_name")).sendKeys("Talio");
                          driver.findElement(By.name("cc_mid_name")).sendKeys("B");
                          driver.findElement(By.name("cc_last_name")).sendKeys("Mison");
                          
                          driver.findElement(By.name("billAddress1")).sendKeys("Azuera 10");
                          driver.findElement(By.name("billAddress2")).sendKeys("Num. 101");
                          driver.findElement(By.name("billCity")).sendKeys("Lion");
                          driver.findElement(By.name("billState")).sendKeys("GT");
                          driver.findElement(By.name("billZip")).sendKeys("12345");
                          driver.findElement(By.name("billZip")).sendKeys("12345");
                          driver.findElement(By.name("delState")).sendKeys("TB");
                          driver.findElement(By.name("delZip")).sendKeys("12345");
                          
                          Select select17 = new Select(driver.findElement(By.name("delCountry")));
                          select17.selectByVisibleText("UNITED STATES");
                          Thread.sleep(1500);
                          
                          driver.findElement(By.name("buyFlights")).click();
                          
                          Thread.sleep(2500);
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}



