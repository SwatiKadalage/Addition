package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1=(EditText) findViewById(R.id.edittxt1);
        EditText num2=(EditText) findViewById(R.id.edittxt2);
        Button button1=(Button) findViewById(R.id.btn1);
        Button button2=(Button) findViewById(R.id.btn2);
        Button button3=(Button) findViewById(R.id.btn3);
        Button button4=(Button) findViewById(R.id.btn4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());

              Toast.makeText(getApplicationContext(),"Addition="+(x+y),Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                Toast.makeText(getApplicationContext(),"Substraction="+(x-y),Toast.LENGTH_LONG).show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                Toast.makeText(getApplicationContext(),"Multiply="+(x*y),Toast.LENGTH_LONG).show();

            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                Toast.makeText(getApplicationContext(),"Division="+(x/y),Toast.LENGTH_LONG).show();

            }
        });
    }
}