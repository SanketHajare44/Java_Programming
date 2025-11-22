/*  
    Accept number from user and Display below pattern

    Input : 5
    Output : 5  #   4   #   3   #   2   #   1   #
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

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t");          // Business logic
            System.out.print("#\t");           
        }
        System.out.println();
    }

}// End of pattern class

class program26_2
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

}// End of program26_2 class

///////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5       Output : 5	#	4	#	3	#	2	#	1	#
//  Input : 3       Output : 3	#	2	#	1	#
//  Input : 6       Output : 6	#	5	#	4	#	3	#	2	#	1	#
//
///////////////////////////////////////////////////////////////////////////////