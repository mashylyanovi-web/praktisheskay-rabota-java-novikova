public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12};
        int sum = 0;
        for (int number : numbers) sum += number;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double) sum / numbers.length);
    }
}
