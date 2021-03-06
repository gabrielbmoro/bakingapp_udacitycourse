package com.example.gabrielmoro.baking_app;

import android.app.Application;

import com.example.gabrielmoro.baking_app.dao.WidgetItemDAO;

public class BakingApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        WidgetItemDAO.getMyInstance().destroyAllInstances();
    }
}
