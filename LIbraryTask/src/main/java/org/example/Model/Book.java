package org.example.Model;

import java.math.BigInteger;

public class Book {
    String bookName;
    String writerName;
    String ISBN;

    public Book(String bookName, String writerName, String ISBN) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override public String toString() {
        return bookName + ',' + writerName + ',' + ISBN;
    }
}
