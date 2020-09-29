package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Spinner spinner;
    TextView titleText;
    ArrayList<String> colors;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner = findViewById(R.id.spinnerColor);
        listView = findViewById(R.id.myListView);
        titleText = findViewById(R.id.txtTitle);

        colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("gray");
        colors.add("green");
        colors.add("dark gray");
        colors.add("light gray");
        colors.add("white");
        colors.add("cyan");
        colors.add("black");

        //ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, colors);


        final BaseAdapter colorsAdapter = new ColorsAdapter(this, colors);
        //spinner.setAdapter(colorsAdapter);
        listView.setAdapter(colorsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                titleText.setText(parent.getItemAtPosition(position).toString());

                View myLayout = findViewById(R.id.myLayout);
                if(listView.getItemAtPosition(position).equals("red"))
                {
                    myLayout.setBackgroundColor(Color.RED);
                }
                else if (listView.getItemAtPosition(position).equals("blue"))
                {
                    myLayout.setBackgroundColor(Color.BLUE);
                }
                else if (listView.getItemAtPosition(position).equals("yellow"))
                {
                    myLayout.setBackgroundColor(Color.YELLOW);
                }
                else if (listView.getItemAtPosition(position).equals("gray"))
                {
                    myLayout.setBackgroundColor(Color.GRAY);
                }
                else if (listView.getItemAtPosition(position).equals("green"))
                {
                    myLayout.setBackgroundColor(Color.GREEN);
                }
                else if (listView.getItemAtPosition(position).equals("dark gray"))
                {
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }
                else if (listView.getItemAtPosition(position).equals("light gray"))
                {
                    myLayout.setBackgroundColor(Color.LTGRAY);
                }
                else if (listView.getItemAtPosition(position).equals("white"))
                {
                    myLayout.setBackgroundColor(Color.WHITE);
                }
                else if (listView.getItemAtPosition(position).equals("cyan"))
                {
                    myLayout.setBackgroundColor(Color.CYAN);
                }
                else if (listView.getItemAtPosition(position).equals("black"))
                {
                    myLayout.setBackgroundColor(Color.BLACK);
                }
            }
        });


    }
}