// Write a program which checks whether first and last bit is ON or OFF. First bit means bit number 1 and last bit means bit number 32

import java.util.*;

class program64_5
{
    public static void main(String A[])
    {
        int No = 0;
        int iMask = 0x00000001;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        // 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0001 
        // OR
        // 1000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0000
        //----------------------------------------------------------
        // 1000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0000 | 0001       <- iMask

        iMask = iMask << 0 | iMask << (28-1);

        iResult = No & iMask;

        if(iResult == iMask)
        {
            System.out.println("First and last bit is ON");
        }
        else
        {
            System.out.println("Last and last bit is OFF");
        }
    }
}