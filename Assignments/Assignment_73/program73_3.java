import java.util.*;

class program73_3
{
    public static void main(String A[])
    {
        int Arr[][] = new int[4][4];
        int i = 0;
        int j = 0;
        int temp = 0;

        Scanner sobj = new Scanner(System.in);

        for(i = 0; i < Arr.length; i++)
        {   
            System.out.println("Enter : "+(i+1)+" Row");
            for(j =0; j < Arr.length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Originl matrix: \n");

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
             

        // Logic for reverse the column
        int Start = 0;
        int End = Arr.length - 1;

        for(i = 0; i < Arr.length; i++)
        {   
            Start = 0;
            End = Arr.length - 1;
         
            while(Start < End)
            {
                temp = Arr[Start][i];
                Arr[Start][i] = Arr[End][i];
                Arr[End][i] = temp;

                Start++;
                End--;
            }
            
        }

        System.out.println("Column Reversed matrix: \n");

        for(i = 0; i < Arr.length; i++)
        {
            for(j =0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}