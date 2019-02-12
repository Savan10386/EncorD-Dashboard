package EncorDashboard.UserInterface;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import EncorDashboard.GlobalLibrary.GlobalFunction;
import EncorDashboard.GlobalLibrary.GlobalVariables;



public class DashboardList {

	public void clickonAddDashboard() {
		// TODO Auto-generated method stub
		
		//By administrationclick=By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_LnkDashboardMgmt");
		
		
		 
		
		try
		{	
			
		    GlobalFunction.ClickOnAdministration();
		    			
			GlobalVariables.oDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_LnkDashboardMgmt")).click();		
		
			GlobalVariables.oDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	

}
