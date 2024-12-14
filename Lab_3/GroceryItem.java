package POS_Machine;

import javax.xml.namespace.QName;
import java.io.Serializable;
import java.util.Date;

public class GroceryItem implements Serializable {
    private final int itemCode;
    private final String itemName;
    private double unitPrice;
    transient private int unitSizeOrWeight;
    transient private String manufacturingDate;
    transient private String expiryDate;
    transient private double discount=0;

    public GroceryItem(int itemCode,
                       String itemName,
                       double unitPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getUnitSizeOrWeight() {
        return unitSizeOrWeight;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
