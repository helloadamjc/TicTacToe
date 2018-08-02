package com.example.adamc.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    String[] questionlist = {"1*1", "1*2", "1*3", "1*4", "1*5", "1*6", "1*7", "1*8", "1*9", "1*10","2*1", "2*2", "2*3", "2*4", "2*5", "2*6", "2*7", "2*8", "2*9", "2*10","3*1", "3*2", "3*3", "3*4", "3*5", "3*6", "3*7", "3*8", "3*9", "3*10","4*1", "4*2", "4*3", "4*4", "4*5", "4*6", "4*7", "4*8", "4*9", "4*10","5*1", "5*2", "5*3", "5*4", "5*5", "5*6", "5*7", "5*8", "5*9", "5*10","6*1", "6*2", "6*3", "6*4", "6*5", "6*6", "6*7", "6*8", "6*9", "6*10",
            "7*1", "7*2", "7*3", "7*4", "7*5", "7*6", "7*7", "7*8", "7*9", "7*10",
            "8*1", "8*2", "8*3", "8*4", "8*5", "8*6", "8*7", "8*8", "8*9", "8*10",
            "9*1", "9*2", "9*3", "9*4", "9*5", "9*6", "9*7", "9*8", "9*9", "9*10",
            "10*1", "10*2", "10*3", "10*4", "10*5", "10*6", "10*7", "10*8", "10*9", "10*10"};

    int[] answerlist = {1,2,3,4,5,6,7,8,9,10,
            2,4,6,8,10,12,14,16,18,20,
            3,6,9,12,15,18,21,24,27,30,
            4,8,12,16,20,24,28,32,36,40,
            5,10,15,20,25,30,35,40,45,50,
            6,12,18,24,30,36,42,48,54,60,
            7,14,21,28,35,42,49,56,63,70,
            8,16,24,32,40,48,56,64,72,80,
            9,18,27,36,45,54,63,72,81,90,
            10,20,30,40,50,60,70,80,90,100};

    int answerKey;

    boolean isWinner;

    Boolean ableToClick = false;

    String userAnswer;

    EditText answerInput;

    TextView textView;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bS;


    Boolean b1Pressed = false;
    Boolean b2Pressed = false;
    Boolean b3Pressed = false;
    Boolean b4Pressed = false;
    Boolean b5Pressed = false;
    Boolean b6Pressed = false;
    Boolean b7Pressed = false;
    Boolean b8Pressed = false;
    Boolean b9Pressed = false;


    int turns =0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bS = (Button) findViewById(R.id.buttonSubmit);


        b1.setOnClickListener(myhandler1);
        b2.setOnClickListener(myhandler2);
        b3.setOnClickListener(myhandler3);
        b4.setOnClickListener(myhandler4);
        b5.setOnClickListener(myhandler5);
        b6.setOnClickListener(myhandler6);
        b7.setOnClickListener(myhandler7);
        b8.setOnClickListener(myhandler8);
        b9.setOnClickListener(myhandler9);
        bS.setOnClickListener(myhandler10);


        textView = (TextView)findViewById(R.id.textView1);


        answerInput = (EditText) findViewById(R.id.answerInput);

        answerKey = changeQuestion();


    }



    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b1Pressed && ableToClick){
                if(turns %2 == 0){
                    b1.setText("O");
                }
                else{
                    b1.setText("X");
                }
                b1Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b2Pressed && ableToClick){
                if(turns %2 == 0){
                    b2.setText("O");
                }
                else{
                    b2.setText("X");
                }
                b2Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b3Pressed && ableToClick){
                if(turns %2 == 0){
                    b3.setText("O");
                }
                else{
                    b3.setText("X");
                }
                b3Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler4 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b4Pressed && ableToClick){
                if(turns %2 == 0){
                    b4.setText("O");
                }
                else{
                    b4.setText("X");
                }
                b4Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler5 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b5Pressed && ableToClick){
                if(turns %2 == 0){
                    b5.setText("O");
                }
                else{
                    b5.setText("X");
                }
                b5Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();

            }
        }
    };
    View.OnClickListener myhandler6 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b6Pressed && ableToClick){
                if(turns %2 == 0){
                    b6.setText("O");
                }
                else{
                    b6.setText("X");
                }
                b6Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler7 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b7Pressed && ableToClick){
                if(turns %2 == 0){
                    b7.setText("O");
                }
                else{
                    b7.setText("X");
                }
                b7Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler8 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b8Pressed && ableToClick){
                if(turns %2 == 0){
                    b8.setText("O");
                }
                else{
                    b8.setText("X");
                }
                b8Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };
    View.OnClickListener myhandler9 = new View.OnClickListener() {
        public void onClick(View v) {
            if(!b9Pressed && ableToClick){
               if(turns %2 == 0){
                   b9.setText("O");
               }
               else{
                   b9.setText("X");
                }
                b9Pressed = true;
                ableToClick = false;
                isWinner = isWinner();
                turns++;
                answerKey = changeQuestion();
            }
        }
    };

    View.OnClickListener myhandler10 = new View.OnClickListener() {
        public void onClick(View v) {

            userAnswer = answerInput.getText().toString();

            if(Integer.toString(answerlist[answerKey]).equals(userAnswer)){
                Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_LONG).show();
                ableToClick = true;
                answerInput.setText("");
            }

            else{
                turns ++;
                Toast.makeText(getApplicationContext(), "incorrect", Toast.LENGTH_LONG).show();
                answerInput.setText("");
            }

        }
    };




    public int changeQuestion(){
        int random = (int )(Math.random() * 50);


        textView.setText("What is " + questionlist[random] + " ?");

        return random;
    }


    public boolean isWinner(){
        String b1Text = b1.getText().toString();
        String b2Text = b2.getText().toString();
        String b3Text = b3.getText().toString();
        String b4Text = b4.getText().toString();
        String b5Text = b5.getText().toString();
        String b6Text = b6.getText().toString();
        String b7Text = b7.getText().toString();
        String b8Text = b8.getText().toString();
        String b9Text = b9.getText().toString();



        if(b1Text.equals("X") && b2Text.equals("X") && b3Text.equals("X") || b4Text.equals("X") && b5Text.equals("X") && b6Text.equals("X") || b7Text.equals("X") && b8Text.equals("X") && b9Text.equals("X") ||
                b1Text.equals("X") && b4Text.equals("X") && b7Text.equals("X") || b2Text.equals("X") && b5Text.equals("X") && b8Text.equals("X") || b3Text.equals("X") && b6Text.equals("X") && b9Text.equals("X")
                || b1Text.equals("X") && b5Text.equals("X") && b9Text.equals("X") || b3Text.equals("X") && b5Text.equals("X") && b7Text.equals("X")){
            Toast.makeText(getApplicationContext(), "You WIn", Toast.LENGTH_LONG).show();
            clearBoard();
            return true;
        }

        else if(b1Text.equals("O") && b2Text.equals("O") && b3Text.equals("O") || b4Text.equals("O") && b5Text.equals("O") && b6Text.equals("O") || b7Text.equals("O") && b8Text.equals("O") && b9Text.equals("O") ||
                b1Text.equals("O") && b4Text.equals("O") && b7Text.equals("O") || b2Text.equals("O") && b5Text.equals("O") && b8Text.equals("O") || b3Text.equals("O") && b6Text.equals("O") && b9Text.equals("O")
                || b1Text.equals("O") && b5Text.equals("O") && b9Text.equals("O") || b3Text.equals("O") && b5Text.equals("O") && b7Text.equals("O")){
            Toast.makeText(getApplicationContext(), "You WIn", Toast.LENGTH_LONG).show();
            clearBoard();
            return true;

        }

        Toast.makeText(getApplicationContext(), "No Winner yet", Toast.LENGTH_LONG).show();
        return false;

    }


    public void clearBoard(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        turns = 0;
        Toast.makeText(getApplicationContext(), "New Game Begins", Toast.LENGTH_LONG).show();


    }
}
