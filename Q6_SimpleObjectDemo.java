class SimpleObject {
    public SimpleObject() {
        System.out.println("Hello! This message is displayed from the SimpleObject constructor.");
    }
}

public class SimpleObjectDemo {
    public static void main(String[] args) {
        // Creating an object triggers the constructor automatically
        SimpleObject obj = new SimpleObject(); 
    }
}
