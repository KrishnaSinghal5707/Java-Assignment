class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() { return value == 0.0; }
    public boolean isPositive() { return value > 0.0; }
    public boolean isNegative() { return value < 0.0; }
    
    public boolean isOdd() { return value % 2 != 0; }
    public boolean isEven() { return value % 2 == 0; }

    public boolean isPrime() {
        if (value <= 1 || value % 1 != 0) return false;
        int n = (int) value;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        if (value < 0 || value % 1 != 0) return false;
        int n = (int) value;
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
}

public class NumberDemo {
    public static void main(String[] args) {
        Number num = new Number(153);
        System.out.println("isZero = " + num.isZero());
        System.out.println("isPositive = " + num.isPositive());
        System.out.println("isNegative = " + num.isNegative());
        System.out.println("isOdd = " + num.isOdd());
        System.out.println("isEven = " + num.isEven());
        System.out.println("isPrime = " + num.isPrime());
        System.out.println("isArmstrong = " + num.isArmstrong());
    }
}
