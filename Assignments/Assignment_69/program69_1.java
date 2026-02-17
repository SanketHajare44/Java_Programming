/*
    Write a recursive program which display below pattern
    Input : 5
    *   *   *   *   *
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

        System.out.print("*\t");
        Display(iNo - 1);
    }
}

class program69_1
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