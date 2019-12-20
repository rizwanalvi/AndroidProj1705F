package com.example.practiceapp03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ListView lstCourse = findViewById(R.id.lstCourse);
        ArrayAdapter dAdapter = ArrayAdapter.createFromResource(this,R.array.lstCourses,R.layout.support_simple_spinner_dropdown_item);
        lstCourse.setAdapter(dAdapter);
        lstCourse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MenuActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
