package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button next;
    private TextView tv;
    private int msgid;
    private Questions[] QBank=new Questions[]{
            new Questions(R.string.Q1,true),
            new Questions(R.string.Q2,true),
            new Questions(R.string.Q3,true),
            new Questions(R.string.Q4,true),
            new Questions(R.string.Q5,true),
            new Questions(R.string.Q6,true),
            new Questions(R.string.Q7,true),
            new Questions(R.string.Q8,true),
            new Questions(R.string.Q9,true),
            new Questions(R.string.Q10,true),
    };
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.tv);
        QChange();
        next=(Button)findViewById(R.id.b3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QChange();
            }
        });
        button1=(Button)findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ansCheck(true);
                Toast k=Toast.makeText(MainActivity.this,msgid,Toast.LENGTH_LONG);
                //k.setGravity(Gravity.TOP,0,0);
                k.show();
                QChange();
            }
        });
        button2=(Button)findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ansCheck(false);
                Toast.makeText(MainActivity.this,msgid,Toast.LENGTH_LONG).show();
                QChange();
            }
        });

    }

    private void QChange() {
        if(index==10){
            //intent
            Intent k=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(k);
        }
        else{
            int q=QBank[index++].getTextResId();
            tv.setText(q);
        }
    }
    private void ansCheck(boolean press){
        boolean ans=QBank[index-1].isAnswerTrue();
        if(press==ans){
            msgid=R.string.correct;
        }
        else{
            msgid=R.string.wrong;
        }

    }
}
