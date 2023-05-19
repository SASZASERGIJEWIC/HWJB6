import java.util.Scanner;
//Напишите метод, который определяет оценку студента в зависимости от полученного балла:
//90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
//Метод принимает число в качестве аргумента и возвращает строку
public class JBHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter student score: ");
        int score = scanner.nextInt();

        String grade = grade(score);
        System.out.println("The grade is: " + grade);
    }
    public static String grade(int score) {
        if (score >=90 && score <=100) {
            return "A";
        } else if (score >= 80 && score <=89) {
            return "B";
        } else if (score >= 70 && score <=79) {
            return "C";
        } else if (score >= 60 && score <=69) {
            return "D";
        } else {
            return "F";
        }
    }
}
