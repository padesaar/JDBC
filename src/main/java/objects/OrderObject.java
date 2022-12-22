package objects;

public class OrderObject {

   //private int saleId;
    private int itemId;
    private int qtyPurchased;
    private float totalOnItem;

    public OrderObject(int itemId, int qtyPurchased, float totalOnItem) {
        this.itemId = itemId;
        this.qtyPurchased = qtyPurchased;
        this.totalOnItem = totalOnItem;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQtyPurchased() {
        return qtyPurchased;
    }

    public float getTotalOnItem() {
        return totalOnItem;
    }
}
