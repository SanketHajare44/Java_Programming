/*
    Write a recursive program which display below pattern
    Input : 5
    Output : 1   2   3   4   5
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

        Display(iNo - 1);
        System.out.print(iNo+"\t");
    }
}

class program68_2
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