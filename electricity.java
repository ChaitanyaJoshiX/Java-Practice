import java.util.*;
class electricity
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("~~~~HELLO, WELCOME TO OHM'S LAW CALCULATOR PROGRAM!~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("WHAT DO YOU WANT TO CALCULATE?\nVoltage:1\nCurrent:2\nResistance:3");
        System.out.println("Make your choice (1/2/3)");
        int choice= sc.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        double voltage,current,resistance;
        switch(choice)
        {
                    case 1: System.out.println("You have chosen to calculate Voltage" );
                    System.out.println("Enter the Current(I) in amperes(A)");
                    current= sc.nextDouble();
                    System.out.println("Enter the Resistance(R) in ohms(Ω)");
                    resistance= sc.nextDouble();
                    voltage= current*resistance;
                    if(voltage<=999)
                    {
                        System.out.println("The Voltage(V) ="+" "+voltage+"V");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    else if(voltage>=1000)
                   {
                        System.out.println("The Voltage(V) ="+" "+(voltage/1000)+"kV");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   } 
                   else
                   {
                       System.out.println("Invalid Input");
                   }
                    break;
                    case 2: System.out.println("You have chosen to calculate Current" );
                    System.out.println("Enter the Voltage(V) in volts(V)");
                    voltage= sc.nextDouble();
                    System.out.println("Enter the Resistance(R) in ohms(Ω)");
                    resistance= sc.nextDouble();
                    current= voltage/resistance;
                    if(current<=0.899)
                   {
                        double mamps= current*1000;
                        System.out.println("The Current(I) ="+" "+(Math.round(mamps*100.0)/100.0)+"mA");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   }
                    else if(voltage>=0.900)
                   {
                       System.out.println("The Current(I) ="+" "+current+"A");
                       System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   } 
                   else
                   {
                       System.out.println("Invalid Input");
                   }
                    break;
                    case 3: System.out.println("You have chosen to calculate Resistance" );
                    System.out.println("Enter the Voltage(V) in volts(V)");
                    voltage= sc.nextDouble();
                    System.out.println("Enter the Current(I) in amperes(A)");
                    current= sc.nextDouble();
                    resistance= voltage/current;
                    if(resistance<=999)
                    {
                        System.out.println("The Resistance(R) ="+" "+resistance+"Ω");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    else if(resistance>=1000 && resistance<1000000)
                   {
                        System.out.println("The Resistance(R) ="+" "+(resistance/1000)+"kΩ");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   } 
                   else if(resistance>=1000000)
                   {
                        System.out.println("The Resistance(R) ="+" "+(resistance/1000000)+"MΩ");
                        System.out.println("THANK YOU SO MUCH FOR RUNNING MY PROGRAM, CHEERIO!" );
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
            
            
            
            
            
            
            
    
