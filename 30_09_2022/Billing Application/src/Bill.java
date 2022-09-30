import java.util.ArrayList;
import java.util.Scanner;
class Bill{
    int billNumberAuto = 1;
    int itemNumberAuto = 1;
    ArrayList<BillInformation> billArrayList = new ArrayList<BillInformation>();
    ArrayList<ItemInformation> itemArrayList = new ArrayList<ItemInformation>();
Scanner scobject = new Scanner(System.in);
    void displayBillMenu()
    {
        System.out.println("Please select any option");
        System.out.println("1.Add a bill");
        System.out.println("2.Delete a bill");
        System.out.println("3.Search bill");
        System.out.println("4.Display All");
        System.out.println("5.Main Menu");
    }
    void displaySearchMenu()
    {
        System.out.println("Please select any option");
        System.out.println("1.Search by bill number");
        System.out.println("2.Search by customer mobile number");
        System.out.println("3.Main Menu");
    }
    void addBill(Stock st,String customer_number,int no_of_items)
    {
        itemNumberAuto = 1;
        float bill_sum_amount = 0.00f;
        for (int x = 0; x < no_of_items; x++) {
            System.out.println("Enter Item Name: ");
            String itemName = scobject.next();

            while(!st.checkStockExistance(itemName))
            {
                System.out.println("No such item exists! Please enter a valid item");
                itemName = scobject.next();
            }
            System.out.println("Enter Quantity: ");
            int itemQuantity = scobject.nextInt();
            while(!st.checkStockAvailability(itemName,itemQuantity))
            {
                System.out.println("Required quantity is not available! Please enter within the available quantity");
                itemQuantity = scobject.nextInt();
            }
            float itemUnitPrice = st.findStockPrice(itemName);
            System.out.println("Item Price: " + itemUnitPrice);
            float itemSubtotal = itemQuantity * itemUnitPrice;
            System.out.println("Sub total: " + itemSubtotal);
            itemArrayList.add(new ItemInformation(billNumberAuto,itemNumberAuto++,itemName,itemQuantity,itemUnitPrice,itemSubtotal));
                 for(int i=0;i<st.StockArraylist.size();i++)
                 {
                     if(st.StockArraylist.get(i).getItem_Description().compareTo(itemName) == 0)
                     {
                         float newQuantityTemp = st.StockArraylist.get(i).getItem_Quantity()-itemQuantity;
                         newQuantityTemp = newQuantityTemp < 0 ? 0 : newQuantityTemp;
                         st.StockArraylist.get(i).setItem_Quantity(newQuantityTemp);
                     }
                 }

            bill_sum_amount = bill_sum_amount + itemSubtotal;
        }
        billArrayList.add(new BillInformation(billNumberAuto++,customer_number,bill_sum_amount));
        System.out.println("Added successfully");
        displayBill(billNumberAuto-1);
    }
    void displayBill(int billNumber)
    {
        System.out.println("Bill Number" + "\t\t" + "Customer Number" + "\t\t\t" + "Bill Amount"+ "\t\t\t" + "Bill Date");
        for(int i=0;i<billArrayList.size();i++)
        {
            if(billArrayList.get(i).getBill_Number() == billNumber) {
                System.out.println(billArrayList.get(i).getBill_Number() + "\t\t\t\t" + billArrayList.get(i).getCustomer_Number() + "\t\t\t\t\t" + billArrayList.get(i).getBill_Amount() + "\t\t\t\t" + billArrayList.get(i).getBill_Date());
                System.out.println("Item Number" + "\t\t" + "Item Name" + "\t\t\t" + "Item Quantity" + "\t\t\t" + "Item Unit Price" + "\t\t\t" + "Item sub Total");
                for (int j = 0; j < itemArrayList.size(); j++) {
                    if(itemArrayList.get(j).getBill_Number() == billNumber)
                    System.out.println(itemArrayList.get(j).getItem_Number() + "\t\t\t\t" + itemArrayList.get(j).getItem_Name() + "\t\t\t\t" + itemArrayList.get(j).getItem_Quantity() + "\t\t\t\t\t\t" + itemArrayList.get(j).getItem_Price() + "\t\t\t\t\t" + itemArrayList.get(j).getItem_Subtotal());
                }
            }
        }
    }
    void displayAllBills()
    {
        for(int i=0;i<billArrayList.size();i++)
        {
            System.out.println("Bill Number" + "\t\t" + "Customer Number" + "\t\t\t" + "Bill Amount"+ "\t\t\t" + "Bill Date");
            System.out.println(billArrayList.get(i).getBill_Number() + "\t\t\t\t" + billArrayList.get(i).getCustomer_Number() + "\t\t\t\t\t" + billArrayList.get(i).getBill_Amount() + "\t\t\t\t" + billArrayList.get(i).getBill_Date());
            System.out.println("Item Number" + "\t\t" + "Item Name" + "\t\t\t" + "Item Quantity"+ "\t\t\t" + "Item Unit Price"+ "\t\t\t" + "Item sub Total");
            for(int j=0;j<itemArrayList.size() ;j++)
            {
                if(itemArrayList.get(j).getBill_Number() == billArrayList.get(i).getBill_Number())
                System.out.println(itemArrayList.get(j).getItem_Number() + "\t\t\t\t" + itemArrayList.get(j).getItem_Name() + "\t\t\t\t" + itemArrayList.get(j).getItem_Quantity() + "\t\t\t\t\t\t" + itemArrayList.get(j).getItem_Price()+ "\t\t\t\t" + itemArrayList.get(j).getItem_Subtotal());
            }
        }
    }
    void searchByBill(int bill_number_to_search)
    {
        boolean searchresult = false;
        System.out.println("Bill_Number" + "\t\t" + "Customer_Number" + "\t\t\t" + "Bill_Amount"+ "\t\t\t" + "Bill_Date");
        for(int i=0;i<billArrayList.size();i++) {
            if (billArrayList.get(i).getBill_Number() == (bill_number_to_search)) {
                searchresult = true;
                System.out.println(billArrayList.get(i).getBill_Number() + "\t\t\t\t" + billArrayList.get(i).getCustomer_Number() + "\t\t\t\t" + billArrayList.get(i).getBill_Amount() + "\t\t\t\t" + billArrayList.get(i).getBill_Date());
            }
        }
        if(searchresult == false)
        {
            System.out.println("No record found");
        }
    }
    void searchByCustomer(String customer_number_to_search) {
        boolean result = false;
        System.out.println("Bill_Number" + "\t\t" + "Customer_Number" + "\t\t\t" + "Bill_Amount" + "\t\t\t" + "Bill_Date");
        for (int i = 0; i < billArrayList.size(); i++) {
            if (billArrayList.get(i).getCustomer_Number().compareTo(customer_number_to_search) == 0) {
                System.out.println(billArrayList.get(i).getBill_Number() + "\t\t\t\t" + billArrayList.get(i).getCustomer_Number() + "\t\t\t\t" + billArrayList.get(i).getBill_Amount() + "\t\t\t\t" + billArrayList.get(i).getBill_Date());
                result = true;
            }
        }
        if(result == false)
            System.out.println("No record found!");
    }
    void searchByDate(String date_to_search)
    {
        boolean result = false;
        System.out.println("Bill_Number" + "\t\t" + "Customer_Number" + "\t\t\t" + "Bill_Amount" + "\t\t\t" + "Bill_Date");
        for(int i=0;i<billArrayList.size();i++) {
            if (billArrayList.get(i).getBill_Date().compareTo(date_to_search) == 0) {
                System.out.println(billArrayList.get(i).getBill_Number() + "\t\t\t\t" + billArrayList.get(i).getCustomer_Number() + "\t\t\t\t" + billArrayList.get(i).getBill_Amount()  + "\t\t\t\t" + billArrayList.get(i).getBill_Date());
                result = true;
            }
        }
        if(result == false)
            System.out.println("No record found!");
    }

  void deleteBill(int bill_number_to_delete) {
      for (int i = 0; i < billArrayList.size(); i++) {
            if(billArrayList.get(i).getBill_Number() == bill_number_to_delete)
            {
                billArrayList.remove(i);
                System.out.println("Removed successfully");
            }
      }
  }
}