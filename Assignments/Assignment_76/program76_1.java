import java.util.*;

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float Amount = 0;

        System.out.println("Disatance in KM (Integer)");
        int Distance = sobj.nextInt();

        System.out.println("Peak hour (Yes/No)");
        sobj.nextLine();
        String Peak_hour = sobj.nextLine();

        if(Distance < 0)
        {
            System.out.println("Distance cannot be negative");
            return;
        }

        if(Distance <= 10)
        {
            Amount = 50 + (Distance*12);
        }
        else if(Distance > 10)
        {
            Amount = 50 + (10 * 12) + ((Distance - 10)*15);
        }

        if(Peak_hour.equalsIgnoreCase("Yes") == true)
        {
            Amount = Amount + (Amount * 0.2f);
        }

        System.out.println("Distance : "+Distance);
        System.out.println("Peak hour"+Peak_hour);
        System.out.println("Total Fare : "+Amount);

        sobj.close();

    }
}