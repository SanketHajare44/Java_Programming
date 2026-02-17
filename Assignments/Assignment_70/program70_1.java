/*
    Write a recursive program which accepts number from user and display the below pattern
    Input : 5
    1   *   2   *   3   *   4   *   5   *
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

        Display(iNo -1);
        System.out.print(iNo+"\t*\t");
    }
}

class program70_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Recursion robj = new Recursion();

        robj.Display(iValue);
        System.out.println();

        sobj.close();
    }
}