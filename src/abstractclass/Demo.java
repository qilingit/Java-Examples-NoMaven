package abstractclass;

abstract class Example 
{
	abstract void fun1();
	
	void run() 
	{
		System.out.println("Run function of abstract method");
	}
}

class B extends Example
{

	@Override
	void fun1() 
	{
		System.out.println("Inherite from abstract class Example");
	}
}

public class Demo
{
	public static void main(String[] args)
	{
		Example example = new B();
		example.fun1();
	}
}
