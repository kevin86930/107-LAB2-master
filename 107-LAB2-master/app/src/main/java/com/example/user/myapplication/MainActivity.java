package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    EditText gamer;
    TextView status;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioGroup radioGroup;
    Button play;
    TextView name;
    TextView winner;
    TextView myMora;
    TextView computerMora;

    int mora_gamer = -1;
    String[] MoraString = {"剪刀","石頭","布"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreat(savedInstanceState);
        setContentView(R.layout.activity_main);
        gamer = (EditText) findViewById(R.id.gamer);
        status = (TextView) findViewById(R.id.status);
        radioButton = (RadioButton) findViewById(R.id.radioButton) ;
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2) ;
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3) ;
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        play = (Button) findViewById(R.id.play);
        name = (TextView) findViewById(R.id.name);
        winner = (TextView) findViewById(R.id.winner);
        myMora = (TextView) findViewById(R.id.myMora);
        computerMora = (TextView)  findViewById(R.id.computerMora);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton;
                        mora_gamer=0;
                        break;
                    case R.id.radioButton2;
                        mora_gamer=1;
                        break;
                    case R.id.radioButton3;
                        mora_gamer = 2;
                        break;

                }
            }
        }



        );

















        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
