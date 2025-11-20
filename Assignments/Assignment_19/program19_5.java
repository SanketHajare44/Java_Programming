// write a program to calculate power of a number using loop

class Logic
{
    public void calculatePower(
                                int iBase,          // Input1
                                int iExp            // Input2
                              )
   {    
        int iCnt = 0;
        int iPower = 0;
        iPower = 1;
        
        for(iCnt = 1; iCnt <= iExp; iCnt++)             // Business logic
        {
            iPower = iPower * iBase;
        }

        System.out.println(iPower);
   }

}// End of Logic class

class program19_5
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.calculatePower(2, 5);                     // Method call
    }
}// End of program19_5 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2, 5       Output : 32
//  Input : 3, 3       Output : 27
//  Input : 5, 0       Output : 1
//
/////////////////////////////////////////////////////////////////
