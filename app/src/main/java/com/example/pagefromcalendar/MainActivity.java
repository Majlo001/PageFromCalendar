package com.example.pagefromcalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<PageModel> models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new PageModel(R.drawable.ic_launcher_background, "1999", "Ktoś coś itp itd"));
        models.add(new PageModel(R.drawable.ic_launcher_background, "1999", "Ktoś coś itp itd"));
        models.add(new PageModel(R.drawable.ic_launcher_background, "1999", "Ktoś coś itp itd"));

        adapter = new Adapter(models, this);


    }
}
