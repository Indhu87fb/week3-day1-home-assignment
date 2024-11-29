package week3.day1.homeassignment.polymorphism;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("LoginPage formCommonTasks");
		super.performCommonTasks();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LoginPage LP=new LoginPage();
		 LP.performCommonTasks();
		
				 
	}

}
