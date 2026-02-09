import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MarsStorage storage = new MarsStorage();
        fileManager manager = new fileManager();

        storage.addResource("Iron", 300);
        storage.addResource("Water", 345);
        storage.addResource("Copper", 150);

        storage.printInventory();

        manager.saveThis(storage);

        try {
            System.out.println("Попотка забрать 40 Iron...");
            storage.removeResource("Iron", 40);

            System.out.println("Попытка забрать 300 Iron...");
            storage.removeResource("Iron", 300);
        } catch (InsufficientResourcesException e) {
            System.out.println(e.getMessage());
        }
        storage.printInventory();
    }
    public static class fileManager {
        private String fileName = "SavedMars.txt";

        public void saveThis(MarsStorage storage) {
            var data = storage.getInventory();

            try (PrintWriter out = new PrintWriter((new FileWriter(fileName)))){
                for (var entry : data.entrySet()){
                    out.println(entry.getKey() + ":" + entry.getValue());
                }
            }

            catch(IOException e){
                System.out.println("Ошибка записи" + e.getMessage());
            }
        }
    }
}
