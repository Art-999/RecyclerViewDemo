package com.example.arturmusayelyan.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 02.11.2017.
 */

public class MyCustomAdapter1 extends ArrayAdapter<String> {
    Context context;
    String[] titlesArray;
    String[] descriptionsArray;
    int[] imagesArray;

    public MyCustomAdapter1(Context context, String titles[], String[] descriptions, int[] images) {
        super(context, R.layout.single_row_for_customadapter1, R.id.textView1_ForCustomAdapter1, titles);
        this.context = context;
        this.titlesArray = titles;
        this.descriptionsArray = descriptions;
        this.imagesArray = images;
    }

    class ViewHolder1 {
        TextView myTitle;
        TextView myDescription;
        ImageView myImage;

        public ViewHolder1(View view) {
            myTitle = view.findViewById(R.id.textView1_ForCustomAdapter1);
            myDescription = view.findViewById(R.id.textView2_ForCustomAdapter1);
            myImage = view.findViewById(R.id.imageView_ForCustomAdapter1);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        ViewHolder1 viewHolder=null;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row_for_customadapter1, parent, false);

            viewHolder=new ViewHolder1(row);
            row.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder1) row.getTag();
        }

        viewHolder.myTitle.setText(titlesArray[position]);
        viewHolder.myDescription.setText(descriptionsArray[position]);
        viewHolder.myImage.setBackgroundResource(imagesArray[position]);

        return row;
    }
}
