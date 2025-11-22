/*
    Accept number from user and Display

    Input : 5
    Output : A  B   C   D   E
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
        char ch = '\0';

        for(iCnt = 0, ch = 'A'; iCnt < iNo; iCnt++)
        {
            System.out.printf("%c\t",ch+iCnt);          // Business logic
        }
        System.out.println();
    }

}// End of pattern class

class program26_1
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

}// End of program26_1 class

///////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5       Output : A	B	C	D	E
//  Input : 7       Output : A	B	C	D	E	F	G
//  Input : 3       Output : A	B	C
//
///////////////////////////////////////////////////////////////////////////////