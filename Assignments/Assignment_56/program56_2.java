/*
    Write java program to accept file name from user and open that file and display the contents on screen.
*/

import java.util.*;
import java.io.*;

class program56_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        FileInputStream fiobj = null;
        int iRet = 0;

        byte Buffer[] = new byte[100];

        System.out.println("Enter the name of Fie ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {   
            String str = null;

            fiobj = new FileInputStream(FileName);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,0,iRet);
                System.out.print(str);
                str = null;
            }

            System.out.println();

        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}