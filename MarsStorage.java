import java.util.Map;
import java.util.HashMap;

public class MarsStorage implements Storage {
    private Map<String, Integer> inventory = new HashMap<>();

    @Override
    public void addResource(String name, int amount){
        inventory.put(name, inventory.getOrDefault(name, 0) + amount);
        System.out.println("Added resource " + name + "-" + amount + "cnt " + " to mars storage");
    }

    @Override
    public void removeResource(String name, int amount){

    }

    @Override
    public void printInventory() {

    }

}
