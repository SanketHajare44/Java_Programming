/*
    Write a java program to accept file name from user and open that file.
*/

import java.util.*;
import java.io.*;

class program56_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        FileInputStream fiobj = null;

        System.out.println("Enter the File Name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {   
            fiobj = new FileInputStream(FileName);
            System.out.println("File is opened for reading...");
            fiobj.close();
        }
        else
        {
            System.out.println("There is no such file ");
        }

        sobj.close();
    }
}