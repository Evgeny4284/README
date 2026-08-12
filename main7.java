public class main7 {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой", 9);
        Book book1 = new Book("Война и мир", 1869, tolstoy, 1225);
        System.out.println("Книга: " + book1.title + " (" + book1.releaseYear + ")");
        System.out.println("Автор: " + book1.author.name + " " + book1.author.surname + ", рейтинг " + book1.author.rating);
        System.out.println("Большая книга? " + book1.isBig());
        System.out.println("Оценочная цена: " + book1.estimatePrice() + " руб.");
        System.out.println("Содержит слово \"Лев\"? " + book1.matches("Лев"));
        System.out.println();
        Author hemingway = new Author("Эрнест", "Хемингуэй", 5);
        Book book2 = new Book("Старик и море", 1952, hemingway, 96);
        System.out.println("Книга: " + book2.title + " (" + book2.releaseYear + ")");
        System.out.println("Автор: " + book2.author.name + " " + book2.author.surname + ", рейтинг " + book2.author.rating);
        System.out.println("Большая книга? " + book2.isBig());
        System.out.println("Оценочная цена: " + book2.estimatePrice() + " руб.");
        System.out.println("Содержит слово \"Хемингуэй\"? " + book2.matches("Хемингуэй"));
        System.out.println();
        Author chekhov = new Author("Антон", "Чехов", 1);
        Book book3 = new Book("Хамелеон", 1884, chekhov, 10);
        System.out.println("Книга: " + book3.title + " (" + book3.releaseYear + ")");
        System.out.println("Автор: " + book3.author.name + " " + book3.author.surname + ", рейтинг " + book3.author.rating);
        System.out.println("Большая книга? " + book3.isBig());
        System.out.println("Оценочная цена: " + book3.estimatePrice() + " руб.");
        System.out.println("Содержит слово \"Пушкин\"? " + book3.matches("Пушкин"));
    }
}
