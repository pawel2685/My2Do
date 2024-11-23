package com.wsb.my2do.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wsb.my2do.data.models.ToDoTask

class ToDoDatabase {

    @Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
    abstract class ToDoDatabase: RoomDatabase() {

        abstract fun toDoDao(): ToDoDao

    }
}