/*
    Write a recursive program which accepts string from user and count number of chracters
    Input : hello
    Output : 5
*/

import java.util.*;

class Recursion
{
    public int CountAalphabate(String str, int i)
    {
        if(i == str.length())
        {
            return 0;
        }

        return 1 + CountAalphabate(str,i+1);
    }
}

class program70_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sValue = sobj.nextLine();
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.CountAalphabate(sValue,0); 
        System.out.println(iRet);

        sobj.close();
    }
}