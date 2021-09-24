import java.util.*;
class EvenIntegersArray 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("You will have to enter 5 integers:");
        int i,j,tempnum;
        int[] arr1 = new int[5],arr2 = new int[5];
        //Accepting 5 integers from user and storing them in arr1.
        for(i=0;i<5;i++)
        {
            System.out.println("Enter element "+(i+1)+" :");
            tempnum = inp.nextInt();
            arr1[i] = tempnum;
        }
        //Storing even elements of arr1 in arr2. 
        for(i=0,j=0;i<arr1.length;i++)
        {
            if(arr1[i] % 2 == 0)
            {
                arr2[j] = arr1[i];
                j++;
            }
        }
        //Displaying arr1 aka User entered array.
        System.out.println("Entered Array :");
        for(i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //Displaying arr2 aka Array containing only even integers from arr1.
        System.out.println("Array with even numbers :");
        for(i=0;i<j;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
