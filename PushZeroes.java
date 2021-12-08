/*
Write a program that inputs a list of numbers.
Shifts all the zeros to right and all non-zero numbers to left of the list.
Displays the resultant list.
*/
import java.util.*;
class PushZeroes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,tempnum;
        System.out.print("Enter the number of elements in the list : ");
        int lim = sc.nextInt();
        int[] numbers = new int[lim];

        for(i=0;i<lim;i++) // Accepting the elements
        {
            System.out.print("Enter element "+(i+1)+" : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Original array : " + Arrays.toString(numbers));

        for(i=0; i<lim; i++) //Using reverse bubble sort
        {
            for(j=0; j<lim-i-1; j++)
            {
                if(numbers[j] < numbers[j+1])
                {
                    tempnum = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tempnum;
                }
            }
        }
        System.out.println("Resultant array : " + Arrays.toString(numbers));
    }
}