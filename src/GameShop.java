/**
 * Name:        Mehmet İşbilir
 * Student ID:  240446010
 * Date:        5.10.2026
 */

import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        Item i1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item i2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item i3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        inv.addItem(i1);
        inv.addItem(i2);
        inv.addItem(i3);

        inv.displayAll();

        System.out.println();
        i1.sell(4);
        i2.sell(6);

        inv.displayAll();
        inv.auditSerialCodes();
    }
}