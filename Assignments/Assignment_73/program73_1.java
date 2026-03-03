import java.util.*;

class program73_1
{
    public static void main(String A[])
    {
        int Arr[][] = new int[4][4];
        int temp = 0;

        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {   
            System.out.println("Enter : "+(i+1)+"Row");
            for(int j =0; j < 4; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j =0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j =0; j < Arr.length; j++)
            {
                if(i>j)
                {
                    temp = Arr[i][j];
                    Arr[i][j] = Arr[j][i];
                    Arr[j][i] = temp; 
                }
            }
            
        }

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j =0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println(Arr.length);
    }
}