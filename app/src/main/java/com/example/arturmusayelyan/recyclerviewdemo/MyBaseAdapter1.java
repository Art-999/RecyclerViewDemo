package com.example.arturmusayelyan.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by artur.musayelyan on 03/11/2017.
 */

public class MyBaseAdapter1 extends BaseAdapter {
    Context context;
    ArrayList<SingleRow> list;

    public MyBaseAdapter1(Context context, ArrayList<SingleRow> list) {
        this.context = context;
        this.list = list;
    }

    class MyViewHolder {
        TextView myTitle;
        TextView myDescription;
        ImageView myImage;

        public MyViewHolder(View view) {
            myTitle = view.findViewById(R.id.textView1_forBaseAdapter1);
            myDescription = view.findViewById(R.id.textView2_forBaseAdapter1);
            myImage = view.findViewById(R.id.imageView_forBaseAdapter1);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder = null;
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row_for_baseadapter1, parent, false);

            viewHolder = new MyViewHolder(row);
            row.setTag(viewHolder);
        } else {
           viewHolder=(MyViewHolder)row.getTag();
        }

        viewHolder.myTitle.setText(list.get(position).title);
        viewHolder.myDescription.setText(list.get(position).description);
        viewHolder.myImage.setImageResource(list.get(position).image);

        return row;
    }
}
