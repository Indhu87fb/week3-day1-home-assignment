package week3.day1.Inheritance;

public class RadioButton extends Button{
	
	public void selectRadioButton()
	{
		System.out.println("Select Radio button");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton rbobj=new RadioButton();
		rbobj.selectRadioButton();
		
		//parent class Button
		
		rbobj.submit();
       
	}

}
