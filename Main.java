import taxes.UsnIncome;
import taxes.UsnIncomeMinusExpenses;
import deals.Deal;
import deals.Sale;
import deals.Expenditure;

public class Main {
    public static void main(String[] args) {
        // Задача 1: смена системы налогообложения и уплата налогов
        Company company = new Company("ООО «Ромашка»", new UsnIncome());

        company.shiftMoney(100_000);
        company.shiftMoney(-30_000);
        company.shiftMoney(0);
        company.payTaxes(); // 6% от 100000 = 6000 руб.

        company.setTaxSystem(new UsnIncomeMinusExpenses());
        company.shiftMoney(100_000);
        company.shiftMoney(-40_000);
        company.payTaxes(); // 15% от (100000 - 40000) = 9000 руб.

        // Задача 2: применение массива сделок
        Deal[] deals = {
                new Sale("Колбаса", 20_000),
                new Sale("Хлеб", 5_000),
                new Expenditure("Мука", 8_000)
        };
        int difference = company.applyDeals(deals);
        System.out.println("Разница доходов и расходов: " + difference + " руб.");
    }
}
