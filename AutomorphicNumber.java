/*
Check if a number is an Automorphic Number or not.
It is said to be so, If the square of the given number ends with the same number itself.
Example : 25, 76 are automorphic numbers because their square is 625 and 5776.
*/
import java.util.*; 
class AutomorphicNumber 
{
    public static void isAutomorphic(int num)
    {
        int numlen = String.valueOf(num).length();
        int numsqr = (num*num);
        int sqrlen = String.valueOf(numsqr).length(); 
        String substr = String.valueOf(numsqr).substring(sqrlen-numlen,sqrlen); 
        System.out.println("Square of "+num+" is "+numsqr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int digits = Integer.parseInt(substr);  

        if(digits == num)
        {
            System.out.println("It is an Automorphic Number.");
        }
        else
        {
            System.out.println("It is not an Automorphic Number.");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the Automorphic Number program!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter the number you want to check : ");
        int num = sc.nextInt();  
        isAutomorphic(num);
        sc.close();
    }
}
