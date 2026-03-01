import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Marks percent : ");
        int Marks = sobj.nextInt();

        System.out.println("Attendence percent : ");
        int Attendence = sobj.nextInt();

        System.out.println("Family Income : ");
        int Income = sobj.nextInt();

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks is less than 80%");
            return;
        }

        if(Attendence < 75)
        {
            System.out.println("Scholarship Rejected : Attendence is less than 75%");
            return;
        }

        if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Family income is grater than 3000000");
            return;
        }

        System.out.println("Scholarship Approved");

        sobj.close();

    }
}