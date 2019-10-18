package D_I_Based_Vehicle_Package;

public class Bike implements Vehicle 
{
	private Engine bikeEngine;

	public void setBikeEngine(Engine bikeEngine) {
		this.bikeEngine = bikeEngine;
	}

	@Override
	public void getvehicleType() 
	{
		System.out.println("This is a two-wheller LMV Vehicle");
	}

	@Override
	public void getvehicleBrand(String Brand) 
	{
		System.out.println("This vehicle brand is: "+Brand);	
	}

	@Override
	public void getEngine() 
	{
		bikeEngine.getEngineType();
		bikeEngine.getEngineCapacity();
	}

}
