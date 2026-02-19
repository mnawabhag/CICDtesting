import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class SeleniumPractice {


    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//
//        System.out.println("Title: " + driver.getTitle());
//        driver.manage().window().maximize();
//        driver.close();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        URL url = new URL("https://example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();

        int responseCode = connection.getResponseCode();

            Arrays.sort(new int[]{5, 2, 8, 1, 3});




    }
}
