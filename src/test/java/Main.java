import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        String sutUrl = "http://www.e.pl/";
        driver.get(sutUrl);

        System.out.println("Otwarto stronę");
        System.out.println("Adres tej strony to " + driver.getCurrentUrl());

        driver.quit();

        System.out.println("Zamknięto przeglądarkę");
    }
}
