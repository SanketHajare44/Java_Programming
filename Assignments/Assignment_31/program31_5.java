/*
    iRow : 4
    iCol : 4

            1	2	3	4	
                2	3   4	
                    3	4	
                    	4

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
        int i = 0, j = 0, k = 0;

        for (i = 1; i <= iRow; i++) 
        {

            for (k = 1; k <= i; k++)
            {
                System.out.print("\t");
            }

            for (j = i; j <= iCol; j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
}
    

}// End of pattern class

class program31_5
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
}// End of program31_5 class