package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.room.dao.UserDao;
import com.example.room.dataBase.AppDatabase;
import com.example.room.dataBase.DatabaseInitializer;
import com.example.room.entities.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseInitializer.initializeDatabase(getApplicationContext());


    }
}