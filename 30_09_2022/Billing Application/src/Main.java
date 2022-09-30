import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main mainobject = new Main();
        mainobject.initiate();
    }
    void initiate() {
        try
        {
            Stock st = new Stock();
            Bill bill = new Bill();
            Validation valobject = new Validation();
            Scanner sc = new Scanner(System.in);
        int userOption, userStockOption, userBillOption;
        System.out.println("Welcome!");
        do {
            System.out.println("Please select any option!");
            System.out.println("1. Stock Management");
            System.out.println("2. Bill Entry");
            System.out.println("3. Exit");
            userOption = sc.nextInt();
            switch (userOption) {
                case 1:
                    do {
                        st.displayStockMenu();
                        userStockOption = sc.nextInt();
                        switch (userStockOption) {
                            case 1:
                                System.out.println("Enter number of stock details going to be entered");
                                int noOfStock = sc.nextInt();
                                for (int i = 0; i < noOfStock; i++) {
                                    System.out.println("Enter " + "item no " + (i + 1) + " details below: (Format: Code Description Quantity Price(/Kg))");
                                    String nameTemp = sc.next();
                                    String descTemp = sc.next();
                                    float quantityTemp = sc.nextFloat();
                                    float priceTemp = sc.nextFloat();
                                    st.addStock(nameTemp, descTemp, priceTemp,quantityTemp);
                                }
                                st.displayStock();
                                break;
                            case 2:
                                System.out.println("Enter stock name to delete");
                                String stockNameToDelete = sc.next();
                                st.removeStock(stockNameToDelete);
                                st.displayStock();
                                break;
                            case 3:
                                System.out.println("1. Update Quantity \n 2. Update Price \n 3. Update Quantity and Price \n 4. Back");
                                int userUpdateInput = sc.nextInt();
                                if(userUpdateInput == 1) {
                                    System.out.println("Enter stock name to update quantity details");
                                    String stockNameToUpdateQuantity = sc.next();
                                    System.out.println("Enter new quantity to update for " + stockNameToUpdateQuantity);
                                    float quantityToBeUpdated = sc.nextFloat();
                                    st.updateStockQuantity(stockNameToUpdateQuantity, quantityToBeUpdated);
                                    st.displayStock();
                                }
                                else if(userUpdateInput == 2)
                                {
                                    System.out.println("Enter stock name to update price details");
                                    String stockNameToUpdatePrice = sc.next();
                                    System.out.println("Enter new price to update for " + stockNameToUpdatePrice);
                                    float priceToBeUpdated = sc.nextFloat();
                                    st.updateStockPrice(stockNameToUpdatePrice, priceToBeUpdated);
                                    st.displayStock();
                                }
                                else if(userUpdateInput == 3)
                                {
                                    System.out.println("Enter stock name to update quantity and price details");
                                    String stockNameToUpdateQuantityPrice = sc.next();
                                    System.out.println("Enter new quantity to update for " + stockNameToUpdateQuantityPrice);
                                    float quantityToBeUpdated = sc.nextFloat();
                                    System.out.println("Enter new price to update for " + stockNameToUpdateQuantityPrice);
                                    float priceToBeUpdated = sc.nextFloat();
                                    st.updateStockQuantityPrice(stockNameToUpdateQuantityPrice,quantityToBeUpdated, priceToBeUpdated);
                                    st.displayStock();
                                }
                                break;
                            case 4:
                                System.out.println("Enter stock name to search: ");
                                String stockNameToSearch = sc.next();
                                st.searchStock(stockNameToSearch);
                                break;
                            case 5:
                                st.displayStock();
                                break;
                            case 6:st.displayEmptyStock();
                                break;
                                case 7:break;
                            default:
                                System.out.println("Enter valid value");
                        }
                    } while (userStockOption != 7);
                    break;
                case 2:
                    do {
                        bill.displayBillMenu();
                        userBillOption = sc.nextInt();
                        switch (userBillOption) {
                            case 1:
                                System.out.println("Enter Customer Mobile Number: ");
                                String customerNumber = sc.next();
                                while(!valobject.validateMobileNumber(customerNumber))
                                {
                                    System.out.println("Mobile Number is invalid! Please enter valid mobile number");
                                    customerNumber = sc.next();
                                }
                                System.out.println("Enter number of items to be entered for this bill");
                                int noOfItems = sc.nextInt();
                                bill.addBill(st,customerNumber, noOfItems);
                                break;
                            case 2:
                                System.out.println("Enter a bill number to delete");
                                int billNumberToDelete = sc.nextInt();
                                bill.deleteBill(billNumberToDelete);
                                break;
                            case 3:
                                bill.displaySearchMenu();
                                int searchMenuOption = sc.nextInt();
                                switch (searchMenuOption) {
                                    case 1:System.out.println("Enter a bill number to search: ");
                                        int billNumberToSearch = sc.nextInt();
                                        bill.searchByBill(billNumberToSearch);
                                        break;
                                    case 2:
                                    System.out.println("Enter a customer mobile number to search: ");
                                    String customerNumberToSearch = sc.next();
                                    bill.searchByCustomer(customerNumberToSearch);
                                    break;
                                    default:System.out.println("Enter a valid value");
                                }
                                break;
                            case 4:bill.displayAllBills();
                                break;
                            default: System.out.println("Enter a valid value");
                        }
                    } while (userBillOption != 5);
                    break;
                case 3:
                    break;
                default: System.out.println("Enter a valid value");
            }
        } while (userOption != 3);
        sc.close();
    }
        catch(Exception e)
        {
            System.out.println("Exception occurred!");
        }
    }
}