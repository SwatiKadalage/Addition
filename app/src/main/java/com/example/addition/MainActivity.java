package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText num1,num2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1=(EditText) findViewById(R.id.edittxt1);
        EditText num2=(EditText) findViewById(R.id.edittxt2);
        Button btn=(Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int x=Integer.parseInt(num1.getText().toString());
              int y=Integer.parseInt(num2.getText().toString());
              Toast.makeText(getApplicationContext(),"Addition="+(x+y),Toast.LENGTH_LONG).show();
            }
        });
    }
}