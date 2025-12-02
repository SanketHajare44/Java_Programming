/*
    Accept character from user and check whether it is Capital or not (A-Z)
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    boolean ChkCapital(char ch)
    {
        if((ch >= 'A' && ch <= 'Z'))
        {
            return true;
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            return false;
        }
        else
        {
            System.out.println("It is not a character");
            return false;
        }

    }

}// End of Stirngx class

class program33_2
{
    public static void main(String A[])
    {   
        String sValue = "";
        boolean bRet = false;
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        sValue = sobj.nextLine();

        cValue = sValue.charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is capital character");
        }
        else
        {
            System.out.println("It is not a Capital character");
        }

        strobj.close();
        sobj.close();

    }
}// End of program33_2 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : H         Output : It is capital character
//  Input : @         Output : It is not a character
//  Input : a         Output : It is not a captial character
//
/////////////////////////////////////////////////////////////////

