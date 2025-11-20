// Write a program to count the number of digits in given number

class Logic
{
    public void countDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;                        
        
        while(iNo != 0)                 // Business logic
        {
            iDigit = iNo%10;

            iCount++;

            iNo = iNo/10;
        }

        System.out.println("The count of digits is : "+iCount);
    }

}// End of Logic class

class program16_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.countDigits(5123);         // Method call
    }
}// End of program16_5 class