import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Battery percentage : ");
        int Battery_percent = sobj.nextInt();

        String  status = null;

        if(Battery_percent < 0 || Battery_percent > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Battery_percent <= 5)
        {
            status = "Critical";
        }
        else if(Battery_percent <= 15)
        {
            status = "Low";
        }
        else
        {
            status = "Normal";
        }

        System.out.println("Battery percentage : "+Battery_percent+"%");
        System.out.println("Status : "+status);

    }
}