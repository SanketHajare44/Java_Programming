import java.util.*;

class program77_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        String wardType = null;
        int medicineBill = 0;
        int consultationFee = 0;
        String insured = null;

        int totalBill = 0;
        int insuranceCover = 0;
        int finalPay = 0;
        int roomCharge = 0;

        System.out.println("Enter Days : ");
        days = sobj.nextInt();

        System.out.println("Enter Ward type (Normal/ICU) : ");
        sobj.nextLine();
        wardType = sobj.nextLine(); 
        
        System.out.println("Enter the Medicine Bill : ");
        medicineBill = sobj.nextInt(); 
        
        System.out.println("Enter the Consultation fee : ");
        consultationFee = sobj.nextInt();

        System.out.println("Insured (Yes/No) : ");
        sobj.nextLine();
        insured = sobj.nextLine();

        if(days < 0 || consultationFee < 0 || medicineBill < 0)
        {
            System.out.println("Input Invalid");
            return;
        }

        if(wardType.equalsIgnoreCase("Normal"))
        {
            roomCharge = days * 2000;
        }
        else if(wardType.equalsIgnoreCase("ICU"))
        {
            roomCharge = days * 5000;
        }
        else
        {
            System.out.println("Invalid Ward Type");
            return;
        }

        totalBill = consultationFee + medicineBill + roomCharge;

        if(insured.equalsIgnoreCase("Yes"))
        {
            int seventyPercent = (int)(totalBill * 0.70);

            if(seventyPercent > 50000)
            {
                insuranceCover = 50000;
            }
            else
            {
                insuranceCover = seventyPercent;
            }
        }
        else
        {
            insuranceCover = 0;
        }

        finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill : " + totalBill);
        System.out.println("Insurance Cover : " + insuranceCover);
        System.out.println("Final Amount to Pay : " + finalPay);
    }
}
