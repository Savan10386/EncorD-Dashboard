package EncorDashboard.UserInterface;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;
import EncorDashboard.GlobalLibrary.GlobalFunction;
import EncorDashboard.GlobalLibrary.GlobalVariables;


public class CreateDashboard {
	
	

	public void createdashboard(String column1, String column2, String column3,	String column4, String column5) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		if(column5.contentEquals("Y"))
			
	 {
		   GlobalVariables.oDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		  GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$dashboardGrid$Title$AddButton")).click();
				
	      GlobalVariables.oDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	      GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_NewDashboardRoundPanel_newDashboardName")).sendKeys(column1);
		
	      Select dt1= new Select(GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$NewDashboardRoundPanel$ddlDashboardType")));
		  
	       dt1.selectByVisibleText(column2);
	       
	       GlobalFunction.Add_Log.info("DashboardType is selected");
	       
	       GlobalVariables.oDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				       	       		       
	       Select dt2= new Select(GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$NewDashboardRoundPanel$newDashboardView")));
			  
	       dt2.selectByVisibleText(column3);
	       
	       GlobalFunction.Add_Log.info("View is selected");
	       
	       GlobalVariables.oDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			       
	       Select dt3= new Select(GlobalVariables.oDriver.findElement(By.id("ddlCalOrFiscal")));
			  
	       dt3.selectByVisibleText(column4);
	       
	       GlobalFunction.Add_Log.info("Calender/Fiscal is selected");
	       
		}
	}
		
		public void SearchIndicatorGrid(String column6) throws InterruptedException
		{
			
	       
        GlobalVariables.oDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$NewDashboardRoundPanel$addIndicatorsGridView$DXFREditorcol0")).clear();
		
		GlobalVariables.oDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
				
		GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$NewDashboardRoundPanel$addIndicatorsGridView$DXFREditorcol0")).sendKeys(column6);
					
	   	GlobalVariables.oDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	   	     
	   	Thread.sleep(10000);
	   		   		   	
	   //	GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_NewDashboardRoundPanel_addIndicatorsGridView_Title_headerGridText")).click();
	   	
	    GlobalFunction.Add_Log.info("Search indicator in grid");
		 
		 Thread.sleep(10000);
		 
		 GlobalVariables.oDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		 
		   GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_NewDashboardRoundPanel_addIndicatorsGridView_DXDataRow0"));
		   
		    WebElement em  = GlobalVariables.oElement.findElement(By.tagName("td"));
		    
		     String IndicatorName =  em.getText();
		     
		     		 
		 if(column6.contentEquals(IndicatorName));
		    
		 {
		   		 		
	      GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_NewDashboardRoundPanel_addIndicatorsGridView_DXSelBtn0_D")).click();
	 
	     GlobalVariables.oDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
         GlobalFunction.Add_Log.info("click on checkbox");
            
         GlobalVariables.oDriver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
         
         GlobalVariables.oDriver.findElement(By.name("ctl00$ctl00$IndigoLiteMasterContent$AdminBody$NewDashboardRoundPanel$addIndicatorsGridView$DXFREditorcol0")).clear();
         
         Thread.sleep(10000);
       
		
		}
	}
		
		public void clickSavebutton(String flag) throws InterruptedException
		
		{ 
                                               
           if(flag.contentEquals("N"))
         {	
	    	GlobalVariables.oDriver.findElement(By.id("ctl00_ctl00_IndigoLiteMasterContent_AdminBody_NewDashboardRoundPanel_newDashboardButton")).click();
	    		    	
	         EncorDashboard.GlobalLibrary.GlobalFunction.Add_Log.info("Dashboard is saved");
		 		
	   }
		
    }
}




