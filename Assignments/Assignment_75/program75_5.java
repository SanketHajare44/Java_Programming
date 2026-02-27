import java.util.*;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Annual income (integer)");
        int Income = sobj.nextInt();

        float Payable_Amount = 0;

        if(Income < 250000)
        {
            Payable_Amount = 0;
        }
        else if(Income >= 250001 && Income <= 500000)
        {
            Payable_Amount = ((Income - 250000) * 0.05f);
        }
        else if(Income >= 500001 && Income <= 1000000)
        {
            Payable_Amount = ((250000 * 0.05f) + ((Income - 500000) * 0.2f));
        }
        else if(Income > 1000000)
        {
            Payable_Amount = (250000 * 0.05f) + (500000 * 0.2f) + ((Income - 1000000) * 0.3f);
        }

        System.out.println("Annual Income : "+Income);
        System.out.println("Total Tax Payable : "+Payable_Amount);

        sobj.close();
    }
}