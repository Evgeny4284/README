import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Россия", "Москва"), 150);
        costPerAddress.put(new Address("Россия", "Казань"), 200);
        costPerAddress.put(new Address("Россия", "Новосибирск"), 300);
        costPerAddress.put(new Address("США", "Нью-Йорк"), 500);
        costPerAddress.put(new Address("Германия", "Берлин"), 400);

        int totalCost = 0;
        Set<String> uniqueCountries = new HashSet<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Заполнение нового заказа.");
                System.out.print("Введите страну: ");
                String country = scanner.nextLine();
                if ("end".equals(country)) {
                    break;
                }
                System.out.print("Введите город: ");
                String city = scanner.nextLine();
                System.out.print("Введите вес (кг): ");
                int weight = Integer.parseInt(scanner.nextLine());

                Address address = new Address(country, city);
                if (costPerAddress.containsKey(address)) {
                    int cost = costPerAddress.get(address) * weight;
                    totalCost += cost;
                    uniqueCountries.add(country);
                    System.out.println("Стоимость доставки составит: " + cost + " руб.");
                    System.out.println("Общая стоимость всех доставок: " + totalCost + " руб.");
                    System.out.println("Доставки оформлены в уникальных странах: " + uniqueCountries.size());
                } else {
                    System.out.println("Доставки по этому адресу нет");
                }
                System.out.println();
            }
        }
        System.out.println("Программа завершена");
    }
}
