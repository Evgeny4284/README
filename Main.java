public class Main {
    public static void main(String[] args) {
        SimpleAccount simple = new SimpleAccount();
        CreditAccount credit = new CreditAccount(50_000);

        // Обычный счёт: пополняем и платим
        System.out.println(simple.add(100_000)); // true
        System.out.println(simple.pay(30_000));  // true
        System.out.println(simple.pay(80_000));  // false, денег не хватает
        System.out.println("Баланс обычного счёта: " + simple.getBalance()); // 70000

        // Кредитный счёт: уходит в минус до лимита, в плюс уйти не может
        System.out.println(credit.pay(40_000));  // true, баланс -40000
        System.out.println(credit.pay(20_000));  // false, превышен лимит 50000
        System.out.println(credit.add(10_000));  // true, баланс -30000
        System.out.println(credit.add(50_000));  // false, счёт не может уходить в плюс
        System.out.println("Баланс кредитного счёта: " + credit.getBalance()); // -30000

        // Переводы в обе стороны
        System.out.println(simple.transfer(credit, 20_000)); // true
        System.out.println(credit.transfer(simple, 90_000)); // false, превышен лимит
        System.out.println("Баланс обычного счёта: " + simple.getBalance());  // 50000
        System.out.println("Баланс кредитного счёта: " + credit.getBalance()); // -10000
    }
}
