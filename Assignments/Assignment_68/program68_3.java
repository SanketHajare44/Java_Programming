/*
    Write a recursive program which display below pattern
    Input : 5
    Output : 5   4   3   2   1
*/

import java.util.*;

class Recusrion
{
    public void Display(int iNo)
    {
        if(iNo == 0)
        {
            return;
        }

        System.out.print(iNo+"\t");
        Display(iNo -1);
    }
}

class program68_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Recusrion robj = new Recusrion();

        robj.Display(iValue);

        System.out.println();

        sobj.close();

    }
}