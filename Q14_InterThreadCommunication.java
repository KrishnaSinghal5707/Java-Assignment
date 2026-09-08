class Storage {
    private int value;
    private boolean hasValue = false;

    public synchronized void setValue(int value) {
        while (hasValue) {
            try { wait(); } catch (InterruptedException e) { }
        }
        this.value = value;
        System.out.println("Counter stored: " + value);
        hasValue = true;
        notify(); 
    }

    public synchronized int getValue() {
        while (!hasValue) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Printer read: " + value);
        hasValue = false;
        notify();
        return value;
    }
}

class Counter extends Thread {
    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            storage.setValue(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            storage.getValue();
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();
    }
}
