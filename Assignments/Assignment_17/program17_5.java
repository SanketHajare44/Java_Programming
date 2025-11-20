// Write a program to print the multiplication table of aa number.

class Logic
{
    public void printTable(
                            int iNo                 // Input
                          )
   {
        int iCnt = 0;                               // Loop counter
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo*iCnt);
        }
   }

}// End of Logic class

class program17_5
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printTable(5);                          // Method call
    }
}// End of program17_5 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5      Output : 5 10 15 20 25 30 35 40 45 50
//  Input : 7      Output : 7 14 21 28 35 42 49 56 63 70
//  Input : 12     Output : 12 24 36 48 60 72 84 96 108 120
//
/////////////////////////////////////////////////////////////////

