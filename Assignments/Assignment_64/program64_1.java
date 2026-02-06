// Write a program which checks whether 15th bit is ON or OFF

import java.util.*;

class program64_1
{
    public static void main(String A[])
    {
        int No = 0;
        int iMask = 0x00004000;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        iResult = No & iMask;

        if(iResult == iMask)
        {
            System.out.println("15th Bit is ON");
        }
        else
        {
            System.out.println("15th Bit is OFF");
        }
    }
}

// 0000 | 0000 | 0000 | 0000 | 0100 | 0000 | 0000 | 0000 
//  0      0      0      0      4      0      0      0
// Hexa -> 0x00004000