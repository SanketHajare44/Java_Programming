/*
    Write a program which  accept string from user and copy that characters of that string into another 
    String by removing all white spaces.
*/

import java.util.*;

class RemoveWhiteSpaces
{
    char[] rmWhiteSpace(String str)
    {   
        char Arr[] = new char[str.length()]; 
        int iCnt = 0;
        int jCnt = 0;

        for(iCnt = 0; iCnt <= str.length()-1; iCnt++)
        {
            if(str.charAt(iCnt) != ' ')
            {
                Arr[jCnt] = str.charAt(iCnt);
                jCnt++;
            }
        }

        return Arr;
    }
}

class program38_2
{
    public static void main(String A[])
    {
        String str = "";
        char Result[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        str = sobj.nextLine();

        RemoveWhiteSpaces obj = new RemoveWhiteSpaces();

        Result = obj.rmWhiteSpace(str);

        System.out.println(Result);
        
    }
}