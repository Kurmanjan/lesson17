 package com.geektech.lesson1.main;

public interface MainContact  {

    interface View {
        void showBook(Book book);

    }

    interface Presenter {
        void bookonClick();
       Book loadBook();

    }

    interface Model {

        Book getBookId(int i);
    }

    }

