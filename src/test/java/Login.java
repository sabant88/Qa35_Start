import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {

    WebDriver wd;

    @Test
    public void login (){

        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement loginBtn = wd.findElement(By.xpath("//a[@href='/login']"));
        loginBtn .click();

        WebElement emailBtn = wd.findElement(By.cssSelector("#user")) ;
        emailBtn.click();
        emailBtn.clear();
        emailBtn.sendKeys("sabant88@mail.ru");


        WebElement atlasianBtn = wd.findElement(By.cssSelector("#login"));
        atlasianBtn.click();
        

        //Miledi88 - password
        WebElement passwordInput = wd.findElement(By.xpath("//*[@class='css-wxvfrp']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("Miledi88");

        WebElement submitBtn = wd.findElement(By.cssSelector("#login-submit"));
        submitBtn.click();


        wd.quit();
    }
}
