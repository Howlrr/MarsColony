public interface Storage {
    void addResource(String name, int amount);

    void removeResource(String name, int amount) throws Exception;

    void printInventory();
}
