package com.example.arturmusayelyan.recyclerviewdemo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewWithBaseAdapter1 extends AppCompatActivity {
    ListView listView;
    ArrayList<SingleRow> resoursList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_base_adapter1);
        listView = (ListView) findViewById(R.id.listViewForBaseAdapter1);
        resoursList = new ArrayList<>();

        Resources resources = getResources();
        String[] titlesArray = resources.getStringArray(R.array.title);
        String[] descriptionsArray = resources.getStringArray(R.array.description);
        int[] imagesArray = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6, R.drawable.meme7};
        for (int i = 0; i < 7; i++) {
            resoursList.add(new SingleRow(titlesArray[i], descriptionsArray[i], imagesArray[i]));
        }

        MyBaseAdapter1 adapter = new MyBaseAdapter1(this, resoursList);
        listView.setAdapter(adapter);

    }
}
