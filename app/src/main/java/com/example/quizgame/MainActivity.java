package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;

    TextView t1;
    TextView q;
    TextView t2;
    TextView t3;
    TextView t4;

     int index=0,score=0;
    int ans[]={2,3,1,1,2,3,4,3,1,2};
    String  que[]={"The first mechanical computer designed by Charles Babbage was called ?",
            " Which of the following is the most powerful type of computer?",
            "Which is a single integrated circuit?","C is ?"," Web pages are written using ?",
            " Find the odd one out ?","One byte is equivalent to ?","Find the odd one out ?",
            " ROM is composed of?","The most widely used computer device is."};
    String o0[]={"Abacus","Super-micro","Gate","A third generation high level language",
            "HTTP","Oracle","1023bits","mouse","Photoelectric cells",
            "Solid state disks"};
    String o1[]={"Analytical Engine","Super conductor","chip","asambly language","HTML","INFORMIX",
            "0bits","keyboard","Floppy disks"," Internal hard disk"};
    String o2[]={"Calculator","Super computer","cpu","low level language","URL","c",
            "3bits","touch screen","Microprocessors","mouse"};
    String o3[]={"Processor","Megaframe","processer","all the above","FTP","bluej",
            "7bits","scanner","cpu","cd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        q = findViewById(R.id.q);
        t1 = findViewById(R.id.a1);
        t2 = findViewById(R.id.b1);
        t3 = findViewById(R.id.c1);
        t4 = findViewById(R.id.d1);

        b1 = findViewById(R.id.a);
        b2 = findViewById(R.id.b);
        b3 = findViewById(R.id.c);
        b4 = findViewById(R.id.d);

        q.setText(que[index]);
        t1.setText(o0[index]);
        t2.setText(o1[index]);
        t3.setText(o2[index]);
        t4.setText(o3[index]);
        if (index < 10) {



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index > 9)
                        Toast.makeText(MainActivity.this, "Your score is : " + score, Toast.LENGTH_SHORT).show();
                    else if (ans[index] == 1&& index<=9) {
                        score++;
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    } else {
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    }
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index > 9)
                        Toast.makeText(MainActivity.this, "Your score is : " + score, Toast.LENGTH_SHORT).show();

                    else if (ans[index] == 2 && index<=9) {
                        score++;
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    } else {
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    }
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index > 9)
                        Toast.makeText(MainActivity.this, "Your score is : " + score, Toast.LENGTH_SHORT).show();

                    else if (ans[index] == 3 && index<=9) {
                        score++;
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    } else {
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index > 9)
                        Toast.makeText(MainActivity.this, "Your score is : " + score, Toast.LENGTH_SHORT).show();

                    else if (ans[index] == 4 && index<=9) {
                        score++;
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    } else {
                        index += 1;
                        q.setText(que[index]);
                        t1.setText(o0[index]);
                        t2.setText(o1[index]);
                        t3.setText(o2[index]);
                        t4.setText(o3[index]);
                    }
                }
            });


        }
        else {
            Toast.makeText(MainActivity.this, "Your score is : " + score, Toast.LENGTH_SHORT).show();
        }


    }}

