package com.example.weiping_tan.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import com.android.volley.toolbox.ImageLoader;


/**
 * Created by weiping-tan on 2/1/2016.
 */
public class CustomListView extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Category> categoryItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListView(Activity activity, List<Category> categoryItems) {
        this.activity = activity;
        this.categoryItems = categoryItems;
    }

    @Override
    public int getCount() {
        return categoryItems.size();
    }

    @Override
    public Object getItem(int location) {
        return categoryItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_layout, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        TextView title = (TextView) convertView.findViewById(R.id.title_category);
        TextView desc = (TextView) convertView.findViewById(R.id.desc_category);
        TextView id = (TextView) convertView.findViewById(R.id.id_category);


        // getting movie data for the row
        Category m  = categoryItems.get(position);

        // thumbnail image

        // title
        title.setText(m.getTitle());

        // rating
        desc.setText(m.getDesc());
        id.setText(String.valueOf(m.getCategoryID()));

        // genre
//        String genreStr = "";
//        for (String str : m.getGenre()) {
//            genreStr += str + ", ";
//        }
//        genreStr = genreStr.length() > 0 ? genreStr.substring(0,
//                genreStr.length() - 2) : genreStr;
//        genre.setText(genreStr);

        // release year


        return convertView;
    }
}
