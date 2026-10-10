import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("Размер должен быть положительным."); return; }
        int[] a = new int[n];
        int i = 0, sum = 0;
        do {
            System.out.print("Элемент " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            sum += a[i++];
        } while (i < n);
        int max = a[0], min = a[0], j = 0;
        while (j < n) {
            if (a[j] > max) max = a[j];
            if (a[j] < min) min = a[j];
            j++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
