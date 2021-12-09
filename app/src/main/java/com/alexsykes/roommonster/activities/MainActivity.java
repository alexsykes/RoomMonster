package com.alexsykes.roommonster.activities;

import static io.reactivex.schedulers.Schedulers.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.alexsykes.roommonster.MainViewModel;
import com.alexsykes.roommonster.R;
import com.alexsykes.roommonster.data.AppDatabase;
import com.alexsykes.roommonster.data.Result;
import com.alexsykes.roommonster.data.ResultDao;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    ResultDao resultDao;
    List<Result> results;
    public static final String TAG = "Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: ");
        db = Room.databaseBuilder(this, AppDatabase.class, "Result")
                .allowMainThreadQueries()
                .build();


        results =  db.resultDao().getAll();

    }


}