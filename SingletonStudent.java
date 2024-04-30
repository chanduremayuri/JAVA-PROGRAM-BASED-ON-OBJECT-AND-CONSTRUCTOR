class SingletonStudent 
{
	String name ;
	String branch ;
	private  static SingletonStudent singletonObject ;
	private   SingletonStudent(String name,String branch)
	 {
	 	this.name = name ;
	 	this.branch = branch;
	 }
    public static SingletonStudent getInstance(String name, String branch)
    {
    	if(singletonObject == null)
    	{
    		singletonObject = new SingletonStudent(name , branch);
    		return singletonObject;
    	}
    	else 
    	{
    		return singletonObject;
    	}
    }

	 public static void main(String[] args) 
	 {
	 	
	 	SingletonStudent  obj = getInstance("RAMESH","MECH");
	 	System.out.println(obj.name );

	 	SingletonStudent  obj1 = getInstance("SURESH","CIVIL");
	 	System.out.println(obj1.name );
	 }
}