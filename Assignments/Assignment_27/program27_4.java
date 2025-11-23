/*  
    Accept number from user and Display below pattern

    Input1 : 4      Input2 : 4

    Output :    *   #   *   #
                *   #   *   #
                *   #   *   #
                *   #   *   #
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j<= iCol; j++)
            {
                if((j%2) == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                   System.out.print("*\t"); 
                }
            }
            System.out.println();                      
        }
    }

}// End of pattern class

class program27_4
{
    public static void main(String A[])
    {   
        int iValue1 = 0;                                 // To accept user input1
        int iValue2 = 0;                                 // To accept user input2
        
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number Rows: ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter the number Columns: ");
        iValue2 = sobj.nextInt();

        pattern pobj = new pattern();                   // Method call

        pobj.Display(iValue1, iValue2);
        
    }

}// End of program27_4 class