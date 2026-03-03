import java.util.*;

class program73_2
{
    public static void main(String A[])
    {
        int Arr[][] = new int[4][4];
        int temp = 0;
        int Start = 0;
        int End = 0;

        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {   
            System.out.println("Enter : "+(i+1)+" Row");
            for(int j =0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Originl matrix: \n");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j =0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

        // Logic for Row reversed matrix 
        for(int i = 0; i < Arr.length; i++)
        {
            Start = 0;
            End = Arr.length - 1;

            while(Start < End)
            {
                temp = Arr[i][Start];
                Arr[i][Start] = Arr[i][End];
                Arr[i][End] = temp;

                Start++;
                End--;
            }
        }

        System.out.println("Row Reversed matrix : \n");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j =0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}