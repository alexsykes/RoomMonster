package com.alexsykes.roommonster.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface TrialDao {

    @Query("SELECT * FROM trial")
    List<Trial> getAll();

    @Insert
    void insert(Trial trial);
}
