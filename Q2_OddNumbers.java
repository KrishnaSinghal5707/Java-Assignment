public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        
        for (int i = 1; i <= 100; i += 2) {
            count++;
            sum += i;
        }
        
        System.out.println("Total odd numbers between 1 and 100: " + count);
        System.out.println("Sum of these odd numbers: " + sum);
    }
}
