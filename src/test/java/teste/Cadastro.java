package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cadastro {
	
	@Test
	public void Cadastro() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/maurilio.santos/Desktop/campo_treinamento/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Marcos");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Silva");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element); 
		combo.selectByVisibleText("Mestrado");
		
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Natacao");
						
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Marcos"));
		Assert.assertEquals("Sobrenome: Silva", driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
		Assert.assertEquals("Escolaridade: mestrado", driver.findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Natacao", driver.findElement(By.id("descEsportes")).getText());
		//Assert.assertEquals("Sugestoes: ", driver.findElement(By.id("descSugestoes")).getText());

				
		driver.quit();
		
				
		
	}

}
