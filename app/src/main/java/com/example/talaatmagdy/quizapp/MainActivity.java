package com.example.talaatmagdy.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.talaatmagdy.quizapp.R.string.Q3;

public class MainActivity extends AppCompatActivity {

    int numberOfAnswer = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitanswer(View view)
    {
        //Question 1
        RadioButton Q1A1 = (RadioButton)findViewById(R.id.Q1A1);
        RadioButton Q1A2 = (RadioButton)findViewById(R.id.Q1A2);

        if(Q1A1.isChecked() )
        {
            numberOfAnswer = numberOfAnswer + 1;
        }

        //Question 2
        RadioButton Q2A1 = (RadioButton)findViewById(R.id.Q2A1);
        RadioButton Q2A2 = (RadioButton)findViewById(R.id.Q2A2);
        RadioButton Q2A3 = (RadioButton)findViewById(R.id.Q2A3);
        RadioButton Q2A4 = (RadioButton)findViewById(R.id.Q2A4);

        if(Q2A1.isChecked() == true)
        {
            numberOfAnswer = numberOfAnswer + 1;
        }

        //Question 3
        EditText Q3A1 = (EditText)findViewById(R.id.Q3A1);
        String ans3 = Q3A1.getText().toString();
        Q3A1.setText(ans3);


        if (ans3.contains( "int x"))
        {
            numberOfAnswer = numberOfAnswer + 1;
        }


        //Question 4
        CheckBox Q4A1 = (CheckBox)findViewById(R.id.Q4A1);
        CheckBox Q4A2 = (CheckBox)findViewById(R.id.Q4A2);
        CheckBox Q4A3 = (CheckBox)findViewById(R.id.Q4A3);
        CheckBox Q4A4 = (CheckBox)findViewById(R.id.Q4A4);

        if (Q4A1.isChecked() &&Q4A2.isChecked() &&Q4A3.isChecked() &&Q4A4.isChecked())
        {
            numberOfAnswer = numberOfAnswer + 1;

        }


        //Question 1
        RadioButton Q5A1 = (RadioButton)findViewById(R.id.Q5A1);
        RadioButton Q5A2 = (RadioButton)findViewById(R.id.Q5A2);

        if(Q5A2.isChecked() )
        {
            numberOfAnswer = numberOfAnswer + 1;
        }

        TextView numberOfScore=(TextView)findViewById(R.id.numberscore);
        numberOfScore.setText("" +numberOfAnswer);


        // name of student
        EditText nametext = (EditText)findViewById(R.id.nametext);
        String studentName = nametext.getText().toString();
        Q3A1.setText(ans3);
        TextView nameStudent=(TextView)findViewById(R.id.namestudent);
        nameStudent.setText("" +studentName);
        // message if score is 5

        if (numberOfAnswer == 5 )
            Toast.makeText(getApplicationContext(),"congratulations",Toast.LENGTH_LONG).show();

        // keep number
        numberOfAnswer = 0 ;

    }
}
