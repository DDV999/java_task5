import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число и нажмите Enter: ");
        int number = scan.nextInt();
        System.out.println("Таблица умножения от 1 до 10 для введенного числа:");
        System.out.printf("1 х %d = %d \n", number, number);
        System.out.printf("2 х %d = %d \n", number, 2*number);
        System.out.printf("3 х %d = %d \n", number, 3*number);
        System.out.printf("4 х %d = %d \n", number, 4*number);
        System.out.printf("5 х %d = %d \n", number, 5*number);
        System.out.printf("6 х %d = %d \n", number, 6*number);
        System.out.printf("7 х %d = %d \n", number, 7*number);
        System.out.printf("8 х %d = %d \n", number, 8*number);
        System.out.printf("9 х %d = %d \n", number, 9*number);
        System.out.printf("10 х %d = %d \n", number, 10*number);
        scan.close();
    }
}