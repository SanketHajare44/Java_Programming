// write a program to print numbers from N down to 1 in reverse order

class Logic
{
    public void printReverse(
                                int iNo                 // Input
                              )
   {    
        int iCnt = 0;
        
        for(iCnt = iNo; iCnt >= 1; iCnt--)             
        {
            System.out.print("  "+iCnt);   
        }
        System.out.println("");

        
   }

}// End of Logic class

class program20_2
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.printReverse(10);                     // Method call
    }
}// End of program20_2 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 10 9 8 7 6 5 4 3 2 1
//  Input : 5       Output : 5 4 3 2 1
//  Input : 1       Output : 1
//
/////////////////////////////////////////////////////////////////