// Write a program to check whether a given number is even or odd.

class Logic
{
    void CheckEvenOdd(int iNo)
    {
        if(iNo%2 == 0)                          // Business logic
        {
            System.out.println(iNo+" is a even number");
        }
        else
        {
            System.out.println(iNo+" is a odd number");
        }
    }
}// End of Logic class

class program16_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.CheckEvenOdd(7);                   // Method call
    }
}// End of program16_2 class