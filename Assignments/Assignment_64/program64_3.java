// Write a program which checks whether 7th bit 15th bit 21th bit 28th bit 18th bit is ON or OFF

import java.util.*;

class program64_3
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
        // 0000 | 0000 | 0000 | 0000 | 0100 | 0000 | 0000 | 0000 
        // OR
        // 0000 | 0000 | 0001 | 0000 | 0000 | 0000 | 0000 | 0000 
        // OR
        // 0000 | 1000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0000 
        // OR
        // 0000 | 0000 | 0000 | 0010 | 0000 | 0000 | 0000 | 0000
        //----------------------------------------------------------
        // 0000 | 1000 | 0001 | 0010 | 0100 | 0000 | 0001 | 0000       <- iMask

        iMask = iMask << (7-1) | iMask << (15-1) | iMask << (21-1) |  iMask << (28-1) |  iMask << (18-1);

        iResult = No & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th, 15th, 18th, 21st, 28th bits are ON");
        }
        else
        {
            System.out.println("7th, 15th, 18th, 21st, 28th bits are OFF");

        }
    }
}