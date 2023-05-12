package com.example.room.dataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.room.dao.UserDao;
import com.example.room.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
