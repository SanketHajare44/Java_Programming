// Write a program to check whether a number is prime or not.

class Logic
{
    public void checkPrime(
                            int iNo                 // Input
                          )
   {
        int iCnt = 0;                               // Loop counter
        boolean bRet = true;
                                       
        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if((iNo%iCnt) == 0)                     // Business logic
            {
                bRet = false;
                break;
            }
            else
            {
               bRet = true;
            }
        }
        if(bRet == true)
        {
            System.out.println(iNo+" is a prime number");
        }
        else
        {
            System.out.println(iNo+" is not a prime number");
        }
   }

}// End of Logic class

class program18_1
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkPrime(3);                          // Method call
    }
}// End of program18_1 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 3      Output : 3 is a prime number
//  Input : 10     Output : 10 is not a prime number
//  Input : 17     Output : 17 is a prime number
//
/////////////////////////////////////////////////////////////////
