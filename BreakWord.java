public class BreakWord {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("Coming out of for loop when i = 5");
                break;
            }
            System.out.println(i);
        }
    }
}

