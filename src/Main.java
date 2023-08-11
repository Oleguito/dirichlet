import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество цветов: ");
        int n;
        try {
            n = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        /*  В худшем случае мы схватим N бусинок разного цвета
            Тогда следующая будет совпадать цветом с хотя бы одной из них */
        System.out.println("Необходимое количество бусинок: " + (n + 1));
    }
}