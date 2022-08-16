package com.kbsc.myapplication;

import android.app.Activity;
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

public class SubActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button btn11 = (Button) findViewById(R.id.saleorder);
        Button btn12 = (Button) findViewById(R.id.produce);
        Button btn13 = (Button) findViewById(R.id.solo);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.saleorder:
                    {
                        Intent intent = new Intent(SubActivity2.this, SubActivity6.class);
                        startActivity(intent);
                    }
                    break;

                    case R.id.produce:
                    {
                        Intent intent = new Intent(SubActivity2.this, SubActivity7.class);
                        startActivity(intent);
                    }

                    case R.id.solo:
                    {
                        Intent intent = new Intent(SubActivity2.this, SubActivity8.class);
                        startActivity(intent);
                    }
                    break;
                }
            }
        };
        btn11.setOnClickListener(listener);
        btn12.setOnClickListener(listener);
        btn13.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(SubActivity2.this, query, Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("MainActivity", "onQueryTextChange: " + newText);
                return true;
            }
        });
        return true;
    }
}
