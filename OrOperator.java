public class OrOperator {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 6) {
                System.out.printf("Skipping %d from display using continue statement\n", i);
                continue;
            }
            System.out.println(i);
        }
    }
}

