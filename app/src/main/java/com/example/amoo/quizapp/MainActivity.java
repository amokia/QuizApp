package com.example.amoo.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Question 1
    EditText questionOne_answer;
    // Question 2
    RadioButton questionTwo_choice3;
    // Question 3
    CheckBox questionThree_choice1;
    CheckBox questionThree_choice2;
    CheckBox questionThree_choice3;
    CheckBox questionThree_choice4;
    // Question 4
    EditText questionFour_answer;
    // Question 5
    RadioButton questionFive_choice1;
    // Question 6
    CheckBox questionSix_choice1;
    CheckBox questionSix_choice2;
    CheckBox questionSix_choice3;
    CheckBox questionSix_choice4;
    // Question 7
    EditText questionSeven_answer;
    // Question 8
    EditText questionEight_answer;
    // Question 9
    CheckBox questionNine_choice1;
    CheckBox questionNine_choice2;
    CheckBox questionNine_choice3;
    CheckBox questionNine_choice4;
    CheckBox questionNine_choice5;
    // Question 10
    RadioButton questionTen_choice1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        int answerOne_score;
        int answerTwo_score;
        int answerThree_score;
        int answerFour_score;
        int answerFive_score;
        int answerSix_score;
        int answerSeven_score;
        int answerEight_score;
        int answerNine_score;
        int answerTen_score;
        int final_score;

        // Question One - Correct Answer is russia
        String answerOne;
        questionOne_answer = (EditText) findViewById(R.id.questionOne_answer);
        answerOne = questionOne_answer.getText().toString().toLowerCase();
        if (answerOne.equals("russia")) {
            answerOne_score = 2;
        } else {
            answerOne_score = 0;
        }

        // Question two - Correct Answer is Democratic Republic Of Congo...choise three
        Boolean answerTwo;
        questionTwo_choice3 = (RadioButton) this.findViewById(R.id.questionTwo_choice3);
        answerTwo = questionTwo_choice3.isChecked();
        if (answerTwo) {
            answerTwo_score = 2;
        } else {
            answerTwo_score = 0;
        }

// Question 3  - Correct Answers are  David Luiz and Eden Hazard
        Boolean answerThree_choice1;
        Boolean answerThree_choice2;
        Boolean answerThree_choice3;
        Boolean answerThree_choice4;
        questionThree_choice1 = (CheckBox) this.findViewById(R.id.questionThree_choice1);
        questionThree_choice2 = (CheckBox) this.findViewById(R.id.questionThree_choice2);
        questionThree_choice3 = (CheckBox) this.findViewById(R.id.questionThree_choice3);
        questionThree_choice4 = (CheckBox) this.findViewById(R.id.questionThree_choice4);
        answerThree_choice1 = questionThree_choice1.isChecked();
        answerThree_choice2 = questionThree_choice2.isChecked();
        answerThree_choice3 = questionThree_choice3.isChecked();
        answerThree_choice4 = questionThree_choice4.isChecked();
        if (answerThree_choice1 && !answerThree_choice2 && !answerThree_choice3 && answerThree_choice4) {
            answerThree_score = 2;
        } else {
            answerThree_score = 0;
        }

// Question four - Correct Answer is Real Madrid
        String answerFour;
        questionFour_answer = (EditText) findViewById(R.id.questionFour_answer);
        answerFour = questionFour_answer.getText().toString().toLowerCase();
        if (answerFour.equals("real madrid")) {
            answerFour_score = 2;
        } else {
            answerFour_score = 0;
        }

        // Question Five - Correct Answer is Rosario...choise one
        Boolean answerFive;
        questionFive_choice1 = (RadioButton) this.findViewById(R.id.questionFive_choice1);
        answerFive = questionFive_choice1.isChecked();
        if (answerFive) {
            answerFive_score = 2;
        } else {
            answerFive_score = 0;
        }


        // Question 6  - Correct Answers are  David Luiz and Eden Hazard
        Boolean answerSix_choice1;
        Boolean answerSix_choice2;
        Boolean answerSix_choice3;
        Boolean answerSix_choice4;
        questionSix_choice1 = (CheckBox) this.findViewById(R.id.questionSix_choice1);
        questionSix_choice2 = (CheckBox) this.findViewById(R.id.questionSix_choice2);
        questionSix_choice3 = (CheckBox) this.findViewById(R.id.questionSix_choice3);
        questionSix_choice4 = (CheckBox) this.findViewById(R.id.questionSix_choice4);
        answerSix_choice1 = questionSix_choice1.isChecked();
        answerSix_choice2 = questionSix_choice2.isChecked();
        answerSix_choice3 = questionSix_choice3.isChecked();
        answerSix_choice4 = questionSix_choice4.isChecked();
        if (answerSix_choice1 && !answerSix_choice2 && answerSix_choice3 && !answerSix_choice4) {
            answerSix_score = 2;
        } else {
            answerSix_score = 0;
        }

