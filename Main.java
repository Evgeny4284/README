public class Main {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        simple.log("Программа запущена");
        simple.log("Всё работает штатно");

        Logger smart = new SmartLogger();
        smart.log("Программа запущена");
        smart.log("Пользователь ввёл данные");
        smart.log("Произошла Error при чтении файла");
        smart.log("ERROR: повторная попытка");
        smart.log("Всё работает штатно");
    }
}
