package week3.day1.Inheritance;

public class LoginTestData  extends TestData
{
	//Subclass method
	 public void enterUsername() {
		// TODO Auto-generated method stub
			System.out.println("Subclass:Enter User Name:");
	}
	 
	 public void enterPassword() {
		// TODO Auto-generated method stub
		 System.out.println("Subclass:Enter Password:");
	}

	
 public static void main(String[] args) {
	 LoginTestData ltdobj=new LoginTestData();
	// superclass method
	 ltdobj.enterCredentials();
	 ltdobj.navigateToHomePage();
	 
	 //subclass method
	 ltdobj.enterUsername();
	 ltdobj.enterUsername();
	
}
}
