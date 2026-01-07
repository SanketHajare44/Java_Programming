class Demo
{
    public int i;                   // Instance variable
    static public int j;           // Class variable

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    {
        System.out.println("Inside initializer block");
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }

    public Demo(int a)
    {
        System.out.println("Inside parametrised constructor");
        this.i = a;
    }
}

class BlocksX
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);
    }
}