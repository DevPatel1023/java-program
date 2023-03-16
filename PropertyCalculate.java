import java.util.Scanner;

interface Property{
	abstract int ComputePrice();
}

class Bunglow implements Property{
	String name;
	int ConstructionArea;
	
	
	public int ComputePrice(){
		Scanner sc=new Scanner(System.in);
		
		int Constructioncost=500;
		float squrfeet_bunglow,TotalPriceb;
		int LandArea=200;
		int LandCost=400;
		
		System.out.println("Enter per squrare foot area for Bunglow:");
		squrfeet_bunglow=sc.nextFloat();
		
		TotalPriceb=squrfeet_bunglow*Constructioncost+LandCost*squrfeet_bunglow+LandCost*squrfeet_bunglow;
		
		System.out.println("The price of bunglow is"+TotalPriceb);
		return 0;
	}
}

class Flat implements Property{
	String name;
	float ConstructionArea;
	int AdditionalCost=200000;
	
	public  int ComputePrice(){
		Scanner sc=new Scanner(System.in);
		
		int Constructoncost=500;
		float squrfeet_flat,TotalPricef;
		
		System.out.println("Enter per squrare foot area for Flat:");
		squrfeet_flat=sc.nextFloat();
		
		TotalPricef=squrfeet_flat*Constructoncost+AdditionalCost;
		System.out.println("The price of flat is"+TotalPricef);
		return 0;
	}
}

class PropertyCalculate{
	public static void main(String args[]){
		Bunglow bunglow=new Bunglow();
		Flat flat=new Flat();
		
		bunglow.ComputePrice();
		flat.ComputePrice();
		
	}
}
