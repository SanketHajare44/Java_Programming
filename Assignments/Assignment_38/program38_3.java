/*
   Write a program which accept string from user and copy that characters of that string into another string
   by converting all small characters into capital case 
*/


import java.util.*;

class LwtoUp
{
    String LowerToUpperCase(String str)
    {   
        char Arr[] = new char[str.length()]; 
        String Result = "";
        int iCnt = 0;
        int jCnt = 0;

        for(iCnt = 0; iCnt <= str.length()-1; iCnt++,jCnt++)
        {
            if(str.charAt(iCnt) >= 'a' && str.charAt(iCnt) <= 'z')
            {
                Arr[jCnt] = (char)(str.charAt(iCnt) - 32); 
            }
            else
            {
                Arr[jCnt] = str.charAt(iCnt);
            }
        }

        Result = new String(Arr);
        
        return Result;
    }
}

class program38_3
{
    public static void main(String A[])
    {
        String str = "";
        String Result = "";

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        str = sobj.nextLine();

        LwtoUp obj = new LwtoUp();

        Result = obj.LowerToUpperCase(str);

        System.out.println(Result);
        
    }
}