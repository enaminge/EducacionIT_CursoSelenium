package Edit.Educacionit1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {
	@Test
	public void lab2_E1() {
		//1 Indicar donde esta el ChromeDriver
		System.setProperty("webdriver.chrome.driver", "..\\Educacionit1\\Drivers\\chromedriver.exe");
		
		//2 Instanciar el driver segun el navedador a utilizar
		WebDriver driver = new ChromeDriver();
		
		//3. Abrir el navegador en la pagina de AutomationPractice
		driver.get("http://automationpractice.com/index.php?controller=authentication#account-creation");
		
		//4. Ingresar el correo y hacer clic en el boton create an account
		WebElement txtEmail= driver.findElement(By.cssSelector("#email_create"));
		txtEmail.sendKeys("correo27Mar2021012@correo.com");
		
		driver.findElement(By.name("SubmitCreate")).click();
		
		
		//5. Completar formulario dando 10 seg de espera explicita, o cuando el elemento customer_firstname sea visible
		WebDriverWait myWait =new WebDriverWait(driver,10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("customer_firstname")));

		driver.findElement(By.name("customer_firstname")).sendKeys("Camila");
		
		WebElement txtpass =driver.findElement(By.id("passwd"));
		txtpass.sendKeys("12345");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.selectByValue("4");

		driver.findElement(By.cssSelector("#id_gender1")).click();
		
		//Asignacion sugerida: Completar todo el formulario		
		
		
		Select days = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		days.selectByValue("3");

		Select years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		years.selectByValue("2021");
		
		driver.findElement(By.name("customer_lastname")).sendKeys("Olmos");
		
		driver.findElement(By.name("phone")).sendKeys("123453567");
		
		driver.findElement(By.name("address1")).sendKeys("Parcela 35 santa monica");
		
		driver.findElement(By.name("city")).sendKeys("Santiago");
		
		driver.findElement(By.name("postcode")).sendKeys("70001");
		
		Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		state.selectByValue("1");
		
		//Registramos el formulario que llenamos
		driver.findElement(By.cssSelector("#submitAccount")).click();

		
		}

}
