package com.trilochan.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNotific1, btnNotific2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotific1 = findViewById(R.id.notification1);
        btnNotific2 = findViewById(R.id.notification2);

    }
}
