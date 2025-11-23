/*  
    Accept number from user and Display below pattern

    Input1 : 3      Input2 : 5

    Output :    A   A   A   A   A
                B   B   B   B   B
                C   C   C   C   C
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
        char ch = '\0';

        for(i = 1, ch = 'A'; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                
                System.out.print(ch+"\t");

            }
            System.out.println();                      
        }
    }

}// End of pattern class

class program28_3
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

}// End of program28_3 class