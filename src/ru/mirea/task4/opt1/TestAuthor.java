package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ayn Rand", "a.rand@example.com", 'f');
        System.out.println(author1.toString());
        author1.setEmail("a.rand@example.ru");
        System.out.println(author1.toString());
    }
}
