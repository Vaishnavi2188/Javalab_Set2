class Triangle {
    public Triangle() {
      double Perimeter;
      double Area;
      int h=3,a=4,b=5;
      Perimeter=h+a+b;
      Area=(0.5*b*h);
      System.out.println("Perimeter= " + Perimeter);
      System.out.println("Area= " + Area);
    }
}
public class AreaandPerimeter{
    public static void main(String args[])
    {
        Triangle t=new Triangle();
    }
}
