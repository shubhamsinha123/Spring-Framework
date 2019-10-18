package D_I_Based_Vehicle_Package;

public class DieselEngine implements Engine {

	@Override
	public void getEngineType() 
	{
		System.out.println("Engine Type is DIESEL.");
	}

	@Override
	public void getEngineCapacity() 
	{
		System.out.println("it's capacity is 1178 BHP.");
	}
}
