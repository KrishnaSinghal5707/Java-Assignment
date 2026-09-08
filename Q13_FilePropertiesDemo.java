import java.io.File;
import java.io.IOException;

public class FilePropertiesDemo {
    public static void main(String[] args) {
        // Create the directory first if it doesn't exist
        File dir = new File("C:/Java");
        if (!dir.exists()) {
            dir.mkdirs(); 
        }

        File file = new File("C:/Java/abc.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully at specified path.");
            } else {
                System.out.println("File already exists at specified path.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file. Check permissions.");
        }

        System.out.println("\n--- File Properties ---");
        System.out.println("Exists: " + file.exists());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
    }
}
