class Example
{
	String str  = " I am non Static variable";
	public static void main(String[] args) 
	{ 
		System.out.println("Hello from main()");
		Example a = new Example();
		a.m1();
		
	}
	void m1()
	{
		System.out.println("Hi from m1()");
		System.out.println(str);
		m2();
	}

	void m2()
	{
		System.out.println("Hi from m2()");
		System.out.println(str);
	}
}
