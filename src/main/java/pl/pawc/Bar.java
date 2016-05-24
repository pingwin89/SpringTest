package pl.pawc;

public class Bar{
	
	private String message;

	public void setMessage(String message){
		this.message=message;
	}

	public void getMessage(){
		System.out.println("Bar: "+message);
	}	

}
