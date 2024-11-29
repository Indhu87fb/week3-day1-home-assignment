package week3.day1.homeassignment.polymorphism;

public class APIClient {
	
	//same function name with 1 arguments
	public void sendRequest(String endpoint) {
		System.out.println("The Endpoint"+endpoint);
		
	}
	//same function name with 3 arguments
	public void sendRequest(String  endpoint, String  requestBody,boolean requestStatus) {
		System.out.println("The Endpoint"+endpoint);
		System.out.println("The RequestBody"+requestBody);
		System.out.println("The Requeststatus"+requestStatus);
	
	}
	public static void main(String[] args) {
		System.out.println("Metod Overloading");
		APIClient AC=new APIClient();
		AC.sendRequest("api/users");
		AC.sendRequest("api/users", "Name:indhu", false);
	

}
}
