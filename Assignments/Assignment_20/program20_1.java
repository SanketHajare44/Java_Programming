// write a program to find the sum of all even numbers up to N

class Logic
{
    public void sumEvennumbers(
                                int iNo                 // Input
                              )
   {    
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)             
        {
            if(iCnt%2 == 0)
            {
                iSum = iSum + iCnt;                     // Business logic
            }
        }

        System.out.println(iSum);
   }

}// End of Logic class

class program20_1
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.sumEvennumbers(10);                     // Method call
    }
}// End of program20_1 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 30
//  Input : 5       Output : 6
//  Input : 20      Output : 110
//
/////////////////////////////////////////////////////////////////
