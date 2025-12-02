/*
    Accept Division of student from user and depends on the division display exam timing.
    There are 4 division in school as A,B,C,D. Exam of division A at 7AM , B at 8:30AM, C at 9:20AM,
    and D at 10.30 AM
    (Application should be case insensitive)
*/

///////////////////////////////////////////////////////////////////////////////
//
//  Required packages
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StringX
{   
    void DisplaySchedular(char ch)
    {
        if((ch >= 'a' && ch <= 'z'))
        {
            ch = (char)(ch - 32);
        }

        switch(ch)
        {
            case 'A' :
                System.out.println("Exam at 7 AM");
                break;
            case 'B' :
                System.out.println("Exam at 8:30 AM");
                break;
            case 'C' :
                System.out.println("Exam at 9:20 AM");
                break;
            case 'D' :
                System.out.println("Exam at 10:30 AM");
                break;
            default :
                System.out.println("Invalid input");
        } 
    }

}// End of StringX class

class program33_5
{
    public static void main(String A[])
    {   
        String sValue = "";
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Division : ");
        sValue = sobj.nextLine();

        cValue = sValue.charAt(0);

        StringX strobj = new StringX();

        strobj.DisplaySchedular(cValue);

        strobj = null;
        
        sobj.close();

    }
}// End of program33_5 class

/////////////////////////////////////////////////////////////////
//
//  Test cases succesfully handled by the application
//  
//  Input : a         Output : Exam at 7 AM
//  Input : A         Output : Exam at 7 AM
//  Input : u         Output : Invalid input
//
/////////////////////////////////////////////////////////////////

