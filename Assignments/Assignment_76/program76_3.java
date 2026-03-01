import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Parcel weight in kg");
        int Weight = sobj.nextInt();

        int Amount = 0;

        if(Weight < 0)
        {
            System.out.println("Weight must be non negative");
            return;
        }

        if(Weight <= 1)
        {
            Amount = 50;
        }
        else if(Weight <= 5)
        {
            Amount = 50 + ((Weight - 1)*20);
        }
        else if(Weight > 5)
        {
            Amount = 150 + ((Weight - 4)*30);
        }

        System.out.println("Parcel Weight : "+(Weight));
        System.out.println("Courier charge : "+Amount);
        
        sobj.close();

    }
}