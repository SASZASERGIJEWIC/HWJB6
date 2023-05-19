import java.util.Scanner;
//Напишите метод, который определяет время года (весна, лето, осень, зима) в зависимости от заданного месяца.
// используйте конструкции if-else-if. Метод принимает строку и возвращает тоже строку
public class JBHW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter number of month: ");
        String month = scanner.nextLine();

        String season = whatSeason(month);
        System.out.println("Time of year for the " + month +" is: " + season);
    }
    //В Java сравнение объектов производится с помощью метода equals ().
    // Этот метод сравнивает содержимое объектов и выводит значение типа boolean.
    // Значение true - если содержимое эквивалентно, и false - если нет.

    public static String whatSeason(String month) {
        if (month.equals("DEC") || month.equals("JAN") || month.equals("FEB")) {
            return "WINTER";

        } else if (month.equals("MAR") || month.equals("APR") || month.equals("MAY")) {
            return "SPRING";

        } else if (month.equals("JUN") || month.equals("JUL") || month.equals("AUG")) {
            return "SUMMER";

        } else if (month.equals("SEP") || month.equals("OCT") || month.equals("NOV")) {
            return "AUTUMN";

        }else {
            return "wrong month";
        }
    }
}
