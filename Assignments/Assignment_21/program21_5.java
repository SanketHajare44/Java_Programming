// write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

class Logic
{
    public void countFactors(
                                int iNo            // Input
                            )  
   {
        int iCnt = 0;

        for(iCnt=1; iCnt<=iNo/2; iCnt++)           
        {
            if((iCnt%2 == 0) && (iCnt%3 == 0))      // Business logic
            {
                System.out.println(iCnt);
            }
        }
   }

}// End of Logic class

class program21_5
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.countFactors(30);                      // Method call
    }
}// End of program21_5 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 30      Output : 6 12 18 24 30
//  Input : 20      Output : 6 12 18
//  Input : 10      Output : 6
//
/////////////////////////////////////////////////////////////////

