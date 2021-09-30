package com.example.juanjomz.ejercicio5boletin3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
EditText ed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnShinrk);
        btn2=findViewById(R.id.btnGrowth);
        ed=findViewById(R.id.editText);
        btn2.setOnClickListener(x->growthText());
        btn1.setOnClickListener(x->shrinkText());
    }

    public void growthText(){
        float size=ed.getTextSize()+5;
        ed.setTextSize(TypedValue.COMPLEX_UNIT_PX,size);
    }
    public void shrinkText(){
        float size=ed.getTextSize()-5;
        ed.setTextSize(TypedValue.COMPLEX_UNIT_PX,--size);
    }
}