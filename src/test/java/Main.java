import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        String sutUrl = "http://www.e.pl/";
        driver.get(sutUrl);

        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[8]/nobr/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[12]/nobr/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[16]/nobr/a/img")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]/nobr/a/img")).click();
        System.out.println("Adres tej strony to " + driver.getCurrentUrl());

        driver.quit();
    }
}
