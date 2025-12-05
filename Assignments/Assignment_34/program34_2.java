/*
    Accept character from user and. if Character is small  display its corresponding
    capital character and if it small then display its corresponding capital .In other
     cases diaplay as it is
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    void Display(char ch)
    {   
        
        char cValue = '\0';
        
        if((ch >= 'A' && ch <= 'Z'))
        {   
            cValue = (char)(ch+32);
            System.out.println(cValue);
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            cValue = (char)(ch-32);
            System.out.println(cValue);
        }
        else
        {
            System.out.println(ch);
        }

    }

}// End of Stirngx class

class program34_2
{
    public static void main(String A[])
    {   
        String sValue = "";
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        sValue = sobj.nextLine();

        cValue = sValue.charAt(0);

        StringX strobj = new StringX();

        strobj.Display(cValue);

        strobj = null;
        sobj.close();

    }
}// End of program34_2 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : H         Output : h
//  Input : @         Output : @
//  Input : a         Output : A
//  Input : 4         Output : 4
//
/////////////////////////////////////////////////////////////////

