package week3.day1.Inheritance;

public class Button extends WebElement {
	
	public void  submit() {
		System.out.println("Button Submitted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button b=new Button();
		b.submit();
		b.click();
		b.setText("Button");
		

	}

}
