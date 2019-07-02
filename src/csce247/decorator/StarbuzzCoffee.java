package csce247.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();
		System.out.println(houseBlend.getDescription() +  " $" + houseBlend.getCost());
		
		Beverage darkRoast = new DarkRoast();
		System.out.println(darkRoast.getDescription() +  " $" + darkRoast.getCost());
		
		Beverage decaf = new Decaf();
		System.out.println(decaf.getDescription() +  " $" + decaf.getCost());
		
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() +  " $" + espresso.getCost());
	}
}
