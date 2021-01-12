import java.util.Scanner;

public class rectandcir {
    public static void main(String args[])
        {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the length and breadth of the Rectangle:");
          int l=s.nextInt();
          int b=s.nextInt();
          rcarea obj=new rcarea();
          obj.area(l,b);
          System.out.println("Enter the radius of the Circle:");
          int r=s.nextInt();
          obj.area(r);
          s.close();
    }  
    }
    class rcarea
    {
    void area(int l, int b)
        {
                int rect=l*b;
                        System.out.println("Area of Rectangle = "+rect);
    }
        void area(int r)
            {
                    double pi = 3.141592653589793238;
                            double circ=pi*r*r;
                                    System.out.println("Area of the Circle = "+circ);
    }
}