// Question seven - Correct Answer is QATAR
        String answerSeven;
        questionSeven_answer = (EditText) findViewById(R.id.questionSeven_answer);
        answerSeven = questionSeven_answer.getText().toString().toLowerCase();
        if (answerSeven.equals("qatar")) {
            answerSeven_score = 2;
        } else {
            answerSeven_score = 0;
        }

        // Question Eight - Correct Answer is jose mourinho
        String answerEight;
        questionEight_answer = (EditText) findViewById(R.id.questionEight_answer);
        answerEight = questionEight_answer.getText().toString().toLowerCase();
        if (answerEight.equals("jose mourinho")) {
            answerEight_score = 2;
        } else {
            answerEight_score = 0;
        }

// Question Nine  - Correct Answers are  Senegal ,Tunisia and Nigeria
        Boolean answernNine_choice1;
        Boolean answerNine_choice2;
        Boolean answerNine_choice3;
        Boolean answerNine_choice4;
        Boolean answerNine_choice5;
        questionNine_choice1 = (CheckBox) this.findViewById(R.id.questionNine_choice1);
        questionNine_choice2 = (CheckBox) this.findViewById(R.id.questionNine_choice2);
        questionNine_choice3 = (CheckBox) this.findViewById(R.id.questionNine_choice3);
        questionNine_choice4 = (CheckBox) this.findViewById(R.id.questionNine_choice4);
        questionNine_choice5 = (CheckBox) this.findViewById(R.id.questionNine_choice5);
        answernNine_choice1 = questionNine_choice1.isChecked();
        answerNine_choice2 = questionNine_choice2.isChecked();
        answerNine_choice3 = questionNine_choice3.isChecked();
        answerNine_choice4 = questionNine_choice4.isChecked();
        answerNine_choice5 = questionNine_choice5.isChecked();

        if (answernNine_choice1 && !answerNine_choice2 && !answerNine_choice3 && answerNine_choice4 && answerNine_choice5) {
            answerNine_score = 3;
        } else {
            answerNine_score = 0;
        }
        // Question ten - Correct Answer is U.S.A choise one
        Boolean answerTen;
        questionTen_choice1 = (RadioButton) this.findViewById(R.id.questionTen_choice1);
        answerTen = questionTen_choice1.isChecked();
        if (answerTen) {
            answerTen_score = 1;
        } else {
            answerTen_score = 0;
        }

        // Final Score
        final_score = answerOne_score + answerTwo_score + answerThree_score + answerFour_score + answerFive_score +
                answerSix_score + answerSeven_score + answerEight_score + answerNine_score + answerTen_score;

        if (final_score == 20) {
            Toast.makeText(this, "Congraturations! You scored 20 out of 20", Toast.LENGTH_SHORT).show();

        } else if (final_score >=10) {
            Toast.makeText(this, "wow almost there . You scored " + final_score + " out of 20", Toast.LENGTH_SHORT).show();
        }
          else if (final_score >=5) {
           Toast.makeText(this, "nice trial . You scored " + final_score + " out of 20", Toast.LENGTH_SHORT).show();
    }
        else  {
            Toast.makeText(this, "Whoo! you failed drastically , you scored "+ final_score +  " out of 20", Toast.LENGTH_SHORT).show();
        }

    }

}