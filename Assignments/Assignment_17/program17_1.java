// Write a program to find the sum of digit of number

class Logic
{
    public void sumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;                // To store the result                         
        
        while(iNo != 0)              // Business logic
        {
            iDigit = iNo%10;

            iSum = iSum + iDigit;

            iNo = iNo/10;
        }
        
        System.out.println("The sum of digit of number : "+iSum);
    }

}// End of Logic class

class program17_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.sumOfDigits(5123);                  // Method call
    }
}// End of program17_1 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5123      Output : 11
//  Input : 9876     Output : 30
//  Input : 10405    Output : 10
//
/////////////////////////////////////////////////////////////////
