/*  
    Accept number from user and Display below pattern

    Input : 5
    Output : 1  *   2   *   3   *   4   *   5   *
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");          // Business logic           
        }
        System.out.println();
    }

}// End of pattern class

class program26_3
{
    public static void main(String A[])
    {   
        int iValue = 0;                                 // To accept user input
        
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        pattern pobj = new pattern();                   // Method call

        pobj.Display(iValue);
        
    }

}// End of program26_3 class

///////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5       Output : 1	*	2	*	3	*	4	*	5	*
//  Input : 3       Output : 1	*	2	*	3	*
//  Input : 7       Output : 1	*	2	*	3	*	4	*	5	*	6	*	7	*
//
///////////////////////////////////////////////////////////////////////////////