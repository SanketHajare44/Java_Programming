/*
    Write a recursive program which accepts string from user and count number of small character
    Input : HELLoWOrLD
    Output : 5
*/

class Recursion
{   
    int CountSmallCharacter(String str,int i)
    {
        if(i == str.length())
        {
            return 0;
        }

        int Count = 0;

        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
            Count = Count + 1;
        }

        return Count + CountSmallCharacter(str,i + 1);

        
    }
}

class program71_3
{
    public static void main(String A[])
    {
        String sValue = "HELLoWOrLD";
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.CountSmallCharacter(sValue,0);

        System.out.println(iRet);
    }
}