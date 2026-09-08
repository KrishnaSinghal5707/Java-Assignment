import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        System.out.println("The greatest number is: " + max);
        sc.close();
    }
}
