// Write a program to find the factorial of a number using a for loop

class Logic
{
    public void findFactorial(int iNo)
    {
        int iCnt = 0;                           // loop counter
        int iFact = 0;                          // To store the result
        iFact = 1;
        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            iFact = iFact * iCnt;               // Business logic
        }

        System.out.println("Factorial of "+iNo+" is : "+iFact);
    }

}// End of Logic class

class program16_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findFactorial(5);                  // Method call
    }
}// End of program16_3 class