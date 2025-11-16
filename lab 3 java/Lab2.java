import java.util.Scanner;
	public class Lab2{
	public static void main (String[] args){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the numberr of students");
	int students= input.nextInt();
	System.out.println("Enter the number of apples");
	int apples= input.nextInt();
	int distributed=apples/students;
	int remaining=apples%students;
	System.out.println("the distributed"+ distributed);
	System.out.println("the remaining"+remaining);
	}
}
	