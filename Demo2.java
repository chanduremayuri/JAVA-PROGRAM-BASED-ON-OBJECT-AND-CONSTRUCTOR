class Demo2
{
   String str = "Hi I am Global";
   void m1()                             //NON STATIC METHOD
   {
   	System.out.println("Hello from m1()");
   }


   void add(int num1 , int num2)        //NON STATIC METHOD     
   {
   	System.out.println("Addition is :" + (num1 + num2));
   }

   static void m2()                      //STATIC METHOD 
   {
   	System.out.println("I am  from Static method m2()");
   }

   void excControl()
   {
   	String str = "Hi I am Local";
   	this.add(20,20);
   	this.m2();
   	m1();

   	System.out.println(str);
   	System.out.println(this);
   	System.out.println(this.str);

   }

   public static void main(String[] args) 
   {
   	 Demo2 a = new Demo2();

   	 a.excControl();
   	// System.out.println(this);
   }

}