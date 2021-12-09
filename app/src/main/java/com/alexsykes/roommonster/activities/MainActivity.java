package com.alexsykes.roommonster.activities;

import static io.reactivex.schedulers.Schedulers.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.alexsykes.roommonster.MainViewModel;
import com.alexsykes.roommonster.R;
import com.alexsykes.roommonster.data.AppDatabase;
import com.alexsykes.roommonster.data.Result;
import com.alexsykes.roommonster.data.ResultDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    ResultDao resultDao;
    List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(this, AppDatabase.class, "Result")
                .allowMainThreadQueries()
                .build();


        results =  db.resultDao().getAll();

        ResultDao resultDao = db.resultDao();
        Result result = new Result();

        result.dnf = 1;
        result.machine = "Bultaco 300";
        result.fives = 0;

        resultDao.insert(result);
    }
}