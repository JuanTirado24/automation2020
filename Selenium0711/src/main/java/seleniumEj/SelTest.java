package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		System.out.println("SelTest.main()" + "Adicionn modificacion 2 y 3 ");
		// el file.separator indica el / y la idea es traer la ruta del proyecto.
		String exePath = Paths.get("").toAbsolutePath().toString()+File.separator + "drivers"+File.separator;
		
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); // identificando el exe para driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
