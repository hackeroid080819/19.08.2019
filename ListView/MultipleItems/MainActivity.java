package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {
            "Android", "IPhone X", "Windows Phone" , "Blackberry",
            "Super MAC", "TEVA phone",
            "Android", "IPhone X", "Windows Phone" , "Blackberry",
            "Super MAC", "TEVA phone"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapter adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_list_item_1,
//                mobileArray);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, R.layout.oneitem_layout,
                R.id.label,
                mobileArray);

        ListView lv = findViewById(R.id.mobileList);
        lv.setAdapter(adapter);
    }
}
