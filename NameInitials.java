/*
Input a name. 
The program should return only the initials except for the last name. 

Examples:

1. Name : John Doe
   o/p : J.Doe
2. Name : Harsh Raj Chaudhary
   o/p : H.R.Chaudhary

Author : @ChaitanyaJoshiX   
*/

import java.util.*;
class NameInitials 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your full name :");
        String name = inp.nextLine();
        int l = name.length();
        int i,j;
        int lastspace = name.lastIndexOf(' ');
        String initials = "";

        for(i=0;i<l;i++)
        {
            if(i == 0)
            {
                initials += name.charAt(i) + ".";
            }
            else if(i == lastspace)
            {
                for(j=i+1;j<l;j++)
                {
                    initials += name.charAt(j);
                }
                break;   
            }
            else if(name.charAt(i) == ' ')
            {
                initials += name.charAt(i+1) + ".";
            }
            else
            {
                continue;
            }
        }
        System.out.println("Result: "+initials);
    }
    
}

/*
Author : @ChaitanyaJoshiX  
*/