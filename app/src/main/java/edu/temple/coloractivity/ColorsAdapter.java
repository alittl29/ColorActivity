package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        TextView textView;
        if(convertView == null)
        {
            textView = new TextView(context);
        }
        else
        {
            textView = (TextView)convertView;
        }

        int[] colorArray = new int[10];
        colorArray[0] = Color.RED;
        colorArray[1] = Color.BLUE;
        colorArray[2] = Color.YELLOW;
        colorArray[3] = Color.GRAY;
        colorArray[4] = Color.GREEN;
        colorArray[5] = Color.DKGRAY;
        colorArray[6] = Color.LTGRAY;
        colorArray[7] = Color.WHITE;
        colorArray[8] = Color.CYAN;
        colorArray[9] = Color.BLACK;


        textView = new TextView(context);
        textView.setPadding(5,5,5,5);
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colorArray[position]);
        return textView;
    }
}
