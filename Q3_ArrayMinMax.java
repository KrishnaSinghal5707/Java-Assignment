public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
