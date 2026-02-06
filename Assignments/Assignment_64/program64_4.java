// Write a program which checks whether 7th and 8th and 9th bit is ON or OFF

import java.util.*;

class program64_4
{
    public static void main(String A[])
    {
        int No = 0;
        int iMask = 0x00000001;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        // 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0100 | 0000 
        // OR
        // 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 1000 | 0000 
        // OR
        // 0000 | 0000 | 0000 | 0000 | 0000 | 0001 | 0000 | 0000
        //----------------------------------------------------------
        // 0000 | 0000 | 0000 | 0000 | 0000 | 0001 | 1100 | 0000       <- iMask

        iMask = iMask << (7-1) | iMask << (8-1) | iMask << (9-1);

        iResult = No & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th and 8th and 9th bit is ON");
        }
        else
        {
            System.out.println("7th and 8th and 9th bit is OFF");
        }
    }
}