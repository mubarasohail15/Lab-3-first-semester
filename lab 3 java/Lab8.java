import java.util.Scanner;
	public class Lab8 {
	 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number between 0 and 1000: ");
   	 int num = sc.nextInt();
	int d1 = num % 10;           
   	 int d2 = (num / 10) % 10;    
   	 int d3 = (num / 100) % 10;   
   	 int d4 = (num / 1000) % 10;  

    int sum = d1 + d2 + d3 + d4;

    System.out.println("The sum of digits = " + sum);
 	 }
}
