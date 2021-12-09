package com.alexsykes.roommonster.data;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Trial {
    @PrimaryKey(autoGenerate = true)
    public int uid;
}
