public class Main {
    public static void main(String[] args) {
        MarsStorage storage = new MarsStorage();

        storage.addResource("Iron", 300);
        storage.addResource("Water", 345);
        storage.addResource("Copper", 150);

        storage.printInventory();

        try {
            System.out.println("Попотка забрать 40 Iron...");
            storage.removeResource("Iron", 40);

            System.out.println("Попытка забрать 300 Iron...");
            storage.removeResource("Iron", 300);
        }
        catch (InsufficientResourcesException e) {
            System.out.println(e.getMessage());
        }
        storage.printInventory();
    }
}
