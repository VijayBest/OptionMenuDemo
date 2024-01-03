package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.createGroup:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.videoCall:

                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.call:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

               break;

            case R.id.createChat:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

                break;

            default:
                Toast.makeText(this, "nothing", Toast.LENGTH_SHORT).show();


        }
        return super.onOptionsItemSelected(item);
    }
}