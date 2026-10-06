/**
 * Name:        Mehmet İşbilir
 * Student ID:  240446010
 * Date:        5.10.2026
 */

package game.inventory;

public class Inventory {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayAll() {
        System.out.println("\n--- Inventory Listing ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-14s | %-8s | Stock: %d%n", items[i].getName(), items[i].getGenre(), items[i].getStockCount());
        }
    }

    public void auditSerialCodes() {
        System.out.println("\n--- Serial Code Audit ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-14s -> %s%n", items[i].getName(), items[i].getSerialCode());
        }
    }
}