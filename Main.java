public class Main {
    public static void main(String[] args) {
        int a = 40, b = 20;
        int add, sub, mul, div, mod;
        add = a + b;
        sub = a - b;
        mul = a * b;
        if (b != 0) {
            div = a / b;
            mod = a % b;
            System.out.println("Division of a, b is: " + div);
            System.out.println("Modulus of a, b is: " + mod);
        } else {
            System.out.println("Division by zero is undefined.");
        }
        System.out.println("Addition of a, b is: " + add);
        System.out.println("Subtraction of a, b is: " + sub);
        System.out.println("Multiplication of a, b is: " + mul);
    }
}
