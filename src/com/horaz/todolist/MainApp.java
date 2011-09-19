package com.horaz.todolist;

import android.os.Bundle;

import com.phonegap.DroidGap;

public class MainApp extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl("file:///android_asset/www/Horaz_todo_list.html");
    }
}