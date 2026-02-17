/*
    Write a recursive program which display below pattern
    Input : 5
    5   4   3   2   1
*/

import java.util.*;

class Recursion
{
    public void Display(int iNo)
    {
        if(iNo == 0)
        {
            return;
        }

        System.out.print(iNo+"\t");

        Display(iNo - 1);  
    }
}

class program69_3
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