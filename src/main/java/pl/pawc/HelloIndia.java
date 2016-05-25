package pl.pawc;

public class HelloIndia{
	
	private String message;
	private String message2;

	public void getMessage(){
		System.out.println("HelloIndia message: "+message);
	}

	public void getMessage2(){
		System.out.println("HelloIndia message2: "+message2);
	}

	public void setMessage(String message){
		this.message=message;
	}

	public void setMessage2(String message2){
		this.message2=message2;
	}

}
