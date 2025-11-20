// write a program to count total number of factors of a given number.

class Logic
{
    public void countFactors(
                                int iNo            // Input
                            )  
   {
        int iCnt = 0;
        int iFactCount = 0;

        for(iCnt=1; iCnt<=iNo/2; iCnt++)           // Business logic
        {
            if(iNo % iCnt == 0)
            {
                iFactCount++;
            }
        }
        System.out.println("Factors count is "+iFactCount);
   }

}// End of Logic class

class program21_4
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.countFactors(10);                      // Method call
    }
}// End of program21_4 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : Factors count is 4
//  Input : 15      Output : Factors count is 4
//  Input : 28      Output : Factors count is 6
//
/////////////////////////////////////////////////////////////////
