import java.util.Scanner;
	public class Lab1 {
	public static void main (String[] args){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the amount as decimal ");
	double amount=input.nextDouble();
	int cents =(int)(amount*100);
	int dollars=cents/100;
	int remainingcents=cents%100;
	int quarters=remainingcents/25;
	 remainingcents=remainingcents%25;
	int dimes=remainingcents/10;
	 remainingcents=remainingcents%10;
	int nickels=remainingcents/5;
	 remainingcents=remainingcents%5;
	int pennies=remainingcents;
	System.out.println(" the amount"+amount);
	System.out.println(" the cents"+cents);
	System.out.println(" the dollars"+dollars);
	System.out.println(" the quarters"+quarters);
	System.out.println(" the dimes"+dimes);
	System.out.println(" the nickles"+nickels);
	System.out.println(" the pennies"+pennies);
	}
}