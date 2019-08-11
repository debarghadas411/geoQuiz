package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button astrologer;
    private Button professor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        astrologer=(Button)findViewById(R.id.b1);
        astrologer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast k=Toast.makeText(MainActivity.this,R.string.correct,Toast.LENGTH_LONG);
                k.setGravity(Gravity.TOP,0,0);
                k.show();
            }
        });
        professor=(Button)findViewById(R.id.b2);
        professor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,R.string.wrong,Toast.LENGTH_LONG).show();
            }
        });

    }
}
