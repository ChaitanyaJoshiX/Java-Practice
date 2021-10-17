// Enter necessary data in input.
import java.util.*;
class birthdate
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("~~~~HELLO, WELCOME TO BIRTHDAY INFORMATION PROGRAM!~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ENTER YOUR NAME");
        System.out.println("EXAMPLE: Manoj");
        String name= sc.next();
        System.out.println("Good day to you, "+name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ENTER YOUR BIRTH MONTH");
        System.out.println("EXAMPLE: april ");  
        String month= sc.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ENTER YOUR BIRTH YEAR");                        
        System.out.println("EXAMPLE: 2006");
        int year= sc.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int age= 2018-year;
        System.out.println(name+" "+"your age as of 2018 is"+" "+age);
        System.out.println("Would you like to know the season of your birth in Global Standard or Indian Standard?" );
        System.out.println("Global: 1");
        System.out.println("Indian: 2");
        System.out.println("Make your choice (1/2)");
        int choice= sc.nextInt();
        switch(choice)
        {
                    case 1: System.out.println("You have chosen Global Standard" );
                    if(month.equalsIgnoreCase("march")|| month.equalsIgnoreCase("april")|| month.equalsIgnoreCase("may"))
                    {
                        System.out.println("The season of your birth is: \"Spring\"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("june")|| month.equalsIgnoreCase("july")|| month.equalsIgnoreCase("august"))
                    {
                        System.out.println("The season of your birth is: \"Summer\"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("september") ||month.equalsIgnoreCase("october")|| month.equalsIgnoreCase("november"))
                    {
                        System.out.println("The season of your birth is: \"Autumn\"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("december")|| month.equalsIgnoreCase("january")|| month.equalsIgnoreCase("february"))
                    {
                        System.out.println("The season of your birth is: \"Winter\"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                   break;
                   case 2: System.out.println("You have chosen Indian Standard" );
                   if(month.equalsIgnoreCase("february")|| month.equalsIgnoreCase("march"))
                    {
                        System.out.println("The season of your birth is: \"वसंत\"" );
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("april")|| month.equalsIgnoreCase("may"))
                    {
                        System.out.println("The season of your birth is: \"ग्रीष्म \"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("june")|| month.equalsIgnoreCase("july"))
                    {
                        System.out.println("The season of your birth is: \"वर्षा \"" );
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("august")|| month.equalsIgnoreCase("september"))
                    {
                        System.out.println("The season of your birth is: \"शरद \"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                     else if(month.equalsIgnoreCase("october")|| month.equalsIgnoreCase("november"))
                    {
                        System.out.println("The season of your birth is: \"हेंमत \"");
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else if(month.equalsIgnoreCase("december")|| month.equalsIgnoreCase("january"))
                    {
                        System.out.println("The season of your birth is: \"शिशिर \"" );
                        System.out.println("THANK YOU SO FOR RUNNING MY PROGRAM, CHEERIO!" );
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                    break;
                    default: System.out.println("Invalid Input");
           }
        }
}
            
            
            
            
            
            
            
    
