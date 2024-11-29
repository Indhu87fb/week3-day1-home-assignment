package week3.day1.Inheritance;

public class TextField extends WebElement {
	
	public void  getText()
	{
		System.out.println("Textext Method");
	}
	
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.setText("Textfield");
		tf.click();
		tf.getText();
	}

}
