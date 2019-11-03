package main.java.animal;

public interface NestedInterface {
	
	public interface MySecondInterface{}; // Interface inside another interface

	public class Myclass implements NestedInterface,MySecondInterface{}; // class inside an interface


}
