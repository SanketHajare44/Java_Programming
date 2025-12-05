/*
    Accept character from user and display its ASCII value in decimal,octal,and hexadecimal format
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    void AsciiTable(char ch)
    {
        int iNo = (int)ch;

        System.out.println("Decimal : " + iNo);
        System.out.println("Octal   : " + Integer.toOctalString(iNo));
        System.out.println("Hexadecimal     : " + Integer.toHexString(iNo).toUpperCase());
    }

}// End of Stirngx class

class program34_5
{
    public static void main(String A[])
    {   
        String sValue = "";
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        sValue = sobj.nextLine();

        cValue = sValue.charAt(0);

        StringX strobj = new StringX();

        strobj.AsciiTable(cValue);

        strobj = null;
        sobj.close(); 
    }
}// End of program34_5 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : B         Output : Decimal 66 
//                             Octal   102
//                             Hexadecimal  42
//
/////////////////////////////////////////////////////////////////

