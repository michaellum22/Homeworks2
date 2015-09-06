import java.util.Scanner;


public class Area { 
 

        public static void main (String[] args)
        {
        	double radius;
        	double area;
        	for (int i = 0; i < 10; i++)
		{
        	System.out.println ("Enter radius");
        	
        	Scanner input = new Scanner(System.in);
        	radius = input.nextDouble();
        	
        	area = Math.PI * Math.pow(radius,2);
        	System.out.println ("Radius of the circle is " + radius + " and the area is " + area);
      		 }
        }
 

} 
 