/*
    write a program which accept matirx from user and return addition of diagonal elements.
*/

import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
    
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0, j = 0;

        System.out.println("Enter the elements of the matrix");

        for(i = 0; i < this.iRow; i++)
        {   
            System.out.println("Enter the element of the row : "+(int)i+1);

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    public void Dispaly()
    {
        int i = 0, j = 0;

        System.out.println("elements of matrix are");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int AdditionDiagonal()
    {
        int i = 0, j = 0;
        int Sum = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    Sum = Sum + Arr[i][j];
                }
            }
        }

        return Sum;
    }
}

class program72_1
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Dispaly();

        System.out.println("Addition of diagonal element is : "+mobj.AdditionDiagonal());
    }
}