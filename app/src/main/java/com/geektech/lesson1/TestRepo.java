package com.geektech.lesson1;

import com.geektech.lesson1.main.Book;

import java.util.ArrayList;
import java.util.List;

public class TestRepo {
    public static List<Book> getBookList() {
        return new ArrayList<>();
    }

    public static Book getBookById(int  Id) {
        return new Book("book 2","");


    }
}
