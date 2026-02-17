/*
    Write a recursive program which display below pattern
    Output : a  b   c   d   e   f
*/

import java.util.*;

class Recusrion
{
    static char cValue = 'a';

    public void Display()
    {
        if(cValue == (char)('f'+1))
        {
            return;
        }

        System.out.print(cValue+"\t");

        cValue++;
        Display();        
        
    }

  
}

class program68_5
{
    public static void main(String A[])
    {
        Recusrion robj = new Recusrion();

        robj.Display();

        System.out.println();

    }
}