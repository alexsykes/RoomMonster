package com.alexsykes.roommonster;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.alexsykes.roommonster.activities.MainActivity;
import com.alexsykes.roommonster.data.AppDatabase;
import com.alexsykes.roommonster.data.Result;
import com.alexsykes.roommonster.data.ResultDao;
import com.alexsykes.roommonster.data.TrialDao;

import java.util.List;

public class MainViewModel extends ViewModel {
    AppDatabase db;
    ResultDao resultDao;
    TrialDao trialDao;
    List<Result> results;

    public void init() {
        db = new AppDatabase() {
            @Override
            public ResultDao resultDao() {
                return null;
            }

            @Override
            public TrialDao trialDao() {
                return null;
            }

            @NonNull
            @Override
            protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
                return null;
            }

            @NonNull
            @Override
            protected InvalidationTracker createInvalidationTracker() {
                return null;
            }

            @Override
            public void clearAllTables() {

            }
        };
    }

    public void addResult() {
//        ResultDao resultDao = db.resultDao();
//        Result result = new Result();
//        result.dnf = 0;
//
//        resultDao.insert(result);
    }
}
