/*
    Accept character from user and check whether it is special symbol or not (!,@,#,$,%,^,&,*)
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
        
        char cValue = '\0';
        
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {   
            return false;

        }
        else if(ch >= '0' && ch <= '9')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}// End of Stirngx class

class program34_4
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

        bRet = strobj.ChkCapital(cValue);
        System.out.println(bRet);

        strobj = null;
        sobj.close();

    }
}// End of program34_4 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : Q         Output : false
//  Input : @         Output : true
//  Input : j         Output : false
//  Input : 4         Output : false
//
/////////////////////////////////////////////////////////////////

