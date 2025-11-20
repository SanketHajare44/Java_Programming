// write a program to find the largest digit in a given number,

class Logic
{
    public void findLargestDigit(
                                int iNo                 // Input
                                )
   {
        int iDgit = 0;
        int iLargenum = 0;  

        while(iNo != 0)
        {
            iDgit = iNo%10;
            if(iDgit>iLargenum)                         // Buisness logic
            {
                iLargenum = iDgit;
            }
            iNo = iNo / 10;
        }

        System.out.println("large number is : "+iLargenum);
         
   }

}// End of Logic class

class program20_4
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.findLargestDigit(8342);                     // Method call
    }
}// End of program20_4 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 8342     Output : large number is : 8
//  Input : 569      Output : large number is : 9
//  Input : 123456   Output : large number is : 6
//
/////////////////////////////////////////////////////////////////

