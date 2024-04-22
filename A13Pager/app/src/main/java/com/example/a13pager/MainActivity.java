package com.example.a13pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

//ver 01 simple, static
//ver 02 multiple layout xmls
//ver 03 simple layout, callback

public class MainActivity extends AppCompatActivity {
    // https://www.journaldev.com/26148/android-viewpager2
    private String[] pages = {"First Screen", "Second Screen", "Third Screen"};
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        viewPager2.setAdapter(new MyViewPager2Adapter(pages));
    }
}