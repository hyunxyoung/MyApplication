package com.kbsc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

public class SubActivity6 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub6);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(SubActivity6.this, query, Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("SubActivity6", "onQueryTextChange"+newText);
                return true;
            }
        });

        Button btn14 = (Button) findViewById(R.id.allstores);
        Button btn15 = (Button) findViewById(R.id.streets);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.allstores:
                    {
                        Intent intent = new Intent(SubActivity6.this, SubActivity9.class);
                        startActivity(intent);
                    }
                    break;

                    case R.id.streets:
                    {
                        Intent intent = new Intent(SubActivity6.this, SubActivity10.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        btn14.setOnClickListener(listener);
        btn15.setOnClickListener(listener);
    }
}