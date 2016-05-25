package pl.pawc;

public class HelloWorld{
	private String message;
	
	public void setMessage(String message){
		this.message=message;
	}

	public void getMessage(){
		System.out.println("HelloWorld message: "+message);
	}

	public void init(){
		System.out.println("HelloWorld is going through init");
	}

	public void destroy(){
		System.out.println("HelloWorld will destroy now");
	}

}
