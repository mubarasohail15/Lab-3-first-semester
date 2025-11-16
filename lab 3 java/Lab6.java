import java.util.Scanner;
	public class Lab6{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rate");
	double Rate=sc.nextDouble();
	System.out.println("Enter the number of hours worked");
	int hours =sc.nextInt();
	double Salary=hours*Rate*5;
	double afterTax= Salary*0.86;
	double clothes=afterTax*0.1;
	double supplies=afterTax*0.01;
	double remainingMoney=afterTax-clothes-supplies;
	double bonds= remainingMoney*0.25;
	double parentsbonds=bonds*0.50;	
	System.out.println("Gross income=$"+Salary);
	System.out.println("Netincome =$"+afterTax);
	System.out.println("Money spend on clothes=$"+ clothes);
	System.out.println("School supplies="+ supplies);
	System.out.println("Saving bonds=$"+bonds);
	System.out.println("Parents bonds for you =$"+parentsbonds);
	}
}

	