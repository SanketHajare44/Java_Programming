/*
    Write a program which accept string from user and copy that characters of 
    that string into another string in reverse order
*/

import java.util.*;

class ReverseCopy
{
    char[] reverse(String str)
    {   
        char Arr[] = new char[str.length()]; 
        int iCnt = 0;
        int jCnt = 0;

        for(iCnt = str.length()-1; iCnt >= 0; iCnt--)
        {
            Arr[jCnt] = str.charAt(iCnt);
            jCnt++;
        }

        return Arr;
    }
}

class program38_1
{
    public static void main(String A[])
    {
        String str = "";
        char Result[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        str = sobj.nextLine();

        ReverseCopy obj = new ReverseCopy();

        Result = obj.reverse(str);

        System.out.println(Result);
        
    }
}