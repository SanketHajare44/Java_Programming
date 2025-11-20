// write a program to check whether a number is a perfect number or not

class Logic
{
    public void checkPerfect(
                                int iNo                 // Input
                            )
   {    
        int iCnt = 0;
        int iFactSum = 0;
        
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)             
        {
            if((iNo%iCnt) == 0)                         // Buisness logic
            {
                iFactSum = iFactSum + iCnt;
            }   
        }
        
        if(iFactSum == iNo)
        {
            System.out.println(iNo +" is a perfect number");
        }
        else
        {
            System.out.println(iNo +" is not a perfect number");
        }  
   }

}// End of Logic class

class program20_3
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkPerfect(6);                     // Method call
    }
}// End of program20_3 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6       Output : 6 is a perfect number
//  Input : 28      Output : 28 is a perfect number
//  Input : 12      Output : 12 is not a perfect number
//
/////////////////////////////////////////////////////////////////