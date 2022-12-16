
public class ClassMainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassCar car1 = new ClassCar();
		
		car1.brand = "BMW";
		car1.model ="2020";
		car1.amountOfFuel = 20;
		car1.printData();
		car1.brake();
		car1.accelerate();
		car1.printData();
		
		car1.refuel(20);
			
	}

}
