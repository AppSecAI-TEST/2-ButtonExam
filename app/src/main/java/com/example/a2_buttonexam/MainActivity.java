package com.example.a2_buttonexam;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    ImageButton imageButton1;
    ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button1.setText("남자");
        button2 = (Button)findViewById(R.id.button2);
        button2.setText("여자");

        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton1.setBackgroundColor(Color.argb(255, 255, 255, 255));
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setBackgroundColor(Color.argb(255, 255, 255, 255));

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String text = null;

        switch(view.getId())
        {


            case R.id.button1:

                text = "당신은 남자입니다";


                break;

            case R.id.button2:

                text = "당신은 여자입니다";

                break;

            case R.id.imageButton1:

                text = "당신은 남자입니다";

                break;

            case R.id.imageButton2:

                text = "당신은 여자입니다";

                break;

        }


        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
