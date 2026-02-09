/*
    Accept character from user and check whether it is small case or not (a-z)
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    boolean ChkSmall(char ch)
    {
        if((ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else((ch >= 'A' && ch <= 'Z'))
        {
            return false;
        }
    }

}// End of Stirngx class

class program33_4
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

        bRet = strobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is small case character");
        }
        else
        {
            System.out.println("It is not a small case character");
        }

        strobj = null;
        sobj.close();

    }
}// End of program33_4 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//  
//  Input : a         Output : It is small case character
//  Input : H         Output : It is not a small case character
//
/////////////////////////////////////////////////////////////////

