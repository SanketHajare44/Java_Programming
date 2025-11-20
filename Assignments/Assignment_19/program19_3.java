// Write a program to check whether number is divisible by 5 and 11 or not.

class Logic
{
    public void checkDivisible(
                                int iNo             // Input
                              )
   {    

        if((iNo % 5 == 0) && (iNo % 11 == 0))       // Business logic
        {
            System.out.println(iNo+" is divisible by 5 and 11");
        }
        else
        {
            System.out.println(iNo+"is divisible by 5 and 11");
        }
   }

}// End of Logic class

class program19_3
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkDivisible(55);                   // Method call
    }
}// End of program19_3 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 55       Output : 55 is divisible by 5 and 11
//  Input : 25       Output : 25 is not divisible by 5 and 11
//  Input : 121      Output : 121 is not divisible by 5 and 11
//
/////////////////////////////////////////////////////////////////
