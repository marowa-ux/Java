public class Car
{
	private String name;
	private String modelNumber;
	private String companyName;
	private double price;
	private int availableQuantity;
	private String category;
	private static double discountRate;
	public int newAvailableQuantity;
	public int newlyAddedQuantity;
	public int sellQuantity;
	
	public Car(){
		
	}
	public Car(String name,String modelNumber,String companyName,double price,int availableQuantity,String category)
	{
		this.name=name;
		this.modelNumber=modelNumber;
		this.companyName=companyName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		this.category=category;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setModelNumber(String modelNumber)
	{
	    this.modelNumber=modelNumber;
	}
	public String getModelNumber()
	{
		return modelNumber;
	}
	public void setCompanyName(String companyName)
	{
	    this.companyName=companyName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public void setPrice(double price)
	{
	    this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public String getCategory()
	{
		return category;
	}
	public static void setDiscountrate(double rate )
	{
	   discountRate= rate;
	}
	public static double getDiscountrate()
	{
		return discountRate;
	}
	public void addQuantity(int amount)
	{
		newAvailableQuantity=availableQuantity + amount;
		newlyAddedQuantity=amount;
	}
	public void sellQuantity(int amount)
	{
		newAvailableQuantity= newAvailableQuantity - amount;
		sellQuantity=amount;
	}
	public void showdetails()
	{
		System.out.println("CAR Name: "+ name);
		System.out.println("Model Number: "+ modelNumber);
        System.out.println("Company Name: "+ companyName);
        System.out.println("Car Price : "+ price);
        System.out.println("Newly Added Quantity of Car: "+ newlyAddedQuantity);
		System.out.println("Car category: "+ category);
		System.out.println("Discount rate : "+discountRate);
        System.out.println("Sell Quantity of Car "+ sellQuantity);
        System.out.println("Car Available :"+ newAvailableQuantity);		
	}
	
}