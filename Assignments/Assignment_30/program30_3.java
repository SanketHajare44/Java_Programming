/*
    iRow : 4
    iCol : 4

            $	*	*	*	
            *	$	*	*	
            *	*	$	*	
            *	*	*	$
    
    Diagonal pattern

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
        if(iRow != iCol)
        {
           System.out.printf("Invalid input"); 
           System.out.printf("Row number and column number should be same");
           return; 
        }
        
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {                
            for(j = 1;j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.printf("$\t");
                }
                else
                {
                    System.out.printf("*\t");
                }
            }
            System.out.println();
        }
    }

}// End of pattern class


class program30_3
{
    public static void main(String A[])
    {   
        int iValue1 = 0, iValue2 = 0;           // To accept user input
        
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter the number of Columns : ");
        iValue2 = sobj.nextInt();

        pattern pobj = new pattern();

        pobj.Display(iValue1, iValue2);         // Method call
        
    }
}// End of program30_3 class