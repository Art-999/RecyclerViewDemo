package com.example.arturmusayelyan.recyclerviewdemo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActiviti1 extends AppCompatActivity {
    ListView listView;
    String[] titles;
    String[] descriptions;
    int[] images = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_activiti1);
        listView = (ListView) findViewById(R.id.listView1);

        Resources resources = getResources();
        titles = resources.getStringArray(R.array.title);
        descriptions = resources.getStringArray(R.array.description);

        MyCustomAdapter1 adapter1 = new MyCustomAdapter1(this, titles, descriptions, images);
        listView.setAdapter(adapter1);
    }
}
