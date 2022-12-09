
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CommonMethods.CommonMethods;
import com.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class AmazonSteps extends CommonMethods{
	
	
	public WebDriver driver;
	
	@Given("Ir a pagina {string}")
	public void Ir_a_pagina(String url) {
		
		startBrowser("chrome", url);
		
	}//end Ir_a_pagina
	
	
	@And("Capturar busqueda {}")
	public void Capturar_busqueda(String busqueda) {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.sendKeysInputBusqueda(busqueda);
		
	}//end Capturar_busqueda
	
	
	

}// end AmazonSteps
