/*
    Accept character from user and check whether it is alphabet or not (A-Z a-z)
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    boolean ChkAlpha(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

}// End of Stirngx class

class program33_1
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

        bRet = strobj.ChkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is character");
        }
        else
        {
            System.out.println("It is not a character");
        }

        StringX = null;
        sobj.close();

    }
}// End of program33_1 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : H         Output : It is character
//  Input : @         Output : It is not a character
//
/////////////////////////////////////////////////////////////////

