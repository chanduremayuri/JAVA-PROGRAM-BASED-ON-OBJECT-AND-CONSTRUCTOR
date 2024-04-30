class DemoConstructorChain 
{
	DemoConstructorChain()
	{
		this(10);
		System.out.println("Hello from DemoConstructorChain()");

	}
	DemoConstructorChain(int a)
	{
		this("Mayuri");
		System.out.println("Hello from DemoConstructorChain(int a)");
	}
	DemoConstructorChain(String b)
	{
		this(10,"Mayuri");
		System.out.println("Hello from DemoConstructorChain(String b)");
	}

	DemoConstructorChain(int a ,String b)
	{
        super();
        System.out.println("hello from DemoConstructorChain(int a, String b)");

	}

	public static void main(String[] args) 
	{
		DemoConstructorChain a = new DemoConstructorChain();
		

	}
}