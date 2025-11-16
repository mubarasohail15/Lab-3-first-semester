import java.util.Scanner;
	public class Lab7{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of tickets sold of a b c d class separated by spaces");
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int d =sc.nextInt();
	int totalIncome=(a*20)+(b*15)+(c*10)+(d*5);
	System.out.println("TotalIncome="+ totalIncome);
	System.out.println("IncomeA="+(a*20) );
	System.out.println("IncomeB="+(b*15) );
	System.out.println("IncomeC="+(c*10) );
	System.out.println("IncomeD="+(d*5) );
	}
}