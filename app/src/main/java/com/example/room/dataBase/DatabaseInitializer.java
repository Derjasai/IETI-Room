package com.example.room.dataBase;

import android.content.Context;

import androidx.room.Room;

import com.example.room.dao.UserDao;
import com.example.room.entities.User;

import java.util.ArrayList;
import java.util.List;

public class DatabaseInitializer {

    public static void initializeDatabase(Context context) {
        // Obtén la instancia de la base de datos utilizando el método databaseBuilder
        AppDatabase db = Room.databaseBuilder(context, AppDatabase.class, "test2").build();

        // Realiza las operaciones de acceso a la base de datos en un hilo separado
        new Thread(() -> {
            UserDao userDao = db.userDao();
            User userOne = new User();
            userOne.firstName = "John";
            userOne.lastName = "Cena";

            userDao.insertUser(userOne);
            List<User> users = userDao.getAll();
            for (User user : users){
                System.out.println(user.firstName);
            }
            // Aquí puedes realizar las operaciones de acceso a la base de datos
            // Accede a "db" y ejecuta consultas o actualizaciones
        }).start();
    }
}

