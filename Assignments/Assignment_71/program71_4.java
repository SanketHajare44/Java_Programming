/*
    Write a recursive program which accepts number from user and return smalllest digit
    Input : 87983
    Output : 3

*/

class Recursion
{   
    int smallestDigit(int iNo)
    {
        if(iNo < 10)
        {
            return iNo;
        }

        int iDigit = iNo % 10;

        int Minnum = smallestDigit(iNo / 10);

        return (iDigit < Minnum) ? iDigit : Minnum;
    }
}

class program71_4
{
    public static void main(String A[])
    {
        int iValue = 87983;
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.smallestDigit(iValue);

        System.out.println(iRet);
    }
}