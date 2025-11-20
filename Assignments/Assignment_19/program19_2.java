// Write a program to display the grade of a student based on marks

class Logic
{
    public void displayGrade(
                                int iNo             // Input
                             )
   {    
        if(iNo <= 30)                               // Business logic
        {
            System.out.println("Grade : C");
        }

        else if(iNo >= 31 && iNo <= 60)
        {
            System.out.println("Grade : B");
        }
        else
        {
            System.out.println("Grade : A");
        }
   }

}// End of Logic class

class program19_2
{
    public static void main(String A[])
    {   
        Logic lobj = new Logic();

        lobj.displayGrade(100);                   // Method call
    }
}// End of program19_2 class

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 25       Output : Grade : C
//  Input : 50       Output : Grade : B
//  Input : 100      Output : Grade : A
//
/////////////////////////////////////////////////////////////////

