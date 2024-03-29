package com.example.myperola;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Main2WebPage.class);
                startActivity(intent);
            }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Main3Profile.class);
                startActivity(intent);
            }
        });
    }

            @Override
            public boolean onCreateOptionsMenu(Menu menu)
                {
                    // Inflate the menu; this adds items to the action bar if it is present.
                    getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
                }

             @Override
             public boolean onOptionsItemSelected(MenuItem item)
                {
                    // Handle action bar item clicks here. The action bar will
                    // automatically handle clicks on the Home/Up button, so long
                    // as you specify a parent activity in AndroidManifest.xml.
                     int id = item.getItemId();

                    //noinspection SimplifiableIfStatement
              if (id == R.id.action_settings)
                    {
                    return true;
                    }

        return super.onOptionsItemSelected(item);
    }
}
