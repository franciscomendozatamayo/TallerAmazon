package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CommonMethods.CommonMethods;

public class HomePage extends CommonMethods{
	
	
	@FindBy(css = "#twotabsearchtextbox")
	WebElement input_Busqueda;
	
	
	public void sendKeysInputBusqueda(String txt) {
		
		sendKeysElement(input_Busqueda, txt);
		
	}// end sendKeysInputBusqueda

}// end HomePage
