// I had help from sites for the calendar concept: http://www.dreamincode.net/forums/topic/86793-displaying-calendar-for-each-month-of-given-yearday/
// I wasn't able to arrange the days by the month, and for some reason, the days would not line up with the numbers. I was able to implement 
//the leap year and for the program to accept days

import java.util.Scanner;



public class Calendar {
    static String Day[] = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }; // String array for days of the week
    static String Month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    public static boolean isLeapYear(int year) { // Function to check for leap year
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }
    public static  int checkday(String day) //Function to check what day of the week the user inputted
    {
        
        if (day.equals("Su"))
            return 0;
        else if (day.equals("Mo"))
            return 1;
        else if (day.equals("Tu"))
            return 2;
        else if (day.equals("We"))
            return 3;
        else if (day.equals("Th"))
            return 4;
        else if (day.equals("Fr"))
            return 5;
        else if (day.equals("Sa"))
            return 6;
        else
            System.out.println ("The day you entered is not valid");
        return 7;
        
    }
    public static void main (String[] args)
    {
        
        int endofmonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Array stores number of days in a month
        System.out.println ("Enter the year");
        Scanner input = new Scanner(System.in);
        int year= input.nextInt();
        System.out.println ("Enter the day that January 1st is on, using the choices 'Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'");
        input = new Scanner(System.in);
        String date= input.nextLine();
        
        int dayofmonth = checkday(date); // dayofmonth holds the first day
        if (dayofmonth < 7 && dayofmonth > -1) // Check to make sure day is valid
        {   
            for (int month = 0; month < 12; month++) // Loop for 12 months
            {
                if (month == 2 && isLeapYear(year)) // Leap year check
                    endofmonth[1] = 29;
                System.out.println("         " + Month[month] + " "+  year);
                System.out.println("  Su  Mo  Tu  We  Th  Fr  Sa ");
                for (int sp=1; sp <= 6; sp++) // Prints out the spacing for the first month
                    System.out.print("  ");
               
                for (int p=1; p<= endofmonth[month]; p++) // Prints out the number of days in the month
                {
                    if ((dayofmonth + p)%7==0 && dayofmonth!=0)
                        System.out.println();
                    if (dayofmonth <=10)
                        System.out.printf("%3d", p); // Adds a space to single digit dates
                    else
                        System.out.printf("%4d", p);
                    dayofmonth+=1;
                }
                
                
                System.out.println(" ");// Adds the next month
            }
        }
        
    }
}