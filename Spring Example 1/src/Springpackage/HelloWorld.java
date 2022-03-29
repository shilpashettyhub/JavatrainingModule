package Springpackage;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Message from the bean: "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}