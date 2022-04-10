import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите два положительных целых числа");
        Scanner sc = new Scanner(System.in);
        try {
            int number1 = Integer.parseInt(sc.nextLine());
            int number2 = Integer.parseInt(sc.nextLine());
            sc.close();
            if (number1 > 0 && number2 > 0) {
                int result = GTD(number1, number2);
                System.out.println(result);
            } else {
                System.out.println("Числа должны быть ПОЛОЖИТЕЛЬНЫМИ!");
            }
        } catch (Exception e) {
            System.out.println("Введенные данные не валидны, попробуйте ещё раз.");
        }
    }

    public static int GTD(int x, int y) {
        int max = Math.max(x, y);
        int min = x == max ? y : x;
        while (min != 0) {
            int i = max % min;
            max = min;
            min = i;
        }
        return max;
    }
}
