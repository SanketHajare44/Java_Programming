import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Current Stock : ");
        int Current_Stock = sobj.nextInt();

        System.out.println("Requested Quantity : ");
        int Requested_Quantity = sobj.nextInt();

        if(Current_Stock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(Requested_Quantity < 1)
        {
            System.out.println("Requested Quntity must be > 0");
            return;
        }

        if(Requested_Quantity > Current_Stock)
        {
            System.out.println("Order Failed : Insufficient Stock");
            return;
        }

        System.out.println("Order Processed Succesfully");
        int Remaining_Stock = Current_Stock - Requested_Quantity;
        System.out.println("Remaining stock : "+Remaining_Stock);
        
        if(Remaining_Stock < 5)
        {
            System.out.println("Low stock Alert!");
        }

        sobj.close();
    }
}