
public class ClassCar {
	
	public String brand;
	public String model;
	public int amountOfFuel;
		

	public void brake() 
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		if (amountOfFuel>0) 
		{
			System.out.println("Car is accerlarating");
			amountOfFuel--;
		}
		else 
		{
			System.out.println("amountOfFuel is" + amountOfFuel);
		}
					
	}
	
	public void printData() 
	{
		//System.out.println("brand is: " + brand + "Model is: " + model + "Amount of fuel: " + amountOfFuel);
		
		System.out.println("brand is: " + brand); 
		System.out.println("Model is: " + model); 
		System.out.println("Amount of fuel: " + amountOfFuel);
	}

	public void refuel(int amount)
	{
		amountOfFuel = amount + amountOfFuel;
		System.out.println("Amount of fuel: " + amountOfFuel);
	}
	
}
