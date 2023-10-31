package com.example.test_34;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.meow);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.start();
            }
        });
    }

}