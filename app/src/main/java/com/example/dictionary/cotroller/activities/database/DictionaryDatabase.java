package com.example.dictionary.cotroller.activities.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.dictionary.cotroller.activities.model.DictionaryWord;

@Database(entities = {DictionaryWord.class},version = 1)
public abstract class DictionaryDatabase extends RoomDatabase {

    public abstract DictionaryDatabaseDAO getDictionaryDatabaseDAO();

}
