package com.kbsc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button btn5 = (Button) findViewById(R.id.bt_sell);
        Button btn6 = (Button) findViewById(R.id.bt_buy);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.bt_sell:;
                    {
                        Intent intent = new Intent(MainActivity.this, MainMainActivity.class);
                        startActivity(intent);
                    }
                    break;

                    case R.id.bt_buy:
                    {
                        Intent intent = new Intent(MainActivity.this, MainMainMainActivity.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
    }
}