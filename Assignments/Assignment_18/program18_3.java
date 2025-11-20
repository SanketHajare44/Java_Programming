// Write a program to print all odd numbers up to N

class Logic
{
    public void printOddNumbers(
                                    int iNo         // Input
                                )
   {
        int iCnt = 0;                               // Loop counter
                                       
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            if(iCnt%2 != 0)
            System.out.println(iCnt);
        }
   }

}// End of Logic class

class program18_3
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printOddNumbers(13);                   // Method call
    }
}// End of program18_3 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 13     Output : 1 3 5 7 9 11 13
//  Input : 8      Output : 1 3 5 7
//  Input : 1      Output : 1
//
/////////////////////////////////////////////////////////////////
