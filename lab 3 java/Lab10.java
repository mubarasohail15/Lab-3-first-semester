public class Lab10 {
  public static void main(String[] args) {
    System.out.printf("%-8s %-8s %-8s %-8s %-8s%n","Degrees","Radians","Sin","Cosine","Tangent");
    
    int degrees = 30;
	 double radians = Math.toRadians(degrees);
	double sin =Math.sin(radians);
	double cosine  = Math.cos(radians);
	double  tan = Math.tan(radians);
	System.out.printf("%-8d %-8.4f %-8.4f %-8.4f%-8.4f%n",degrees,radians,sin,cosine,tan);
  	degrees = 60;
    radians = Math.toRadians(degrees);
	 sin =Math.sin(radians);
	cosine  = Math.cos(radians);
	   tan = Math.tan(radians);

    System.out.printf("%-8d %-8.4f %-8.4f %-8.4f %-8.4f%n", degrees, radians,sin,cosine,tan);
	}
  	
}
