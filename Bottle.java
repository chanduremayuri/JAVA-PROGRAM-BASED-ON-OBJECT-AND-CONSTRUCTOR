class BottleDriver
{
	String brand;
	String material;
	double capacity;

	BottleDriver(String brand,double capacity,String material)
	{
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
		

	}
	// Method to print bottle details
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Material: " + material);
    }

}
class  Bottle
{
	public static void main(String[] args) 
	{
		BottleDriver a = new BottleDriver("cello ",1, "plastic");
		BottleDriver b = new BottleDriver("Bisleri ",5, "plastic");

		// Print details of each bottle
        System.out.println("Details of Bottle A:");
        a.printDetails();
        System.out.println();
        System.out.println("Details of Bottle B:");
        b.printDetails();
		
		

	}
}
