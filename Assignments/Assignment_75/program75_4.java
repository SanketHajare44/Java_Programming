import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Helmet worns (Yes/No)");
        String Helmet_Worns = sobj.nextLine();

        System.out.println("license Available (Yes/No)");
        String License = sobj.nextLine();

        System.out.println("Overspeeding (Yes/No)");
        String Overspeeding = sobj.nextLine();

        if((Helmet_Worns.equalsIgnoreCase("Yes") == false && Helmet_Worns.equalsIgnoreCase("No") == false) || 
            (License.equalsIgnoreCase("Yes") == false && License.equalsIgnoreCase("No") == false)|| 
            (Overspeeding.equalsIgnoreCase("Yes") == false && Overspeeding.equalsIgnoreCase("No") == false)
            )
        {
            System.out.println("Input invalid");
            return;
        }

        int Amount = 0;

        if(Helmet_Worns.equalsIgnoreCase("No") == true)
        {
            Amount = 500;
        }

        if(License.equalsIgnoreCase("No") == true)
        {
            Amount = Amount + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("Yes") == true)
        {
            Amount = Amount + 1500;
        }

        System.out.println("Total Fine Amount : "+Amount);

        sobj.close();
    }
}