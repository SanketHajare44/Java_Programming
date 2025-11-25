// Write a program to find the sum of even and odd digits separately in a number.

class Logic
{
    public void printOddNumbers(
                                    int iNo         // Input
                                )
   {
        int iDigit = 0;
        int iEven = 0;
        int iOdd = 0;                             
                                       
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;

            if((iDigit % 2) == 0)                   // Business logic
            {
                iEven = iEven + iDigit;
            }
            else
            {
                iOdd = iOdd + iDigit;
            }
        }

        System.out.print(iEven+" ");
        System.out.print(iOdd);
   }

}// End of Logic class

class program18_4
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printOddNumbers(123456);               // Method call
    }
}// End of program18_4 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 123456      Output : 12 9
//  Input : 98765       Output : 14 21
//  Input : 246         Output : 12 0
//
/////////////////////////////////////////////////////////////////
