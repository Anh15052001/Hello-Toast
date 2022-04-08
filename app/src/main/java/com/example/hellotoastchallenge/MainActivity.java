package com.example.hellotoastchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mshowCount;
    Button btn;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        mshowCount = (TextView) findViewById(R.id.textView3);
        btn = (Button) findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "hello Toast!", Toast.LENGTH_SHORT).show();

//DƯƠNG VIỆT ANH 20194220
            }
        });
    }

    public void countUp(View view){
        mCount+=1;
        if(mshowCount!=null)
        {
            mshowCount.setText(Integer.toString(mCount));
        }
    }

}