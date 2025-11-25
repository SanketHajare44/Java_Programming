/*
    iRow : 4
    iCol : 4

            *	         	
            *	*		
            *	*	*		
            *	*	*	* 
    
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
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("Row number and column number should be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
                
        {
            for(j = 1;i >= j; j++)
            {
                    System.out.print("*\t");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}// End of pattern class

class program31_1
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
}// End of program31_1 class
