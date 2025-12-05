/*
    Accept character from user and. if it is capital then display all the character from 
    the input chearacters till Z. if input character is small then print all the characters
    in reverse order till a. In other casesreturn directly
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    void ChkCapital(char ch)
    {   
        
        char cValue = '\0';
        
        if((ch >= 'A' && ch <= 'Z'))
        {   
            for(cValue = ch; cValue <= 'Z'; cValue++)
            {
                System.out.printf("%c\t",cValue);
            }
            System.out.println();

        }
        else if((ch >= 'a' && ch <= 'z'))
        {   
            for(cValue = ch; cValue >= 'a'; cValue--)
            {
                System.out.printf("%c\t",cValue);
            }
            System.out.println();
        }
        else
        {
            System.out.println("Invalid input");
        }
    }

}// End of Stirngx class

class program34_3
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

        strobj.ChkCapital(cValue);

        strobj = null;
        sobj.close();

    }
}// End of program34_3 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//
//  Input : Q         Output : Q	R	S	T	U	V	W	X	Y	Z
//  Input : @         Output : 
//  Input : j         Output : j	i	h	g	f	e	d	c	b	a
//  Input : 4         Output : 
//
/////////////////////////////////////////////////////////////////

