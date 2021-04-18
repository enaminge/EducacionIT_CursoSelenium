package Edit.Educacionit1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Laboratorio1 {
	@Test
	public void lab1_e1() {
		//1 Indicar donde esta el ChromeDriver
				System.setProperty("webdriver.chrome.driver", "..\\Educacionit1\\Drivers\\chromedriver.exe");
				
				//2 Instanciar el driver segun el navedador a utilizar
				WebDriver driver = new ChromeDriver();
				
				//3. Abrir el navegador en la pagina de Selenium
				driver.get("https://www.selenium.dev");
				
				//4. cerrar el navegador
				driver.close();
	}
	
	
	@Test
	public void lab1_E2() {
		//1 Indicar donde esta el ChromeDriver
		System.setProperty("webdriver.gecko.driver", "..\\Educacionit1\\Drivers\\geckodriver.exe");
		
		//2 Instanciar el driver segun el navedador a utilizar
		WebDriver driver = new FirefoxDriver();
		
		//3. Abrir el navegador en la pagina de Selenium
		driver.get("https://www.selenium.dev");
		
		//4. Maximizar la pestaña
		driver.manage().window().maximize();
		
		//5. cerrar el navegador
		driver.close();
		}
	
	@Test
	public void lab1_E3() {
		//1 Indicar donde esta el ChromeDriver
		System.setProperty("webdriver.gecko.driver", "..\\Educacionit1\\Drivers\\geckodriver.exe");
		
		//2 Instanciar el driver segun el navedador a utilizar
		WebDriver driver = new FirefoxDriver();
		
		//3. Abrir el navegador en la pagina de Selenium
		driver.get("https://www.selenium.dev");
		
		//4. Identificar el campo de texto y enviarle un valor
		
		WebElement txtSearch = driver.findElement(By.id("gsc-i-id1")); 
		txtSearch.sendKeys("python");
		
		//5. Simular el presionar la tecla ENTER
		txtSearch.sendKeys(Keys.ENTER);
		
		//6. cerrar el navegador
		driver.close();
		}

	
	
}
