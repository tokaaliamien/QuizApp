package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcScore(View view) {

        int score = 0;

        RadioButton correct_answer1 = (RadioButton) findViewById(R.id.correct_answer1);
        RadioButton correct_answer2 = (RadioButton) findViewById(R.id.correct_answer2);
        RadioButton correct_answer3 = (RadioButton) findViewById(R.id.correct_answer3);
        RadioButton correct_answer4 = (RadioButton) findViewById(R.id.correct_answer4);

        if (correct_answer1.isChecked())
            score++;

        if (correct_answer2.isChecked())
            score++;

        if (correct_answer3.isChecked())
            score++;

        if (correct_answer4.isChecked())
            score++;

        //(customerNameEditText.grtText().toString()).equals("99")
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);

        // the answer of this question is true only when all check boxes are selected
        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked())
            score++;

        String answer6 = ((EditText) findViewById(R.id.answer6)).getText().toString();
        if ((answer6.toLowerCase()).equals("true"))
            score++;

        String message = "You scored " + score + " /6";

        Log.e("Main Activity", "Score is " + score);

        if (score == 6)
            message = "Great! " + message;
        else
            message = "Try Again, " + message;

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
}
