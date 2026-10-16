import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[^0-9-]+", " ").trim();
        int even = 0, odd = 0;
        if (!input.isEmpty()) {
            for (String value : input.split("\\s+")) {
                if (Integer.parseInt(value) % 2 == 0) even++;
                else odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
