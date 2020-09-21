package com.geektech.lesson1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.geektech.lesson1.main.Book;
import com.geektech.lesson1.main.MainContact;
import com.geektech.lesson1.main.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContact.View {

    private MainContact.Presenter mPresenter;
    private TextView booknamtv;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
        booknamtv = findViewById(R.id.book_name_tv);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mPresenter.bookonClick();

            }
        });

    }


    @Override
    public void showBook(Book book) {
        booknamtv.setText(book.getName());


    }
}