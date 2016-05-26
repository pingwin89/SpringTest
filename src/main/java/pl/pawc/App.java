package pl.pawc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
  public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");			

		System.out.println("Bean inheritance");
  	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
		obj.getMessage();
		obj2.getMessage();
		obj2.getMessage2();

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

		System.out.println("Constructor-based DI");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

		System.out.println("Setter-based DI");
		TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
		te2.spellCheck();

		System.out.println("Injecting Inner Beans");
		TextEditor3 te3 = (TextEditor3) context.getBean("textEditor3");
		te3.spellCheck();
    
        System.out.println("Injecting collections");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
        
        System.out.println("Autowiring by name");
        TextEditor4 te4 = (TextEditor4) context.getBean("textEditor4");
        te.spellCheck();
        
		context.registerShutdownHook();

	}
}
