import java.util.Scanner;
public class main4 {
    public static int calculateCustoms(int price, int weight){
        int duty = price /100 + weight * 100;
        return duty;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здраствуйте!!!");
        System.out.print("Ввидите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Ввидите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        int duty = calculateCustoms (price, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + duty);
    }
}
