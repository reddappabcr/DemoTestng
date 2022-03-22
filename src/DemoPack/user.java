package DemoPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class user {
  @Test
  public void createUser() {
	  System.out.println("create user");
  }
  @Test
  public void editUser() {
	  String actual="abcd";
	  String expected="abcd";
	  Assert.assertEquals(actual, expected);	  	  
	  System.out.println("Edit user");
  }
    @Test(dependsOnMethods= {"editUser"})
  public void deleteUser() {
	  System.out.println("delete user");
  }
}
