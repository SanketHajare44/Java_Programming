// Write a program to check whether a give year is leap year or not.

class Logic
{
    public void checkLeapYear(
                                int iNo             // Input
                             )
   {    
        if(iNo == 0)                                // Business logic
        {
            System.out.println("Invalid year.");
            return;
        }

        if((iNo % 4 == 0) && (iNo % 100 != 0) || (iNo % 400 == 0))
        {
            System.out.println(iNo+" is leap year.");
        }
        else
        {
            System.out.println(iNo+" is not leap year.");
        }
   }

}// End of Logic class

class program19_1
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkLeapYear(2024);                   // Method call
    }
}// End of program19_1 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2024      Output : 2024 is leap year.
//  Input : 1900      Output : 1900 is not leap year.
//  Input : 2000      Output : 2000 is leap year.
//  Input : 0         Output : Invalid year.
//
/////////////////////////////////////////////////////////////////
