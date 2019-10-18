package StudentDetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("StudentDetails/Student.xml");
		
		Student s1=c.getBean("cs1",Student.class);
		s1.getName("RAHUL");
		s1.getPercentage(84.89);
		s1.displayBranch();
		System.out.println("--------------------------");
		Student s2=c.getBean("civil1",Student.class);
		s2.getName("RISHA");
		s2.getPercentage(87.94);
		s2.displayBranch();
		c.close();
	}
}
