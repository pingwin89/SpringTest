package pl.pawc;

public class Bar{
	
	private String message;

	public void setMessage(String message){
		this.message=message;
	}

	public void getMessage(){
		System.out.println("Bar: "+message);
	}	

	public void init(){
		System.out.println("Bar is going through init");
	}
	
	public void destroy(){
		System.out.println("Bar will destroy now");
	}

}
