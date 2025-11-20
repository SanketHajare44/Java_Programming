// Write a program to find the minimum of three numbers.

class Logic
{
    public void findMax(
                            int iNo1,                       // Input1
                            int iNo2,                       // Input2
                            int iNo3                        // Input3
                        )
    {
        if((iNo1<iNo2) && (iNo1<iNo3))                      // Business logic
        {
            System.out.println(iNo1+" is a minimum");
        }
        else if((iNo2<iNo1) && (iNo2<iNo3))                 // Business logic
        {
            System.out.println(iNo2+" is a minimum");
        }
        else
        {
           System.out.println(iNo3+" is a minimum"); 
        }
    }

}// End of Logic class

class program17_4
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.findMax(20, 15, 16);                           // Method call
    }
}// End of program17_4 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 20 15 16     Output : 15 is a minimum
//  Input : 5 12 9       Output : 5 is a minimum
//  Input : 30 30 45     Output : 30 is a minimum
//
/////////////////////////////////////////////////////////////////

