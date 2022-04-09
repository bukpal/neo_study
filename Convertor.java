package сom.neostudy.treshold;
import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Считываем выбор от пользователя для конвертации

        System.out.println("Выбери 1 или 2 или 3:");

        System.out.println("1: конвертация из 10-тичной в 16-ричную");

        System.out.println("2: конвертация из 10-тичной в 2-ичную");

        System.out.println("3: конвертация из 2-ичной в 10-тичную");

        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();
        String string = in.nextLine();

        // Читаю число которе должно быть конвертировано

        String output= "";

        System.out.println("Введите число, которое должно быть конвертировано:");

        String input = in.nextLine();

        if (choice == 1) {
            output =Integer.toString(
                    Integer.parseInt(input, 10), 16);
        }

        else if (choice == 2) {

            output =Integer.toString(
                    Integer.parseInt(input, 10), 2);

        }
        else if (choice == 3) {
            output =Integer.toString(
                    Integer.parseInt(input, 2), 10);
        }
        else {

            System.out.println("invalid entry");
        }
        System.out.println("final output=" + output);
    }
}






