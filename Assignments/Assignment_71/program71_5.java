/*
    Write a recursive program which accepts number from user and return its reverse number.
    Input : 523
    Output : 325
*/

// class Recursion
// {   
//     void ReverseNum(int iNo)
//     {
//         if(iNo == 0)
//         {
//             return;
//         }   

//         System.out.print(iNo % 10);

//         ReverseNum(iNo / 10);
//     }
// }

class Recursion
{   
    int ReverseNum(int iNo, int RevNum)
    {
        if(iNo == 0)
        {
            return RevNum;
        }  

        return ReverseNum(iNo / 10, (RevNum *10 + (iNo % 10)));
    }
}

class program71_5
{
    public static void main(String A[])
    {
        int iValue = 87983;
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.ReverseNum(iValue,0);

        System.out.println(iRet);
    }
}