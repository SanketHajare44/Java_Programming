// Write a program to print all even numbers up to N

class Logic
{
    public void printEvenNumbers(
                                    int iNo         // Input
                                )
   {
        int iCnt = 0;                               // Loop counter
                                       
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            if(iCnt%2 == 0)
            System.out.println(iCnt);
        }
   }

}// End of Logic class

class program18_2
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printEvenNumbers(13);                          // Method call
    }
}// End of program18_2 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 13     Output : 2 4 6 8 10 12
//  Input : 8      Output : 2 4 6 8
//  Input : 1      Output : 
//
/////////////////////////////////////////////////////////////////
