import java.util.Scanner;



public class Calendar {
	static String Day[] = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
	static String Month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
public static  int checkday(String day)
   { 
	
		if (day == "Su")
		return 0;
		else if (day == "Mo")
			return 1;
		else if (day == "Tu")
			return 2;
		else if (day == "We")
			return 3;
		else if (day == "Th")
			return 4;
		else if (day == "Fr")
			return 5;
		else if (day == "Sa")
			return 6;
		else
	System.out.println ("The day you entered is not valid");
	return 7;
	
   }
public static void main (String[] args)
	{

	int endofmonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	System.out.println ("Enter the year");
    	 Scanner input = new Scanner(System.in);
    	    int year= input.nextInt();
    	 System.out.println ("Enter the day that January 1st is on, using the choices 'Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'");
       	 input = new Scanner(System.in);
       	    String date= input.nextLine(); 
       	    
       	 int dayofmonth = checkday(date);
       	    {
	       	    for (int month = 0; month < 12; month++)	
	       	    {
	       	    	System.out.println("   " + Month[1] + " "+  year);
	       	    	System.out.println(" Su Mo Tu We Th Fr Sa ");
	       	    		            for (int sp=1; sp <= 12; sp++)
	       	    		                    System.out.print(" ");	
	       	    		         for (int p=1; p<= endofmonth[month]; p++)
	       	    		         {  
	      	    		         if (dayofmonth%7==0 && dayofmonth!=0)
	       	    		         System.out.println();
	       	    		         if (dayofmonth <=10)
	       	    		        System.out.printf("%2d", p);
	       	    		         else
	       	    		        System.out.print(" " + p);
	       	    		         	dayofmonth+=1;
	       	    		        }
	       	    		        	
	       	         dayofmonth%=7;
	       	         System.out.println(" ");
	       	    }
       	    }
    	 
	}
}