import java.util.Scanner;



public class Area {
    public static void main(String[] args)
        {
        Scanner s=new Scanner(System.in);
                System.out.println("Enter the length and breadth of the reactangle:\n");
                        int l=s.nextInt();
                                int b=s.nextInt();
                                        Area obj=new Area(l,b);
                                           }
    Area(int l,int b)
        {
                System.out.println("Area of the rectangle  = " + returnArea(l,b));
                    }
                        int returnArea(int x,int y)
                            {
                                    return (x*y);
    }
}
