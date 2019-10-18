package D_I_Based_Shop_Package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopSimulator {

	public static void main(String[] args) 
	{
		
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("D_I_Based_Shop_Package/Shop.xml");
	
	Shop s1=c1.getBean("shop1",Shop.class);
	s1.getShopType();
	s1.getProducts();
	System.out.println("----------------------------------");
	Shop s2=c1.getBean("shop2",Shop.class);
	s2.getShopType();
	s2.getProducts();
	c1.close();
	}
}
