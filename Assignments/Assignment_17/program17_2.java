// Write a program to check wether a number is a palindrome or not

class Logic
{
    public void checkPalindrome(int iNo)
    {
        int iDigit = 0;
        int iValue = iNo;                       
        
        while(iNo != 0)              
        {
            iDigit = (iDigit*10) + (iNo % 10);      // Business logic
            iNo = iNo/10;
        }
        
        if(iDigit == iValue)
        {
            System.out.println(iValue+" is a palindrome");
        }
        else
        {
           System.out.println(iValue+" is not a palindrome"); 
        }
    }

}// End of Logic class

class program17_2
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.checkPalindrome(1001);                 // Method call
    }
}// End of program17_2 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1001      Output : 1001 is a palindrome
//  Input : 9876      Output : 9876 is not a palindrome
//  Input : 10405     Output : 10405 is not a palindrome
//
/////////////////////////////////////////////////////////////////
