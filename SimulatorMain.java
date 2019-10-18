package D_I_Based_Vehicle_Package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulatorMain 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("D_I_Based_Vehicle_Package/vehicle.xml");
		System.out.println("Welcome to BIKE Center..");
		Vehicle v1=c.getBean("vehicle1",Vehicle.class);
		v1.getvehicleBrand("Bajaj");
		v1.getvehicleType();
		v1.getEngine();
		System.out.println("----------------------------------------");
		System.out.println("Welcome to CAR Center..");
		Vehicle v2=c.getBean("vehcile2",Vehicle.class);
		v2.getvehicleBrand("Toyota");
		v2.getvehicleType();
		v2.getEngine();
		
		c.close();
		
	}

}
