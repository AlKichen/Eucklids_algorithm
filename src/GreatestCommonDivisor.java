import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter two positive integers");
        Scanner sc = new Scanner(System.in);
        try {
            int number1 = Integer.parseInt(sc.nextLine());
            int number2 = Integer.parseInt(sc.nextLine());
            sc.close();
            System.out.println("Number1: " + number1);
            System.out.println("Number2: " + number2);
            if (number1 > 0 && number2 > 0) {
                int result = GTD(number1, number2);
                System.out.println(result);
            } else {
                System.out.println("The numbers must be POSITIVE! Please try again");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("The entered data is not valid! Please try again");
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
