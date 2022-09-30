import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    ArrayList<StockInformation> StockArraylist = new ArrayList<StockInformation>();
    Scanner scobj = new Scanner(System.in);
    Stock()
    {
//Adding some stock by default
        StockArraylist.add(new StockInformation("R01","Moong Dhall",12.25f,100));
        StockArraylist.add(new StockInformation("R02","Rava",50f,100));
        StockArraylist.add(new StockInformation("R03","Wheat",65f,100));
        StockArraylist.add(new StockInformation("R04","Ghee",195.50f,50));
        StockArraylist.add(new StockInformation("R05","Dhall",84f,20));

    }
    void displayStockMenu() {
        System.out.println("Enter any option");
        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Update");
        System.out.println("4.Search");
        System.out.println("5.Display");
        System.out.println("6.Display empty stocks");
        System.out.println("7.Main Menu");
    }

    void addStock(String name,String desc,float price,float quantity) {

        StockArraylist.add(new StockInformation(name,desc,price,quantity));
        System.out.println("Added Successfully");
    }

    void removeStock(String stockNameToDelete) {
        boolean result = false;
        for (int i = 0; i < StockArraylist.size(); i++) {
            if (StockArraylist.get(i).getItem_Description().compareTo(stockNameToDelete) == 0) {
                result = true;
                System.out.println("Record found. Do you want to delete? yes/no");
                String deleteConfirm = scobj.next();
                if(deleteConfirm.compareTo("yes")==0) {
                    StockArraylist.remove(i);
                    System.out.println("Deleted successfully");
                }
            }
        }
        if(result == false)
        {
            System.out.println("No record found with name "+ stockNameToDelete);
            System.out.println("Available records are");
        }
    }

    void displayStock() {
        System.out.printf("%-20s%-25s%-25s%-25s\n","Item Code","Item Description","Item Quantity","Item Price");
        for(int i=0;i<StockArraylist.size();i++)
        {
            System.out.printf("%-20s%-25s%-25s%-25s\n",StockArraylist.get(i).getItem_Name(), StockArraylist.get(i).getItem_Description(),StockArraylist.get(i).getItem_Quantity(),StockArraylist.get(i).getItem_Price());
        }
    }
    void displayEmptyStock() {
        System.out.printf("%-20s%-25s%-25s%-25s\n","Item Code","Item Description","Item Quantity","Item Price");
        for(int i=0;i<StockArraylist.size();i++) {
            if (StockArraylist.get(i).getItem_Quantity() == 0) {
                System.out.printf("%-20s%-25s%-25s%-25s\n",StockArraylist.get(i).getItem_Name(), StockArraylist.get(i).getItem_Description(),StockArraylist.get(i).getItem_Quantity(),StockArraylist.get(i).getItem_Price());
            }
        }
    }

    void searchStock(String stockNameToSearch) {
        boolean result = false;
    for(int j=0;j<StockArraylist.size();j++)
    {
        if(StockArraylist.get(j).getItem_Description().compareTo(stockNameToSearch)==0)
        {
            System.out.printf("%-20s%-25s%-25s%-25s\n","Item Code","Item Description","Item Quantity","Item Price");
            System.out.printf("%-20s%-25s%-25s%-25s\n",StockArraylist.get(j).getItem_Name(),StockArraylist.get(j).getItem_Description(),StockArraylist.get(j).getItem_Quantity(),StockArraylist.get(j).getItem_Price());
            result = true;
        }
    }
    if(result == false)
        System.out.println("No result found!");
}
    void updateStockPrice(String stockNameToUpdatePrice,float priceToBeUpdated) {
        boolean result = false;
        for (int k = 0; k < StockArraylist.size(); k++) {
            if (StockArraylist.get(k).getItem_Description().compareTo(stockNameToUpdatePrice) == 0) {
                StockArraylist.get(k).setItem_Price(priceToBeUpdated);
                System.out.println("Price updated successfully");
                result = true;
            }
        }
        if(result == false)
                System.out.println("Record not found!");
    }
    void updateStockQuantity(String stockNameToUpdateQuantity,float quantityToBeUpdated) {
        boolean result = false;
        for (int k = 0; k < StockArraylist.size(); k++) {
            if (StockArraylist.get(k).getItem_Description().compareTo(stockNameToUpdateQuantity) == 0) {
                StockArraylist.get(k).setItem_Quantity(quantityToBeUpdated);
                System.out.println("Quantity updated successfully");
                result = true;
            }
        }
        if(result == false)
                System.out.println("Record not found!");
    }
    void updateStockQuantityPrice(String stockNameToUpdateQuantity,float quantityToBeUpdated,float priceToBeUpdated) {
        boolean result = false;
        for (int k = 0; k < StockArraylist.size(); k++) {
            if (StockArraylist.get(k).getItem_Description().compareTo(stockNameToUpdateQuantity) == 0) {
                StockArraylist.get(k).setItem_Quantity(quantityToBeUpdated);
                StockArraylist.get(k).setItem_Price(priceToBeUpdated);
                System.out.println("Quantity and Price updated successfully");
            }
        }
        if(result == false)
                System.out.println("Record not found!");
    }
    float findStockPrice(String itemName)
        {
            float itemPrice = 0.00f;
            for(int j=0;j<StockArraylist.size();j++)
            {
                if(StockArraylist.get(j).getItem_Description().compareTo(itemName)==0)
                {
                    itemPrice = StockArraylist.get(j).getItem_Price();
                }
            }
return itemPrice;
        }

    boolean checkStockAvailability(String itemName,float itemQuantity)
    {
        boolean checkresult = false;
        for(int j=0;j<StockArraylist.size();j++)
        {
            if(StockArraylist.get(j).getItem_Description().compareTo(itemName)==0 && StockArraylist.get(j).getItem_Quantity() >= itemQuantity) {
                checkresult = true;
            }
        }
        return checkresult;
    }

    boolean checkStockExistance(String itemName)
    {
        boolean checkresult = false;
        for(int j=0;j<StockArraylist.size();j++)
        {
            if(StockArraylist.get(j).getItem_Description().compareTo(itemName)==0) {
                checkresult = true;
            }
        }
        return checkresult;
    }
}

