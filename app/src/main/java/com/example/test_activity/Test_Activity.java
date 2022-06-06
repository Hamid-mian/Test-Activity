package com.example.test_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import  java.util.Random;


public class Test_Activity extends AppCompatActivity {

    TextView textView1,textView2,answer;
    Button btn1,btn2,btn3,btn4,submit,next;
    int sum=0,count=0,total=1;
    TextView myMessage;
    Toast myToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater layoutInflater = getLayoutInflater();
        View myLayout=layoutInflater.inflate(R.layout.toast_layout,null);
        myMessage= myLayout.findViewById(R.id.textView);
        myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);
        setContentView(R.layout.activity_test_avtivity);
        Random rand1 =new Random();
        Random rand2 =new Random();
        int upper_bound1=50,upper_bound2=50,upper=4;
        int random1= rand1.nextInt(upper_bound1);
        int random2= rand2.nextInt(upper_bound2);
        int random3= rand2.nextInt(upper);



        next=findViewById(R.id.Next_Button1);
        textView1=findViewById(R.id.question_1);
        textView2=findViewById(R.id.question_2);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        answer=findViewById(R.id.Answer);
        textView1.setText(Integer.toString(random1));
        textView2.setText(Integer.toString(random2));
        sum=random1+random2;






        if(random3==1)
        {
            btn1.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else if(random3==2)
        {
            btn2.setText(Integer.toString(sum));
            btn1.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else if(random3==3)
        {
            btn3.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn1.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else
        {
            btn4.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn1.setText(Integer.toString(sum+5));
        }
        next.setEnabled(false);

    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1:
                if(Integer.parseInt(String.valueOf(btn1.getText()))==sum) {
                    myMessage.setText("Correct Answer");
                    myToast.show();
                    btn1.setBackgroundColor(Color.GREEN);
                    count++;
                } else {
                    myMessage.setText("Wrong Answer");
                    myToast.show();
                    btn1.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.button2:
                if(Integer.parseInt(String.valueOf(btn2.getText()))==sum)
                {
                    myMessage.setText("Correct Answer");
                    myToast.show();
                    btn2.setBackgroundColor(Color.GREEN);
                    count++;
                } else {
                    myMessage.setText("Wrong Answer");
                    myToast.show();
                    btn2.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.button3:
                if(Integer.parseInt(String.valueOf(btn3.getText()))==sum)
                {
                    myMessage.setText("Correct Answer");
                    myToast.show();
                    btn3.setBackgroundColor(Color.GREEN);
                    count++;
                } else {
                    myMessage.setText("Wrong Answer");
                    myToast.show();
                    btn3.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.button4:
                if(Integer.parseInt(String.valueOf(btn4.getText()))==sum)
                {
                    myMessage.setText("Correct Answer");
                    myToast.show();
                    btn4.setBackgroundColor(Color.GREEN);
                    count++;
                } else {
                    myMessage.setText("Wrong Answer");
                    myToast.show();
                    btn4.setBackgroundColor(Color.RED);
                }
                break;


        }

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        next.setEnabled(true);
    }
    public void next_Button(View v)
    {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);

        Random rand1 =new Random();
        Random rand2 =new Random();
        int upper_bound1=50,upper_bound2=50,upper=4;
        int random1= rand1.nextInt(upper_bound1);
        int random2= rand2.nextInt(upper_bound2);
        int random3= rand2.nextInt(upper);

        textView1.setText(Integer.toString(random1));
        textView2.setText(Integer.toString(random2));
        sum=random1+random2;
        if(random3==1)
        {
            btn1.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else if(random3==2)
        {
            btn2.setText(Integer.toString(sum));
            btn1.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else if(random3==3)
        {
            btn3.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn1.setText(Integer.toString(sum/2));
            btn4.setText(Integer.toString(sum+5));
        }else
        {
            btn4.setText(Integer.toString(sum));
            btn2.setText(Integer.toString(sum*2));
            btn3.setText(Integer.toString(sum/2));
            btn1.setText(Integer.toString(sum+5));
        }
        total++;
        btn1.setBackgroundColor(Color.BLUE);
        btn2.setBackgroundColor(Color.BLUE);
        btn3.setBackgroundColor(Color.BLUE);
        btn4.setBackgroundColor(Color.BLUE);
    }

    public void submit(View v)
    {
        submit=findViewById(R.id.submit);
        answer.setText("Your Score is:"+count+"/"+total);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        submit.setEnabled(false);
        next.setEnabled(false);
        btn1.setBackgroundColor(Color.BLUE);
        btn2.setBackgroundColor(Color.BLUE);
        btn3.setBackgroundColor(Color.BLUE);
        btn4.setBackgroundColor(Color.BLUE);

    }
}