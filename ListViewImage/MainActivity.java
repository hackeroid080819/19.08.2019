package com.example.listviewimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listviewTitle = {
                "Black Bar Burger",
                "Pizza Hut",
                "Black Bar Burger",
                "Pizza Hut",
        };
        String[] listviewShortDescription = {
                "Bar restaurant, Burgers and more. The finest pieces of fresh Israeli meat cooked to perfection, create the winning Black burger",
                "Region: Tel Aviv and Center, Restaurant / Food Type: Dairy, Address: Hanchsol 22",
                "Bar restaurant, Burgers and more. The finest pieces of fresh Israeli meat cooked to perfection, create the winning Black burger",
                "Region: Tel Aviv and Center, Restaurant / Food Type: Dairy, Address: Hanchsol 22"
        };
        int[] listviewImag = { R.drawable.d1, R.drawable.d2, R.drawable.d1, R.drawable.d2};

        List<HashMap<String, String>> fullDictionary = new ArrayList<HashMap<String, String>>();
        String keyForTitle = "KEY_FOR_TITLE";
        String keyForDesc = "KEY_FOR_DESC";
        String keyForImage = "KEY_FOR_IMAGE";
        for (int i = 0; i < listviewTitle.length; i++)
        {
            HashMap<String, String> dic = new HashMap<>();
            dic.put(keyForTitle, listviewTitle[i]);
            dic.put(keyForDesc, listviewShortDescription[i]);
            dic.put(keyForImage, String.valueOf(listviewImag[i]));
            fullDictionary.add(dic);
        }
        String[] from = {keyForTitle, keyForDesc, keyForImage};
        int[] to = {R.id.listview_item_title, R.id.listview_item_short_description,
                        R.id.listview_image};
        ListView lv = findViewById(R.id.myListView);
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                getBaseContext(), fullDictionary, R.layout.activity_listview, from, to);
        lv.setAdapter(simpleAdapter);
    }
}
