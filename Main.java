import 1java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> tasks = new ArrayList<>();

            while (true) {
                System.out.println("Выберите операцию:");
                System.out.println("0. Выход из программы");
                System.out.println("1. Добавить дело");
                System.out.println("2. Показать дела");
                System.out.println("3. Удалить дело по номеру");
                System.out.println("4. Удалить дело по названию");
                System.out.println("5. Удалить дело по ключевому слову");
                System.out.print("Ваш выбор: ");
                String input = scanner.nextLine();

                switch (input) {
                    case "0":
                        System.out.println("Программа завершена");
                        return;
                    case "1":
                        System.out.print("Введите название задачи: ");
                        String task = scanner.nextLine();
                        tasks.add(task);
                        System.out.println("Добавлено!");
                        printTasks(tasks);
                        break;
                    case "2":
                        printTasks(tasks);
                        break;
                    case "3":
                        System.out.print("Введите номер для удаления: ");
                        int number = Integer.parseInt(scanner.nextLine());
                        if (number < 1 || number > tasks.size()) {
                            System.out.println("Дела с таким номером нет!");
                        } else {
                            tasks.remove(number - 1);
                            System.out.println("Удалено!");
                        }
                        printTasks(tasks);
                        break;
                    case "4":
                        System.out.print("Введите задачу для удаления: ");
                        String title = scanner.nextLine();
                        if (tasks.remove(title)) {
                            System.out.println("Удалено!");
                        } else {
                            System.out.println("Дела с таким названием нет!");
                        }
                        printTasks(tasks);
                        break;
                    case "5":
                        System.out.print("Введите ключевое слово для удаления: ");
                        String keyword = scanner.nextLine();
                        // Сначала собираем задачи в отдельный список,
                        // затем удаляем их разом — коллекция не меняется во время обхода
                        List<String> toRemove = new ArrayList<>();
                        for (String t : tasks) {
                            if (t.contains(keyword)) {
                                toRemove.add(t);
                            }
                        }
                        if (toRemove.isEmpty()) {
                            System.out.println("Дел с таким ключевым словом нет!");
                        } else {
                            tasks.removeAll(toRemove);
                            System.out.println("Удалено задач: " + toRemove.size());
                        }
                        printTasks(tasks);
                        break;
                    default:
                        System.out.println("Такой операции нет!");
                        break;
                }
                System.out.println();
            }
        }
    }

    public static void printTasks(List<String> tasks) {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
