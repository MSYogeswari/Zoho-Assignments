class StockInformation {
    private String Item_Name;
    private String Item_Description;
    private float Item_Price;
    private float Item_Quantity;

    StockInformation(String name,String desc,float price,float quantity)
    {
        this.Item_Name = name;
        this.Item_Description = desc;
        this.Item_Price = price;
        this.Item_Quantity  = quantity;
    }
    String getItem_Name()
    {
        return this.Item_Name;
    }
    String getItem_Description()
    {
        return this.Item_Description;
    }
    float getItem_Price()
    {
        return this.Item_Price;
    }

    void setItem_Name(String name)
    {
        this.Item_Name = name;
    }
    void setItem_Description(String desc) {this.Item_Description = desc;}
    void setItem_Price(float price) {this.Item_Price = price;}

    float getItem_Quantity() {
        return Item_Quantity;
    }

    void setItem_Quantity(float item_Quantity) {
        Item_Quantity = item_Quantity;
    }
}
