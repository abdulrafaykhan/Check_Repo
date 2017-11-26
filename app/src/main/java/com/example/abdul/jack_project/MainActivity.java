package com.example.abdul.jack_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!et1.getText().toString().equals("rafay"))
                {
                    Toast.makeText(MainActivity.this, "Wrong Username", Toast.LENGTH_SHORT).show();
                }

                else if (!et2.getText().toString().equals("hello"))
                {
                    Toast.makeText(MainActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, Dashboard_Activity.class);
                    startActivity(intent);
                }
            }

        });

    }

}
