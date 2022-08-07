package com.kbsc.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmain);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button btn1 = (Button) findViewById(R.id.bt_login);
        Button btn2 = (Button) findViewById(R.id.bt_join);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.bt_login:;
                    {
                        Intent intent = new Intent(MainMainActivity.this, SubActivity0.class);
                        startActivity(intent);
                    }
                    break;

                    case R.id.bt_join:
                    {
                        Intent intent = new Intent(MainMainActivity.this, SubActivity1.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
    }
}