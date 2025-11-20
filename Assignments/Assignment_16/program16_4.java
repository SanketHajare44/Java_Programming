// Write a program to reverse a number

class Logic
{
    public void reverseNumber(int iNo)
    {
        int iDigit = 0;                         
        
        while(iNo != 0)              // Business logic
        {
            iDigit = iNo%10;

            System.out.print(iDigit);

            iNo = iNo/10;
        }
        System.out.println("");
    }

}// End of Logic class

class program16_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.reverseNumber(5123);                  // Method call
    }
}// End of program16_4 class