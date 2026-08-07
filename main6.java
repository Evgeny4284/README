import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String spendingStr = scanner.nextLine();
                    int spending = Integer.parseInt(spendingStr);
                    spendings += spending;
                    break;
                case 3:
                    chooseTaxSystem(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции не существует");
            }
        }
        System.out.println("Программа завершена!");
    }
    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static void chooseTaxSystem(int earnings, int spendings) {
        int taxUsnEarnings = taxEarnings(earnings);
        int taxUsnEarningsMinusSpendings = taxEarningsMinusSpendings(earnings, spendings);
        if (taxUsnEarnings < taxUsnEarningsMinusSpendings) {
            int savings = taxUsnEarningsMinusSpendings - taxUsnEarnings;
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + taxUsnEarnings + " рублей");
            System.out.println("Налог на другой системе: " + taxUsnEarningsMinusSpendings + " рублей");
            System.out.println("Экономия: " + savings + " рублей");
        } else if (taxUsnEarningsMinusSpendings < taxUsnEarnings) {
            int savings = taxUsnEarnings - taxUsnEarningsMinusSpendings;
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + taxUsnEarningsMinusSpendings + " рублей");
            System.out.println("Налог на другой системе: " + taxUsnEarnings + " рублей");
            System.out.println("Экономия: " + savings + " рублей");
        } else {
            System.out.println("Можете выбрать любую систему налогообложения");
            System.out.println("Налог на УСН доходы: " + taxUsnEarnings + " рублей");
            System.out.println("Налог на УСН доходы минус расходы: " + taxUsnEarningsMinusSpendings + " рублей");
        }
    }
}
