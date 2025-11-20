// write a program to calculate the product of digit of a number.

class Logic
{
    public void productofDigits(
                                    int iNo             // Input
                               )
   {
        int iDgit = 0;
        int imuiti = 1;  

        while(iNo != 0)
        {
            iDgit = iNo%10;
            imuiti = imuiti * iDgit;                     // business logic
            iNo = iNo / 10;
        }

        System.out.println("product of digit is : "+imuiti);     
   }

}// End of Logic class

class program21_1
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.productofDigits(234);                  // Method call
    }
}// End of program21_1 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 234      Output : product of digit is : 24
//  Input : 56       Output : product of digit is : 30
//  Input : 101      Output : product of digit is : 0
//
/////////////////////////////////////////////////////////////////
