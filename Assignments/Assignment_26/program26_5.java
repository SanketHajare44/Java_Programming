/*  
    Accept number from user and Display below pattern

    Input : 8
    Output : 2  4   6   8   10  12  14  16
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
            
            System.out.print((iCnt+iCnt)+"\t");          // Business logic
                       
        }
        System.out.println();
    }

}// End of pattern class

class program26_5
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

}// End of program26_5 class

///////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 8       Output : 2	4	6	8	10	12	14	16
//  Input : 3       Output : 2	4	6
//  Input : 7       Output : 2	4	6	8	10	12	14
//
///////////////////////////////////////////////////////////////////////////////