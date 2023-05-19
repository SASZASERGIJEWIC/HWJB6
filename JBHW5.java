import java.util.Scanner;
//Напишите метод, который проверяет, является ли заданный год високосным или нет. Метод возвращает boolean
//Год, который делится на 4 без остатка, является високосным, за исключением:
//-Годов, которые делятся на 100 без остатка. Они не являются високосными, за исключением:
//-Годов, которые делятся на 400 без остатка. Они являются високосными.
//для решения используйте вложенные if-else
public class JBHW5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = checkYear(year);

        if (isLeapYear) {
            System.out.println(year + " is Leap Year");
        }else {
            System.out.println(year + " is Not Leap Year");
        }
    }
    public static boolean checkYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }

    }
}
