/*
    Write a recursive program which accepts number from user and returns its factorial
    Input : 5
    Output : 120
*/


import java.util.*;

class Recursion
{
    public int Factorial(int iNo)
    {
        if(iNo == 0)
        {
            return 1;
        }

        return iNo  * Factorial(iNo - 1);
    }
}

class program70_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.Factorial(iValue); 
        System.out.println(iRet);

        sobj.close();
    }
}