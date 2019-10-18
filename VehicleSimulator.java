package D_I_Based_Vehicle_Package;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleSimulator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("D_I_Based_Vehicle_Package/vehicle.xml");
		boolean b=true;
		while(b)
		{
		System.out.println("Enter Your Choice:"
				+"\n---------------------------------"
				+ "\nPress 1 for Bike."
				+"\nPress 2 for Car."
				+"\nPress 3 for exit.");
		System.out.println("---------------------------------");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				Vehicle v1=c.getBean("vehicle1",Vehicle.class);
				
				v1.getvehicleBrand("Bajaj");
				v1.getvehicleType();
				v1.getEngine();
				System.out.println("---------------------------------");
				break;
			/*
			
			 	*/
			case 2:
				Vehicle v2=c.getBean("vehcile2",Vehicle.class);
				v2.getvehicleBrand("Toyota");
				v2.getvehicleType();
				v2.getEngine();
				System.out.println("---------------------------------");
				break;	
			/*
				*/
		case 3:
			b=false;
			System.out.println("Thankyou...Visit again.");
			System.exit(0);
			
		default:
				System.out.println("Invalid input..");
				System.out.println("---------------------------------");
		}}
		sc.close();
	}
}
		
		

