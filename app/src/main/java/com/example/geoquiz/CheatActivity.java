package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
    private boolean ans;
    private TextView txt;
    private Button shb;
    private static int clicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        ans=getIntent().getBooleanExtra(MainActivity.key,false);
        shb=(Button)findViewById(R.id.cb);
        txt=(TextView)findViewById(R.id.txt);
        shb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans==true)
                    txt.setText(R.string.c_1);
                else
                    txt.setText(R.string.c_2);
                Intent I=new Intent();
                I.putExtra(MainActivity.show,true);
                setResult(RESULT_OK,I);
            }
        });
    }
}
