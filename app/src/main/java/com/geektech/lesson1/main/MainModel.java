package com.geektech.lesson1.main;

import com.geektech.lesson1.TestRepo;

public class MainModel implements MainContact.Model {

    public Book getBookById(int id) {
       return TestRepo.getBookById(id);





    }

    @Override
    public Book getBookId(int i) {
        return null;
    }
}
