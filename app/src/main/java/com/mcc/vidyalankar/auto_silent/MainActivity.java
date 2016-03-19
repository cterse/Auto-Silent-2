package com.mcc.vidyalankar.auto_silent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView logs_textview;
    private static ImageView logs_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSettings(View view){
        Intent settings_intent = new Intent(this, SettingsActivity.class);
        startActivity(settings_intent);
    }

    public void openLogs(View view){
        Intent logs_intent = new Intent(this,LogsActivity.class);
        startActivity(logs_intent);
    }

}
