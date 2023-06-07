package Inventory;

public class Sword extends Item{

    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Sword(String nama, int price, int damage) {
        super(nama, price);
        this.damage = damage;
    }

    @Override
    public void showDetailAttributs() {
        System.out.println("This "+super.getNama()+" damages "+getDamage());
    }

    @Override
    public void planToBuy(int jumlah) {
        System.out.println("You have to pay "+super.getPrice()*jumlah);
    }
}
