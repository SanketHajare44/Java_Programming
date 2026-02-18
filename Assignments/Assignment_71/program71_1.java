/*
    Write a recursive program which accepts string from user and count white spaces
    Input : HE LLo WOr LD
    Output : 3
*/

class Recursion
{   
    int CountWhiteSpaces(String str,int i)
    {
        if(i == str.length())
        {
            return 0;
        }

        int Count = 0;

        if(str.charAt(i) == ' ')
        {
            Count = 1;
        }

        return Count + CountWhiteSpaces(str, i + 1);                                                                      
    }

}

class program71_1
{
    public static void main(String A[])
    {
        String cValue = "HE LLo WOr LD";
        int iRet = 0;

        Recursion robj = new Recursion();

        iRet = robj.CountWhiteSpaces(cValue,0);

        System.out.println(iRet);
    }
}