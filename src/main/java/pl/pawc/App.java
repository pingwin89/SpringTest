package pl.pawc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
  public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");			
  	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		System.out.println("Prototype FOO");
		Foo foo1 = (Foo) context.getBean("foo");
		foo1.setMessage("Foo 1");
		foo1.getMessage();
		Foo foo2 = (Foo) context.getBean("foo");
		foo2.setMessage("Foo 2");
		foo2.getMessage();
	
		System.out.println("Singleton BAR");
		Bar bar1 = (Bar) context.getBean("bar");
		bar1.setMessage("Bar 1");
		bar1.getMessage();
		Bar bar2 = (Bar) context.getBean("bar");
		bar2.getMessage();

		context.registerShutdownHook();

	}
}
