// Write a program to calculate the sum of first N natural number

class Logic
{
    public void calculateSum(int iNo)
    {
        int iCnt = 0;                           // loop counter
        int iSum = 0;                           // To store the result
        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            iSum = iSum + iCnt;                 // Business logic
        }

        System.out.println("Sum of first "+iNo+" is "+iSum);
    }

}// End of Logic class

class program16_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.calculateSum(10);                  // Method call
    }
}// End of program16_1 class