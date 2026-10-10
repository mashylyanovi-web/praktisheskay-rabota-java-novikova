import java.util.Scanner;
public class Task5 {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 20: ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) System.out.println("Недопустимое значение.");
        else System.out.println(n + "! = " + factorial(n));
    }
}
