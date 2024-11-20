package com.Page_Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepository_Login;

public class PageLoginpage extends Base_Class{
	
	PageRepository_Login LoginPageRepositary = new PageRepository_Login();
	

		
	/*public boolean NavigateToLoginScreen() throws InterruptedException, IOException
	{
		
		
		System.out.println("Inside Method");
		click(LoginPageRepositary.loginbutn);
		//click(loginbutn);
		return true;
		
	}
	
	public boolean EnterUserName () {
		
		
		
		return true;
		
	}*/
	
	public boolean isLoginButtonVisible() {
		ElementDisplayed(LoginPageRepositary.loginButton);
		return true;
	}
	public boolean Clickloginbutton() throws InterruptedException{
		click(LoginPageRepositary.loginButton);
		Thread.sleep(1000);
		return true;
	}
	public boolean isLoginpopupdisplayed() {
		ElementDisplayed(LoginPageRepositary.Popup);
		return true;
	}
	public boolean isclosebuttonvisible() {
		ElementDisplayed(LoginPageRepositary.Closebutton);
		return true;
	}
	public boolean clickclosebutton() throws InterruptedException {
		click(LoginPageRepositary.Closebutton);
		Thread.sleep(1000);
		return true;
	}
	public boolean isFieldsvisible() {
		ElementDisplayed(LoginPageRepositary.emailaddress);
		ElementDisplayed(LoginPageRepositary.password);
		return true;
	}
    //password and email id invalid entry message validation   
	public boolean invalidemail() throws InterruptedException {
        	 
        	 input(LoginPageRepositary.emailaddress, "abcf");
        	 input(LoginPageRepositary.password,"ssss");
        	 return true;	 
      
         }
    public boolean insideloginclick() throws InterruptedException {
        	 click(LoginPageRepositary.insidelogin);
        	 return true;
         }
    public boolean invalidmessage() {
        	ElementDisplayed(LoginPageRepositary.invalidmessage);
        	return true;
         }
         
         //password masking
    public boolean passwordmasking() {
        	 
        	 WebElement masking=driver.findElement(LoginPageRepositary.Password);
        	 String typeAttribute = masking.getAttribute("type");
             return "password".equals(typeAttribute);
        	 
         }
         //eyeview button
         
    public boolean eyeviewclick() throws InterruptedException {
        	 click(LoginPageRepositary.eyeicon);
        	 return true;
         }
         //login without email and pass
    public boolean nocredentiallogin() throws InterruptedException {
        	 click(LoginPageRepositary.insidelogin);
        	 return true;
        	 
         }
    public boolean validationmessage() {
        	 ElementDisplayed(LoginPageRepositary.emailrequired);
        	 ElementDisplayed(LoginPageRepositary.passwordrequired);
        	 return true;
        	 
         }
     public boolean rememberme() {
        	 ElementDisplayed(LoginPageRepositary.Rememberme);
        	 return true;
        	 
         }
	
	
	
	
	
	
	
	
	

}
