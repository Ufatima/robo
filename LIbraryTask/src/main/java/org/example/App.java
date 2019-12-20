package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import org.example.Model.Book;


public class App {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("no file path given");
            System.exit(0);
        } else {
            String directory = args[0];
            File file = new File(directory);

            BufferedReader br = new BufferedReader(new FileReader(file));
            ArrayList<Book> books = new ArrayList<>();
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                String[] strings = st.split(",");
                String bookName = strings[0].trim();
                String writerName = strings[1].trim();
                String isbn = strings[2].trim();
                Book book = new Book(bookName, writerName, isbn);
                books.add(book);
                books.sort((o1, o2) -> o1.getBookName().compareToIgnoreCase(o2.getBookName()));
            }
            String s;
            while (true) {
                boolean breakLoop = false;
                System.out.println("1) Add new book");
                System.out.println("2) Print current database content in ascending order by writer’s name");
                System.out.println("Q) Exit the program");
                Scanner scanner = new Scanner(System.in);
                s = scanner.nextLine().trim().toLowerCase();
                switch (s) {
                case "1":
                    Book newBook = addBook();
                    System.out.println("Do you want to add the book to list?" + "yes" + '\n' + "no");
                    Scanner sc = new Scanner(System.in);
                    String op = sc.nextLine();
                    if (op.equals("yes")) {
                        books.add(newBook);
                        books.sort((o1, o2) -> o1.getBookName().compareToIgnoreCase(o2.getBookName()));
                        System.out.println("Book added");

                    } else {
                        System.out.println("Book not added");
                    }

                    break;
                case "2":
                    books.forEach(System.out::println);
                    break;
                case "q":
                    breakLoop = true;
                    break;
                }
                if (breakLoop) {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    public static Book addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's name");
        String bookName = sc.nextLine();
        System.out.println("Enter writer's name");
        String writerName = sc.nextLine();
        System.out.println("Enter ISBN");
        String isbn = sc.nextLine();
        Book book = new Book(bookName, writerName, isbn);
        return book;
    }
}