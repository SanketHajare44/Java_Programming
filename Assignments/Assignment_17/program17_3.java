// Write a program to find the maximum of two number

class Logic
{
    public void findMax(int iNo1, int iNo2)
    {
        if(iNo1>iNo2)                       // Business logic
        {
            System.out.println(iNo1+" is a Maximum");
        }
        else
        {
           System.out.println(iNo2+" is a Maximum"); 
        }
    }

}// End of Logic class

class program17_3
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.findMax(20, 15);               // Method call
    }
}// End of program17_3 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 25,15      Output : 25 is a Maximum
//  Input : 98,76      Output : 98 is a Maximum
//  Input : 10,405     Output : 405 is a Maximum
//
/////////////////////////////////////////////////////////////////
