// Write a program to check whether a number is positive, negative, or zero.

class Logic
{
    public void checkSign(
                            int iNo             // Input
                         )
   {
        if(iNo < 0)
        {
            System.out.println("Negative");
        }
        else if(iNo > 0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("Zero");
        }
   }

}// End of Logic class

class program18_5
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkSign(0);                      // Method call
    }
}// End of program18_5 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10       Output : positive
//  Input : -5       Output : Negative
//  Input : 0        Output : Zero
//
/////////////////////////////////////////////////////////////////
