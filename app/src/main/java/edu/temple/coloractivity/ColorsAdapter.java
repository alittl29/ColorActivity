package edu.temple.coloractivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ColorsAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> colors;

    public ColorsAdapter(Context context, ArrayList<String> arrayList)
    {
        this.context = context;
        this.colors = arrayList;
    }


    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
