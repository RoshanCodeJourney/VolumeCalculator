package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class volumeofrectangularprism extends AppCompatActivity {
    EditText value1,value2,value3;
    TextView result;
    Button ResultButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeofrectangularprism);
        value1=findViewById(R.id.value1);
        value2=findViewById(R.id.value2);
        value3=findViewById(R.id.value3);
        result=findViewById(R.id.result);
        ResultButton=findViewById(R.id.ResultButton);

        Calculation();
    }

    private void Calculation() {
        ResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value1.getText().toString();
                String val2=value2.getText().toString();
                String val3=value3.getText().toString();
                if(val.isEmpty() || val2.isEmpty()){
                    Toast.makeText(volumeofrectangularprism.this, "Fill The Fields", Toast.LENGTH_SHORT).show();
                }
                else {

                    Float l=Float.parseFloat(val);
                    Float h=Float.parseFloat(val2);
                    Float w=Float.parseFloat(val3);

                    Float calculation=(float) (l*w*h);
                    result.setText("Volume of Rectangular Prism:"+calculation+" cubic meter");
                }
            }
        });
    }
}
