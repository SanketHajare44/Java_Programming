/*
    Write a recursive program which accepts number from user and return largest digit
    Iniput : 87983
    Output : 9

*/

class Recursion
{   
    int MaxDigit(int iNo)
    {
        if(iNo == 0)
        {
            return 0;
        }

        int iDigit = iNo % 10;

        int Maxnum = MaxDigit(iNo / 10);

        if(iDigit > Maxnum)                 // return (iDigit > Maxnum) ? iDigit : Maxnum;
        {
            return iDigit;
        }
        else
        {
            return Maxnum;
        }
    }
}

class program71_2
{
    public static void main(String A[])
    {
        int iValue = 87983;
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.MaxDigit(iValue);

        System.out.println(iRet);
    }
}