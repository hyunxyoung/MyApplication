package com.kbsc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainMainMainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmainmain);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button btn7 = (Button) findViewById(R.id.bt_login2);
        Button btn8 = (Button) findViewById(R.id.bt_join2);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.bt_login2:;
                    {
                        Intent intent = new Intent(MainMainMainActivity.this, SubActivity2.class);
                        startActivity(intent);
                    }
                    break;

                    case R.id.bt_join2:;
                    {
                        Intent intent = new Intent(MainMainMainActivity.this, SubActivity3.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
    }
}

