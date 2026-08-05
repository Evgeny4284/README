import java.util.Scanner;
public class main5 {
    public static int calculate(int year){
        if (year % 400 == 0){
            return 366;
        }
        else if (year % 100 == 0){
            return  365;
        }
        else if (year % 4 == 0){
            return  366;
        }
        return 365;
    }
    public static void main(String[]args){
        int i = -1;
        int days;
        int days1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввидите год в формате УУУУ ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            days1 = scanner.nextInt();
            days = calculate(year);
            i ++;
        } while (days1 == days);
        System.out.println("Неправильно! В этом году " + days + " дней.");
        System.out.print("Набрано очков: " + i);
    }
}
