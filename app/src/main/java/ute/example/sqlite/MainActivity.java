package ute.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ute.example.sqlite.sqlite.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);
    }
}