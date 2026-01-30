/*
    Write java program to accept directory name from user and display all the files name from the directory
*/

import java.util.*;
import java.io.*;

class program56_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        FileOutputStream foobj = null;
        int iRet = 0;

        byte Buffer[] = new byte[100];

        System.out.println("Enter the name of Fie ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {   
            System.out.println("directory is present");
            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder are : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File Name : "+fArr[i].getName()+"   File Size : "+fArr[i].length()+" bytes");
            }

        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}