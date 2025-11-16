import java.util.Scanner;
	public class Lab3{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three integers separated by spaces");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int desks=(a+1)/2+(b+1)/2+(c+1)/2;
	System.out.println("Minimumdesks="+desks);
	}
} 