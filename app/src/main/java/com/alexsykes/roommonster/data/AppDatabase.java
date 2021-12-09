package com.alexsykes.roommonster.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities =  {Result.class, Trial.class}, version = 1)
public abstract  class AppDatabase extends RoomDatabase {
    public abstract ResultDao resultDao();
    public abstract TrialDao trialDao();
}
