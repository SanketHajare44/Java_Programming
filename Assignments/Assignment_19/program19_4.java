// write a program to print each digit of a number separately.

class Logic
{
    public void printDigits(
                                int iNo             // Input
                           )
   {    
        int iDigit = 0;
        int iRet = 0;

        while(iNo != 0)                             // Business logic
        {
            iDigit = iNo % 10;
            iRet = ((iRet*10) + iDigit);
            iNo = iNo / 10;
        }
        
        while(iRet != 0)
        {
            iDigit = iRet % 10;
            System.out.print(iDigit+"  ");
            iRet = iRet / 10;
        }
   }

}// End of Logic class

class program19_4
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printDigits(1234);                   // Method call
    }
}// End of program19_4 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1234      Output : 1  2  3  4
//  Input : 56        Output : 5  6
//  Input : 7         Output : 7
//
/////////////////////////////////////////////////////////////////
