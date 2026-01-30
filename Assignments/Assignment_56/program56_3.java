/*
    Write java program to accept file name from user and open that file in write mode and write some data at the end of file 
*/

import java.util.*;
import java.io.*;

class program56_3
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

        if(fobj.exists())
        {   
            foobj = new FileOutputStream(fobj, true);   // Append mode

            String str = "Jay Ganesh";

            byte Arr[] = str.getBytes();

            foobj.write(Arr);

            System.out.println("Write the the data succesfully");

            foobj.close();

        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}