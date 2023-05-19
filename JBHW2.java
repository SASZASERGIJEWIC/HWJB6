//Напишите метод, который определяет, является ли заданное число
// чётным или нечётным и печатает ответ в консоль
public class JBHW2 {
    public static void main(String[] args) {
        int number = 22;
        checkTheNumber(number);
    }

    public static void checkTheNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("The number: " + number + " is positive");
        }else {
            System.out.println("The number: " + number + " is negative");
        }
    }

}
