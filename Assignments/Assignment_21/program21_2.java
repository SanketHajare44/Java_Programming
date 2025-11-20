// write a program to ccount how many even and odd numbers are present between 1 and N

class Logic
{
    public void countEvenOddRange(
                                    int iNo             // Input
                                 )  
   {
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if(iCnt%2 == 0)                             // Business logic
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even count is : "+iEvenCount);
        System.out.println("Odd count is : "+iOddCount);  
   
   }

}// End of Logic class

class program21_2
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.countEvenOddRange(50);                  // Method call
    }
}// End of program21_2 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 50      Output : Even count is : 25,  Odd count is : 25
//  Input : 13      Output : Even count is : 6,   Odd count is : 7
//  Input : 1       Output : Even count is : 0,   Odd count is : 1
//
/////////////////////////////////////////////////////////////////

