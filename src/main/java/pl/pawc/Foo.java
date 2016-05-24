package pl.pawc;

public class Foo{
	
	private String message;

	public void setMessage(String message){
		this.message=message;
	}

	public void getMessage(){
		System.out.println("Foo: "+message);
	}	

}
