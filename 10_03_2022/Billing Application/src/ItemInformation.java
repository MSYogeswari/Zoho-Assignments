class ItemInformation {
    private int Bill_Number;
    private int Item_Number;
    private String Item_Name;
    private float Item_Quantity;
    private float Item_Price;
    private float Item_Subtotal;
    ItemInformation(int bill_number,int item_number,String item_name,float item_quantity,float price,float subtotal)
    {
        this.Bill_Number = bill_number;
        this.Item_Number = item_number;
        this.Item_Name = item_name;
        this.Item_Quantity = item_quantity;
        this.Item_Price = price;
        this.Item_Subtotal = subtotal;
    }
    int getBill_Number() {
        return Bill_Number;
    }

    void setBill_Number(int bill_Number) {
        this.Bill_Number = bill_Number;
    }

    int getItem_Number() {
        return Item_Number;
    }

    void setItem_Number(int item_Number) {
        this.Item_Number = item_Number;
    }

    String getItem_Name() {
        return Item_Name;
    }

    void setItem_Name(String item_Name) {
        this.Item_Name = item_Name;
    }

    float getItem_Quantity() {
        return Item_Quantity;
    }

    void setItem_Quantity(float item_Quantity) {
        this.Item_Quantity = item_Quantity;
    }

    float getItem_Price() {
        return Item_Price;
    }

    void setItem_Price(float item_Price) {
        this.Item_Price = item_Price;
    }

    float getItem_Subtotal() {
        return Item_Subtotal;
    }

    void setItem_Subtotal(float item_Subtotal) {
        this.Item_Subtotal = item_Subtotal;
    }
}
