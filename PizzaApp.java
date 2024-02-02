
class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backPackPrice=20;
	private int basePizza;
	private boolean isExtraCheeseAdded=false;;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedforTakeAway=false;
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg)
		{
			this.price=300;
		}
		else
		{
			this.price=400;
		}
		basePizza=this.price;
	}
	
	public void addExtraCheese()
	{
		isExtraCheeseAdded=true;
		
		this.price+=extraCheesePrice;
	}
	
	public void addExtraToppings()
	{
		isExtraToppingsAdded=true;

		this.price+=extraToppingsPrice;
	}
	
	public void takeAway()
	{
		isOptedforTakeAway=true;
		
		this.price+=backPackPrice;
	}
	
	
	public void getBill()
	{
		String bill="";
		System.out.println("Pizza:"+basePizza);
		if(isExtraCheeseAdded)
		{
			bill+="Extra cheese added:"+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded)
		{
			bill+="Extra Toppings added:"+extraToppingsPrice+"\n";
		}
		if(isOptedforTakeAway)
		{
			bill+="Take away added:"+backPackPrice+"\n";
		}
		bill+="Bill:"+this.price+"\n";
		System.out.println(bill);
		
	}
}
	
 class DeluxPizza extends Pizza
{

	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
		}

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class PizzaApp	{
	

	public static void main (String args[])
	{
		boolean veg;
//		Pizza basePizza=new Pizza(veg=true);
//		basePizza.addExtraToppings();
//		basePizza.addExtraCheese();
//		basePizza.takeAway();
//		basePizza.getBill(); 
		DeluxPizza dp=new DeluxPizza(veg=false);
		dp.takeAway();
		dp.getBill();
	}
}
