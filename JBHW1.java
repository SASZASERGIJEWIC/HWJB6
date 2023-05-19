//Напишите метод, который проверяет, является ли заданное число положительным,
// отрицательным или нулём и печатает ответ в консоль
public class JBHW1 {
    public static void main(String[] args) {
        checkTheNumber(1);
        checkTheNumber(-1);
        checkTheNumber(0);
    }
    public static void checkTheNumber(int number) {
        if (number >0) {
            System.out.println("The number: " + number + " is positive");
        } else if (number <0 ) {
            System.out.println("The number: " + number + " is negative");
        } else {
            System.out.println("The number: " + number + " is zero");
        }
    }
}
