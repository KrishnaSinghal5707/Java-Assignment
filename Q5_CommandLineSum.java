public class CommandLineSum {
    public static void main(String[] args) {
        double sum = 0;
        
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.println("Skipping non-numeric argument: " + arg);
            }
        }
        
        System.out.println("Sum of command line arguments: " + sum);
    }
}
