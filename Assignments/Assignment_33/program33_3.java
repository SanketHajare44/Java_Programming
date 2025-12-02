/*
    Accept character from user and check whether it is digit or not (0-9)
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    boolean ChkDigit(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            return false;
        }
        else if (ch >= 48 && ch <= 57)
        {
            return true;
        }
        else
        {
            System.out.println("Invalid input");
            return false;
        }
    }

}// End of Stirngx class

class program33_3
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

        bRet = strobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }

        strobj = null;
        sobj.close();

    }
}// End of program33_3 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : H         Output : It is not a Digit
//  Input : @         Output : It is not a Digit
//  Input : 5         Output : It is Digit
//
/////////////////////////////////////////////////////////////////

