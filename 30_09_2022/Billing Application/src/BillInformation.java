import java.util.Date;
import java.text.*;

class BillInformation {
    private int Bill_Number;
    private String Customer_Number;
    private float Bill_Amount;
    private String Bill_Date;

    SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");

    BillInformation(int bill_number, String customer_number,Float bill_amount)
    {
        this.Bill_Number = bill_number;
        this.Customer_Number = customer_number;
        this.Bill_Amount = bill_amount;
        this.Bill_Date = format.format(new Date());
    }
    public int getBill_Number() {
        return Bill_Number;
    }

    public void setBill_Number(int bill_Number) {
        Bill_Number = bill_Number;
    }

    public String getCustomer_Number() {
        return Customer_Number;
    }

    public void setCustomer_Number(String customer_Number) {
        Customer_Number = customer_Number;
    }

    public float getBill_Amount() {
        return Bill_Amount;
    }

    public void setBill_Amount(float bill_Amount) {
        Bill_Amount = bill_Amount;
    }

    public String getBill_Date() {
        return Bill_Date;
    }

    public void setBill_Date(String bill_Date) {
        Bill_Date = bill_Date;
    }
}

