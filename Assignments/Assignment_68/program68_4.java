/*
    Write a recursive program which display below pattern
    Input : 6
    Output : A   B   C   D   E   F
*/

import java.util.*;

class Recusrion
{
    static char cValue = 'A';

    public void Display(int iNo)
    {   
        if(iNo == 0)
        {
            return;
        }

        System.out.print(cValue+"\t");
        cValue = (char)(cValue + 1);
        Display(iNo -1);
    }
}

class program68_4
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