package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("War and Piece", 900);
        Book book2 = new Book("Fathers and children", 200);
        Book book3 = new Book("Cinderella", 300);
        Book book4 = new Book("Clean code", 123);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        System.out.println("Print all books:");
        print(books, false);
        books[0] = book4;
        books[3] = book1;
        System.out.println("\nPrint book called \"Clean code\":");
        print(books, true);
    }

    public static void print(Book[] books, boolean checkName) {
        for (int i = 0; i < books.length; i++) {
            if (checkName && !books[i].getName().equals("Clean code")) {
                continue;
            }
            System.out.println("Book index: #" + i + " - " + books[i]);
        }
    }
}

