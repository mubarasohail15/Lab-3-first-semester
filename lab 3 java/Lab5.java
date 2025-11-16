import java.util.Scanner;
	public class Lab5{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the litres of milk produced");
	double litres=sc.nextInt();
	double cartonsDouble=litres/3.78;
	int cartons =(int) Math.round(cartonsDouble);
	double cost=litres*0.38;
	double profit=cartons*0.27;
	System.out.println("Cartons needed:"+ cartons);
	System.out.println("Cost of milk:$"+ cost);
	System.out.println("Profit for producing milk:$"+ profit);
	}
}

	