import java.util.Scanner;
	public class Lab4{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number of minutes");
	int minutes=input.nextInt();
	int hours= minutes/60;
	int remainingminutes= minutes%60;
	System.out.println("the hours "+hours+" remainingminutes "+remainingminutes);
	}
} 