import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число и нажмите Enter: ");
        int binaryNumber = scan.nextInt();
        System.out.println("Таблица умножения от 1 до 10 для введенного числа:");
        System.out.printf("1 х %d = %d \n", binaryNumber, binaryNumber);
        System.out.printf("2 х %d = %d \n", binaryNumber, 2*binaryNumber);
        System.out.printf("3 х %d = %d \n", binaryNumber, 3*binaryNumber);
        System.out.printf("4 х %d = %d \n", binaryNumber, 4*binaryNumber);
        System.out.printf("5 х %d = %d \n", binaryNumber, 5*binaryNumber);
        System.out.printf("6 х %d = %d \n", binaryNumber, 6*binaryNumber);
        System.out.printf("7 х %d = %d \n", binaryNumber, 7*binaryNumber);
        System.out.printf("8 х %d = %d \n", binaryNumber, 8*binaryNumber);
        System.out.printf("9 х %d = %d \n", binaryNumber, 9*binaryNumber);
        System.out.printf("10 х %d = %d \n", binaryNumber, 10*binaryNumber);
        scan.close();
    }
}