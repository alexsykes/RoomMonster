package com.alexsykes.roommonster.data;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Result {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "rider_number")
    public int rider;

    @ColumnInfo(name = "course")
    public String course;

    @ColumnInfo(name = "class")
    public String classs;

    @ColumnInfo(name = "position")
    public String position;

    @ColumnInfo(name = "rider_name")
    public String name;

    @ColumnInfo(name = "machine")
    public String machine;

    @ColumnInfo(name = "total")
    public int total;

    @ColumnInfo(name = "ones")
    public int ones;

    @ColumnInfo(name = "twos")
    public int twos;

    @ColumnInfo(name = "threes")
    public int threes;

    @ColumnInfo(name = "fives")
    public int fives;

    @ColumnInfo(name = "missed")
    public int missed;

    @ColumnInfo(name = "trialid")
    public int trialid;

    @ColumnInfo(name = "section_scores")
    public String sectionscores;

    @ColumnInfo(name = "scores")
    public String scores;

    @ColumnInfo(name = "dnf")
    public int dnf;

    @ColumnInfo(name = "visibility")
    public int visibility;
}
