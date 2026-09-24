import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PasswordChecker checker = new PasswordChecker();

            try {
                System.out.print("Введите мин. длину пароля: ");
                checker.setMinLength(Integer.parseInt(scanner.nextLine()));
                System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
                checker.setMaxRepeats(Integer.parseInt(scanner.nextLine()));
            } catch (IllegalArgumentException exception) {
                System.out.println("Ошибка: " + exception.getMessage());
                System.out.println("Программа завершена");
                return;
            }

            while (true) {
                System.out.print("Введите пароль или end: ");
                String password = scanner.nextLine();
                if ("end".equals(password)) {
                    break;
                }
                if (checker.verify(password)) {
                    System.out.println("Подходит!");
                } else {
                    System.out.println("Не подходит!");
                }
            }
        }
        System.out.println("Программа завершена");
    }
}
