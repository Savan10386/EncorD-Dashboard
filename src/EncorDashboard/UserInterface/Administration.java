package EncorDashboard.UserInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import EncorDashboard.GlobalLibrary.GlobalFunction;
import EncorDashboard.GlobalLibrary.GlobalVariables;
import net.sf.saxon.expr.instruct.GlobalVariable;

public class Administration {
	
	
	@FindBy(id="ctl00_lnkTextAdministration") WebElement UserAdministration;
	
	@FindBy(className="ui-button-text") WebElement clickUserDropDown;
	
	@FindBy(id="ctl00_ctl00_IndigoLiteMasterContent_AdminBody_LnkUserAccess") WebElement clickUserAccess;
	
	@FindBy(id="ctl00_ctl00_IndigoLiteMasterContent_AdminBody_IndigoGroupDropDown_GroupDropDownCtrl") WebElement selectUserGroup;
	
	@FindBy(id="ctl00_ctl00_IndigoLiteMasterContent_AdminBody_UsersNotInGroup") WebElement userNotInGroup;
	
	@FindBy(id="ctl00_ctl00_IndigoLiteMasterContent_AdminBody_SubmitBtn") WebElement clickSubmit;
	
	@FindBy(id="AddToGroup") WebElement AddToGroupButton;
	
	@FindBy(id="ctl00_ctl00_IndigoLiteMasterContent_AdminBody_UsersInGroup") WebElement userInGroup;
	
	
	
	
	public void clickonAdministrationIcon()
	{
		
	   GlobalFunction.ClickOnAdministration();
		
			
	}
	
	//User Administration
	public void clickUserAdministration()
	{
		try
		{
			
		Thread.sleep(1000);
		
		UserAdministration.click();
		
        Thread.sleep(1000);
		
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//User Administration
	public void SelectUserdropdown()
	{
		try
		{
		    GlobalVariables.oDriver.switchTo().frame("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_concert");
			
		   
		    clickUserDropDown.click();
			
		
            GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.xpath("/html/body/ul[1]"));
		
		       Thread.sleep(1000);
		
		      System.out.println("Test Dropdown");
		
	   		
		   GlobalFunction.Selectdropdown("Savan Vadalia","li");
		}
		
		catch(Exception e)
		{
			
		}
		
	}
		
		//User Access
		public void clickUserAccess()
		{
			try
			{
				
			Thread.sleep(1000);
			
	        clickUserAccess.click();
			
	        Thread.sleep(1000);
			
			}
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//User Access
				public void SelectGroups()
				{
					try
					{
						
					Thread.sleep(1000);
					
			       GlobalVariables.sel  = new Select(selectUserGroup);
			       
			       GlobalFunction.SelectBySelecttag("Administrator");
			 			      		 					
			        Thread.sleep(1000);
			        
			       				
					}
					
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		
	}
				
				//User Access
				public void SelectNotINGroups()
				{
					try
					{
						
					Thread.sleep(1000);
					
					GlobalVariables.oElement =	userNotInGroup;
					
					List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("option"));

				    for (WebElement option : options) {
				        if ("Savan Vadalia".equals(option.getText())) {
				        	 GlobalVariables.sel  = new Select(userNotInGroup);			 						       
						       GlobalFunction.SelectBySelecttag("Savan Vadalia");    		 					
					            Thread.sleep(1000);
				            break;
				        }
				    }
					
				       AddToGroupButton.click();
				       
				       Thread.sleep(1000);
				       
				      clickSubmit.click();
					
					}
					
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		
	}
				
				//User Access
				public void SelectINGroups()
				{
					try
					{
						
					Thread.sleep(1000);
					
					GlobalVariables.oElement =	userInGroup;
					
					List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("option"));

				    for (WebElement option : options) {
				        if ("Savan Vadalia".equals(option.getText())) {
				        	Assert.assertEquals(userInGroup.getText(),"Savan Vadalia");   		 					
					            Thread.sleep(1000);
				            break;
				        }
				    }
					
				       				       
				      clickSubmit.click();
					
					}
					
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		
	}
}
		
	

