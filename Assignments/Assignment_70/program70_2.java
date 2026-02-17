/*
    Write a recursive program which accepts number from user and return summation of digits
    Input : 416312
    Output : 17
*/

import java.util.*;

class Recursion
{
    public int SumDigit(int iNo)
    {
        if(iNo == 0)
        {
            return 0;
        }

        return iNo % 10 + SumDigit(iNo/10);
    }
}

class program70_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.SumDigit(iValue);

        System.out.println("Sum of digit is : "+iRet);

        sobj.close();
    }
}