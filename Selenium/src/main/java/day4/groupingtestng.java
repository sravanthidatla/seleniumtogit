package day4;


import org.testng.annotations.Test;
public class groupingtestng {
	public  static void main(String[] args)
	{
		System.out.println("Batch Scooter - Test scooter");
	}

	@Test (groups= { "Car" } )
	public void CarTest()
	{
		System.out.println("Batch car-Test car 1");
	}
	@Test (groups= {"Scooters"})
	public void Scooters2()
	{
		System.out.println("Batch Scooter-Test Scooter 2");
	}
	@Test (groups= {"Car","Sedan Car"})
	public void Sedan1()
	{
		System.out.println("Batch");
		
	}
	
}
