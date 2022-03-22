package DemoPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Custmer {
	
	@BeforeClass
	  public void OpenBrowse()
	  {
		  System.out.println("Open Browser");
	  } 
	@BeforeMethod
	  public void LogIn()
	  {
		  System.out.println("LogIn");
	  } 
  @Test(priority=0)
  public void CreateCumtomer()
  {
	  System.out.println("Create customer");
  } 
    
  @Test(priority=5)
  public void EditCumtomer()
  {
	  System.out.println("Edit customer");
  }
      
  @Test(priority=20)
  public void DeleteCumtomer()
  {
	  System.out.println("Delete customer");
  }
  @AfterMethod
  public void LogOut()
  {
	  System.out.println("LogOut");
  } 
  
  @AfterClass
  public void CloseBrowser()
  {
	  System.out.println("CloseBrowser");
  } 
}
