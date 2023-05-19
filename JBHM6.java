import java.util.Scanner;
//Напишите метод, который определяет, является ли заданное число кратным 3, 5 или обоим и возвращает строку
public class JBHM6 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter number: ");
        int number = scanner.nextInt();

        String result = checkNumber (number);
        System.out.println(result);
    }
    public static String checkNumber (int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy3 && isDivisibleBy5) {
            return "multiples of  3 and 5";
        } else if (isDivisibleBy3) {
            return "multiples of  3";
        } else if (isDivisibleBy5) {
            return "multiples of  5";
        } else {
            return "not multiples of 3 or 5";
        }
    }
}