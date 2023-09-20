package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class volumeofcylinder extends AppCompatActivity {

    EditText value1,value2;
    TextView result;
    Button ResultButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeofcylinder);
        value1=findViewById(R.id.value1);
        value2=findViewById(R.id.value2);
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
                if(val.isEmpty() || val2.isEmpty()){
                    Toast.makeText(volumeofcylinder.this, "Fill The Fields", Toast.LENGTH_SHORT).show();
                }
                else {

                    Float radius=Float.parseFloat(val);
                    Float height=Float.parseFloat(val2);
                    Float calculation=(float) ((3.14*radius*radius*height));
                    result.setText("Volume of Cylinder:"+calculation+" cubic meter");
                }
            }
        });
    }
}