import java.util.*;
class KrishnamurthyNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = sc.nextInt(); //Accepting the number
        String c = String.valueOf(n); // Converting integer to string
        int l = c.length(); //Storing the length of the string
        int i,a,j,s=0,p=1,b=n; //Initializing variables
        for(i = 1; i <= l ; i++)
        {
            a = n % 10;
            for(j = a ; j>=1 ; j--)
            {
                p *= j;
            }
            s += p;
            p = 1;
            n /= 10;
        }
        if(b == s)
        {
            System.out.println("It is a Krishnamurthy Number");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        else
        {
            System.out.println("It is not a Krishnamurthy Number");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}

            
            
            
