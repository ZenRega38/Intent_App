package com.regadeveloper.myapplicationjl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lanSkuy = findViewById(R.id.lanSkuy);
        lanSkuy.setOnClickListener(this);

        Button iniData = findViewById(R.id.iniData);
        iniData.setOnClickListener(this);

        Button nelpon = findViewById(R.id.nelpon);
        nelpon.setOnClickListener(this);

        Button parsel = findViewById(R.id.parsel);
        parsel.setOnClickListener(this);

        Button vIews = findViewById(R.id.vIews);
        vIews.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lanSkuy:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.iniData:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Rega Rizkan Azizan");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 15);
                startActivity(moveWithDataIntent);
                break;

            case R.id.nelpon:
                String phoneNumber = "082251947241";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.vIews:
                Intent moveViews = new Intent(MainActivity.this, ViewsActivity.class);
                startActivity(moveViews);
                break;

            case R.id.parsel:
                Intent keBioGua = new Intent(MainActivity.this, MoveActivityWithObject.class);
                MyBio bioGw = new MyBio("Rega", 15);
                keBioGua.putExtra("biodata", bioGw);
                startActivity(keBioGua);
                break;


        }
    }


}
