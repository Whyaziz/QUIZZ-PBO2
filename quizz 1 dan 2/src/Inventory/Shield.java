package Inventory;

public class Shield extends Item {

    private int armour;

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public Shield(String nama, int price, int armour) {
        super(nama, price);
        this.armour = armour;
    }

    @Override
    public void showDetailAttributs() {
        System.out.println("This "+super.getNama()+" protects "+getArmour());
    }

    @Override
    public void planToBuy(int jumlah) {
        System.out.println("You have to pay "+super.getPrice()*jumlah);
    }
}
