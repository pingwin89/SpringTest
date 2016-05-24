package pl.pawc;

public class Foo{
	
	private String message;

	public void setMessage(String message){
		this.message=message;
	}

	public void getMessage(){
		System.out.println("Foo: "+message);
	}	

	public void init(){
		System.out.println("Foo is going through init");
	}

	public void destroy(){
		System.out.println("Foo will destroy now");
	}

}
