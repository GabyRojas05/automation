package App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by gabriela.rojas on 6/28/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tester!");

        WebDriver appDriver = new FirefoxDriver();
    }
}
