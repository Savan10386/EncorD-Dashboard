package EncorDashboard.GlobalLibrary;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import EncorDashboard.UserInterface.DashboardGearWheelMenu;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;




public class GlobalFunction {
	
	public static Logger Add_Log = null;
	
	public static void BrowsersSettings()
	{
		File file = new File("E:/workspace/EncorDDashboard/Library/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
 		GlobalVariables.oDriver =  new InternetExplorerDriver();
	}
	
	  public static void init()
	     {
		  
	 		Add_Log = Logger.getLogger("rootLogger");	
	 		
	 		Add_Log.debug("View applog file for logs");
	 		
	     }

	public static Object[][] ReadXlData(String ExcelfileName,String SheetTabName) {
		
		GenericFunction gfn = new GenericFunction();
			
 		gfn.Read_XLS(System.getProperty("user.dir")+"\\bin\\EncorDashboard\\ExcelFile\\"+ExcelfileName+".xls");
 		
 		gfn.retrieveNoOfRows(SheetTabName);
 	
 	       gfn.retrieveNoOfCols(SheetTabName);
 	
 	      Object obj[][]=  gfn.retrieveTestData(SheetTabName);
 	
 	return obj;
		
	}

	public static void ClickOnAdministration() {
		
		// TODO Auto-generated method stub
		
		try
		{
		
		GlobalVariables.oDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("ctl00_lnkAdministration"));
							
		GlobalVariables.oElement.click();
		
		Thread.sleep(2000);
		
    	GlobalFunction.Add_Log.info("Clicked on Administration tab");
		}
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void ClickOnDashboard() {
		// TODO Auto-generated method stub
		
try {
			
			Thread.sleep(2000);
			
			GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("ctl00_lnkTextDashboard"));
			
						
			GlobalVariables.oElement.click();
		
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	  public static void Selectdropdown(String value, String tagname)
		
		{
			List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName(tagname));

		    for (WebElement option : options) {
		        if (value.equals(option.getText())) {
		            option.click();
		            break;
		        }
		    }
		}
	  
	  public static void SelectBySelecttag(String Txt)
	  {
		  
		  GlobalVariables.sel.selectByVisibleText(Txt);
	  }
	  
	  public static void GearWheelMenuOptions(String href)
	  {
		  try
			{
			  
			     Thread.sleep(20000);
		
				GlobalVariables.oElement  =   GlobalVariables.oDriver.findElement(By.className("dropdown-menu"));
			        List<WebElement> anchors = GlobalVariables.oElement.findElements(By.tagName("a"));
			        Iterator<WebElement> i = anchors.iterator();
			 
			        while(i.hasNext()) {
			            WebElement anchor = i.next();
			            if(anchor.getAttribute("href").contains(href)) 
			            {
			            	
			            	System.out.println("Quartely Graph");
			                anchor.click();			              
			                break;
			            }        
		              				
		     	}
			}
			
			catch(Exception e)
			
			{
			}
	  }



	}


