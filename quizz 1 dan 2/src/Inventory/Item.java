package Inventory;

public abstract class Item {

    private String nama;
    private int price;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String nama, int price) {
        this.nama = nama;
        this.price = price;
    }

    public abstract void showDetailAttributs();

    public abstract void planToBuy(int jumlah);
}
