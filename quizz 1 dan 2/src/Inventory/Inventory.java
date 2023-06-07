package Inventory;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Item> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    public void add(Item item){
        inventory.add(item);
        System.out.println("Item called "+item.getNama()+" has been added to Inventory");
    }
}
