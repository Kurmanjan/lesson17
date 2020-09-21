package com.geektech.lesson1.main;

import com.geektech.lesson1.TestRepo;

public class MainPresenter implements MainContact.Presenter {

    private MainContact.View mView;
    private MainContact.Model model;
    public MainPresenter(MainContact.View mView) {
        this.mView= mView;
        model = new MainModel();
    }

    @Override
    public void bookonClick() {
    mView.showBook(loadBook());

    }

    @Override
    public Book loadBook() {
        return model.getBookId(3);
    }
}
