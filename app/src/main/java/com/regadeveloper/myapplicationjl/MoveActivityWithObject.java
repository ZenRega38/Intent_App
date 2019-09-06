package com.regadeveloper.myapplicationjl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithObject extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        textView = findViewById(R.id.tvgw);

        MyBio biodata = getIntent().getParcelableExtra("biodata");
        textView.setText(" Nama saya " + biodata.getName() + "\n Umur saya " + biodata.getAge());
    }
}
