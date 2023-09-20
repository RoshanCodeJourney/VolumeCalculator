package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class volumeofsphere extends AppCompatActivity {
    EditText value1;
    TextView result;
    Button ResultButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeofsphere);
        value1=findViewById(R.id.value1);
        result=findViewById(R.id.result);
        ResultButton=findViewById(R.id.ResultButton);

        Calculation();
    }

    private void Calculation() {
        ResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value1.getText().toString();
                if(val.isEmpty()){
                    Toast.makeText(volumeofsphere.this, "Fill The Fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float radius=Float.parseFloat(val);
                    Float calculation=(float) ((4/3)*(3.14*radius*radius));
                    result.setText("Volume of Sphere:"+calculation+" cubic meter");
                }
            }
        });
    }
}