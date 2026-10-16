import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[^0-9-]+", " ").trim();
        int[] numbers = input.isEmpty() ? new int[0] : Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int left = 0, right = numbers.length - 1; left < right; left++, right--) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
