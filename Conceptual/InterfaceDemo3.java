interface Demo
{
    int no = 11;            // public static final
    void Display();         // public abstract
}

class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display");
    }
}

class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.no);    // no is public and static
        // Demo.no = 12;                // no is final

        Hello hobj = new Hello();

        hobj.Display();
    }
}