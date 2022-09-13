package com.example.unitconverterall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lw , lw2;
Button btn;
EditText ed;
    ArrayAdapter<String> adapter;
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lw = (ListView) findViewById(R.id.lw1);
        lw2 = (ListView) findViewById(R.id.lw2);
        ed = (EditText) findViewById(R.id.ed);
        list = new ArrayList<>();
        list.add("Kilogram");
        list.add("Centimeter");
        list.add("meter");
        list.add("feet");
        list.add("milli meter");
        list.add("decimeter");
        adapter = new ArrayAdapter<String>(this
                , android.R.layout.simple_list_item_1,list);
        lw.setAdapter(adapter);
        lw2.setAdapter(adapter);
        converter();

    }
    public void converter(){

        lw.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(MainActivity.this,"Selected", Toast.LENGTH_SHORT).show();
            }
        });
        lw2.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(MainActivity.this,"Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}