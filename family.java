public class family {
    public static void main(String args[])
        {
                p ob=new p();
                        c obj=new c();
        ob.parent();
                obj.child();
                        obj.parent();
    }
}  
class p
{
    void parent()
        {
                System.out.println("This the parent class.....");
                    }
                    }
                    class c extends p
                    {
    void child()
        {
                System.out.println("This is child class....");
    }
    }
