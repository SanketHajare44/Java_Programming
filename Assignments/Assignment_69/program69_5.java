/*
    Write a recursive program which display below pattern
    Input : 6
    a   b   c   d   e   f
*/

import java.util.*;

class Recursion
{
    static char cValue = 'a';

    public void Display(int iNo)
    {
        if(iNo == 0)
        {
            return;
        }

        System.out.print(cValue+"\t");
        cValue++;
        Display(iNo - 1);  
    }
}

class program69_5
{
    public static void main(String A[])
    {
        Scanner  sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Recursion robj = new Recursion();

        robj.Display(iValue);
        System.out.println();
    }
}