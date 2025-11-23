/*
    iRow : 4
    iCol : 4

            1	2	3	4	
            1	*	*	4	
            1	*	*	4	
            1	2	3	4

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
            for(j = 1;j <= iCol; j++)
            {
                if(i == 1)
                {
                    System.out.printf(j+"\t");
                }
                else if(i == iRow)
                {
                    System.out.printf(j+"\t");
                }
                else if(j == 1)
                {
                    System.out.printf(1+"\t");
                }
                else if(j == iCol)
                {
                    System.out.printf(j+"\t");
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


class program30_5
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
}// End of program30_5 class