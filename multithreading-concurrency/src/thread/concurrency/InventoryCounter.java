package thread.concurrency;

public class InventoryCounter {
    private int items = 0;
    Object lock = new Object();

    /**
     * Locking the critical portion of the code using Synchronized
     */
    public void increment(){
        synchronized (lock){
            items++;
        }
    }
    public void decrement(){
        synchronized (lock){
            items--;
        }
    }
    public int getItems(){
        synchronized (lock){
            return items;
        }
    }
}
