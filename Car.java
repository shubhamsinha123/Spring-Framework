package D_I_Based_Vehicle_Package;

public class Car implements Vehicle {
	private Engine carEngine;

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}

	@Override
	public void getvehicleType() 
	{
		System.out.println("This is a four-wheller LMV Vehicle.");
	}

	@Override
	public void getvehicleBrand(String Brand)
	{
		System.out.println("Vehicle brand is: "+Brand);
	}

	@Override
	public void getEngine() 
	{
		carEngine.getEngineType();
		carEngine.getEngineCapacity();
	}
}
