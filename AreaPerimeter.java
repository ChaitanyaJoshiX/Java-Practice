import java.util.*;
class AreaPerimeter 
{
    public static double RectangleArea(double l, double b)
    {
        double Area = l*b;
        return Area;
    }

    public static double RectanglePerimeter(double l, double b)
    {
        double Perimeter = 2*(l+b);
        return Perimeter;
    }

    public static double SquareArea(double s)
    {
        double Area = s*s;
        return Area;
    }

    public static double SquarePerimeter(double s)
    {
        double Perimeter = 4*s;
        return Perimeter;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome the Area and Perimeter program!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menu\n1.Rectangle\n2.Square");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Choice (1/2) : ");
        int choice = sc.nextInt();
        double Area,Perimeter; 
        switch(choice)
        {
            case 1: System.out.println("You have chosen Rectangle.");
            System.out.println("Enter the length (cm) and breadth (cm) : ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            Area = RectangleArea(l,b);
            System.out.println("Area = "+Area+"cm²");
            Perimeter = RectanglePerimeter(l,b);
            System.out.println("Perimeter = "+Perimeter+"cm"); 
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            break;

            case 2: System.out.println("You have chosen Square.");
            System.out.println("Enter the side (cm) : ");
            double s = sc.nextDouble();
            Area = SquareArea(s);
            System.out.println("Area = "+Area+"cm²");
            Perimeter = SquarePerimeter(s);
            System.out.println("Perimeter = "+Perimeter+"cm"); 
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            break;

            default: System.out.println("Invalid choice! Only r or s.");
            break;
        }
        sc.close();
    }
}
