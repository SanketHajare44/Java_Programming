// write a program to display all factors of a given number.

class Logic
{
    public void displayFactors(
                                int iNo            // Input
                              )  
   {
        int iCnt = 0;

        for(iCnt=1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }  
   
   }

}// End of Logic class

class program21_3
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.displayFactors(10);                  // Method call
    }
}// End of program21_3 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 1 2 5
//  Input : 15      Output : 1 3 5
//  Input : 28      Output : 1 2 4 7 14
//
/////////////////////////////////////////////////////////////////

