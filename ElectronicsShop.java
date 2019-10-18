package D_I_Based_Shop_Package;

public class ElectronicsShop implements Shop {

	private ElectronicsProducts eproducts;

public ElectronicsShop(ElectronicsProducts eproducts) {
this.eproducts = eproducts;

}

	@Override
	public void getShopType() 
	{
		System.out.println("Welcome here at Electronics shop.");
	}

	@Override
	public void getProducts() 
	{
		eproducts.getProductType();
	}

}
