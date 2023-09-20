package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button volumeOfCylinder,volumeOfSphere,volumeOfCone,volumeOFRectangularPrism;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        volumeOfSphere=findViewById(R.id.volumeOfSphere);
        volumeOfCone=findViewById(R.id.volumeOfCone);
        volumeOfCylinder=findViewById(R.id.volumeOfCylinder);
        volumeOFRectangularPrism=findViewById(R.id.volumeOfRectangularPrism);

        Redirectors();
    }

    private void Redirectors() {
        volumeOfCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, volumeofcone.class);
                startActivity(intent);
            }
        });
        volumeOfCylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, volumeofcylinder.class);
                startActivity(intent);
            }
        });
        volumeOfSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, volumeofsphere.class);
                startActivity(intent);
            }
        });
        volumeOFRectangularPrism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, volumeofrectangularprism.class);
                startActivity(intent);
            }
        });
    }
}