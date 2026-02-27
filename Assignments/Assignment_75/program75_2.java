import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter Monthly income : ");
        int Monthly_Income = sobj.nextInt();

        System.out.println("Enter credit score : ");
        int Credit_Score = sobj.nextInt();

        System.out.println("Existing loan paid (Yes/No)");

        sobj.nextLine();
        String Loan = sobj.nextLine();

        if(Age < 0 || Monthly_Income < 0 || Credit_Score < 0)
        {
            System.out.println("Input must be non negative");
            return;
        }

        if(Loan.equalsIgnoreCase("Yes") == false && Loan.equalsIgnoreCase("No") == false)
        {
            System.out.println("Invalid input");
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age needed 21 to 60 inclusive");
            return;
        }

        if(Monthly_Income < 25000)
        {
            System.out.println("Loan Rejected : Monthly income should be >= 25000");
            return;
        }

        if(Credit_Score < 700)
        {
            System.out.println("Loan Rejected : Credit score >= 700");
            return;
        }

        if(Loan.equalsIgnoreCase("Yes") == true)
        {
            System.out.println("Loan Rejected : Must not have an existing unpaid loan");
            return;
        }

        System.out.println("Loan Approved");

        sobj.close();

    }
}