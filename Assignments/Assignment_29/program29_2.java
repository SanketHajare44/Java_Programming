/*  
    Accept number from user and Display below pattern

    Input1 : 4      Input2 : 5

    Output :    2   4   6   8   10
                1   3   5   7   9
                2   4   6   8   10
                1   3   5   7   9
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
        int iNo = 0;

        for(i = 1; i <= iRow; i++)
        {   
            if((i%2) == 1)
            {
                iNo = 2;
            }
            else
            {
                iNo = 1;
            }

            for(j = 1; j <= iCol; j++)
            {
                    System.out.print(iNo+"\t");
                    iNo = iNo+2;
            }
            System.out.println();                      
        }
    }

}// End of pattern class

class program29_2
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

}// End of program29_2 class