package com.alexsykes.roommonster.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ResultDao {
    @Query("SELECT * FROM result")
    List<Result> getAll();

    @Insert
    void insert(Result result);

    @Update
    public void update(Result result);

    @Delete
    public void delete(Result result);

    @Query("DELETE FROM result")
    public void deleteAll();
}
