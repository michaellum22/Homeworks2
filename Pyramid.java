import java.util.Scanner;
// I had help from  sites listed for the logic when making the pyramid http://stackoverflow.com/questions/12265849/pyramid-of-numbers-in-java and http://letusprogram.com/2013/08/01/java-program-to-print-numbers-in-pyramid-design/

public class Pyramid {
    
    public static void pyramidmaker(int level)
    {
  
        for (int a = 1; a <= level; a++) { // Nested for loop stores the number of levels in the pyramid in a
            for (int b = 1; b <= level - a; b++)  { // Adds spacing to the pyramid
                System.out.print("   "); 
            }
             int j = 1;
               for (int num = a; num >= 1; num--)  { // Creates the left side of the pyramid
                if (j >= 100)  // Allows the pyramid to be evenly spaced up to 100 rows
                	System.out.print(" ");  
                else 
                	System.out.print("  ");
                System.out.print(j); // Prints the number
                j++;
                
               }
               
               j--; //Starts creating the right side of the pyramid
               for (int num = 2; num <=a; num++)  {// Creates the right side of the pyramid
               j--;           // Decreases the number on the right side of the pyramid
               if (j >= 100)   // Allows the pyramid to be evenly spaced up to 100 rows
               	System.out.print( " ");  
               else 
               	System.out.print("  ");
               System.out.print(j);
               }
            System.out.println();// Creates next row
        }
        
    }





public static void main (String[] args)
	{
    	System.out.println ("Enter levels of the pyramid you want");
    
    Scanner input = new Scanner(System.in);
    int number= input.nextInt();
    
    pyramidmaker(number);
    
	}
}




