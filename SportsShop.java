package D_I_Based_Shop_Package;

public class SportsShop implements Shop
{
	private SportsProduct sproducts;
	
	public SportsShop(SportsProduct sproducts) {
		this.sproducts = sproducts;
	}
	@Override
	public void getShopType()
	{
		System.out.println("Welcome here at sports shop.");

	}
	@Override
	public void getProducts() 
	{
		sproducts.getProductType();
	}
}
