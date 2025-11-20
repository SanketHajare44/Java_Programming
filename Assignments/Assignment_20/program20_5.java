// write a program to find the smallest digit in a given number,

class Logic
{
    public void findSmallestDigit(
                                    int iNo             // Input
                                )
   {
        int iDgit = 0;
        int iSmallnum = 9;  

        while(iNo != 0)
        {
            iDgit = iNo%10;
            if(iDgit<iSmallnum)                         // Buisness logic
            {
                iSmallnum = iDgit;
            }
            iNo = iNo / 10;
        }

        System.out.println("small number is : "+iSmallnum);
         
   }

}// End of Logic class

class program20_5
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.findSmallestDigit(80342);                  // Method call
    }
}// End of program20_5 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 80342     Output : small number is : 0
//  Input : 569       Output : small number is : 5
//  Input : 123456    Output : small number is : 1
//
/////////////////////////////////////////////////////////////////