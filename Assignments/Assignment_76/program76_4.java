import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Budget : ");
        int budget = sobj.nextInt();

        System.out.print("Enter number of items : ");
        int N = sobj.nextInt();

        if(budget < 0 || N < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;
        int remaining = budget;

        for(int i = 1; i <= N; i++)
        {
            System.out.print("Enter price of item " + i + " : ");
            int price = sobj.nextInt();

            if(price <= 0)
            {
                System.out.println("Invalid price");
                return;
            }

            if(remaining >= price)
            {
                remaining = remaining - price;
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: " + remaining);

    }
}