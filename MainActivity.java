package com.example.user.quizquest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score,question;

    private questions mQuestions=new questions();
    private String mAnswer;
    private int mScore;
    private int mQuestionLength=mQuestions.mQuestions.length;
    ArrayList<Integer> num=new ArrayList<Integer>();

    //Random r;
    private  int r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0;i<=mQuestionLength-1;i++) num.add(i);
        Collections.shuffle(num);

        //r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);


        score.setText("Score: " + mScore);
        if (mScore>0)
            gameWin();

        updateQuestion(num.get(r),mScore);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText().equals(mAnswer)) {
                    mScore++;
                    r=mScore+1;
                    score.setText("Score: " + mScore);
                    updateQuestion(num.get(r),mScore);
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText().equals(mAnswer)) {
                    mScore++;
                    r=mScore+1;
                    score.setText("Score: " + mScore);
                    updateQuestion(num.get(r),mScore);
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText().equals(mAnswer)) {
                    mScore++;
                    r=mScore+1;
                    score.setText("Score: " + mScore);
                    updateQuestion(num.get(r),mScore);
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText().equals(mAnswer)) {
                    mScore++;
                    r=mScore+1;
                    score.setText("Score: " + mScore);
                    updateQuestion(num.get(r),mScore);
                } else {
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int num,int x){
        if(x>19)
            gameWin();
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));
        mAnswer=mQuestions.getCorrectAnswer(num);
    }

    private void  gameOver(){
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your Score is"  +  mScore  + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();

    }

    private void gameWin(){
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("You Won Congratulations! Your Score is"  +  mScore  + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });

        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();


    }


}



