package D_I_Based_Vehicle_Package;

public class PetrolEngine implements Engine
{
	@Override
	public void getEngineType() 
	{
		System.out.println("Engine Type is PETROL.");
	}

	@Override
	public void getEngineCapacity() 
	{
		System.out.println("it's capacity is 978 BHP.");
	}

}
