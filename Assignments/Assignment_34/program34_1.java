/*
    Write a program which displays ASCII table , Table conatains symbol, decimal, 
    hexadecimal and octal representation of every member from 0 to 255.
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    void AsciiTable()
    {
        int iCnt = 0;
        char ch1 = '\0';

        for(iCnt = 0; iCnt <= 255; iCnt++)
        {
            if(iCnt>=32 && iCnt<=126)
            {
                ch1 = (char)iCnt;
            }
            else
            {
                ch1 = '.';
            }

            System.out.printf("%s %3s %3s %3s\n",ch1 , iCnt, Integer.toHexString(iCnt), Integer.toOctalString(iCnt));

        }

    }

}// End of Stirngx class

class program34_1
{
    public static void main(String A[])
    {   
        StringX strobj = new StringX();

        strobj.AsciiTable();

        strobj = null; 
    }
}// End of program34_1 class

